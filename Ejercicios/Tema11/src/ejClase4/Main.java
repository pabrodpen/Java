package ejClase4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		Empleado empleado;
		int opcion=0;
		Scanner scanner=new Scanner(System.in);
                String[]numProyectos=new String[0];
                //leemos del txt
                String nombre=null,puesto=null,apellido=null;
                int edad=0;
                double sueldo=0;
                
                CjtoEmpleados cjtoEmpleados=new CjtoEmpleados();
                try {
                    BufferedReader in=new BufferedReader(new FileReader("src/ejClase4/empleados.txt"));
                    
                    String linea;
                    int contLineas=1;
                    while((linea=in.readLine())!=null){
                        if(contLineas==1){
                            String[]aux=linea.split(" ");
                            nombre=aux[0];
                            apellido=aux[1];
                        }else if(contLineas==2){
                            edad=Integer.parseInt(linea);
                        }else if(contLineas==3){
                            puesto=linea;
                            
                        }else if(contLineas==4){
                            sueldo=Double.parseDouble(linea);
                   
                        }else if(linea.startsWith("-")){
                            empleado=new Empleado(nombre, apellido, edad,sueldo,puesto);
                            
                            for(int i=0;i<numProyectos.length;i++){
                                empleado.addProyecto(numProyectos[i]);
                            }
                            cjtoEmpleados.addEmpleado(empleado);
                            numProyectos=new String[0];
                            contLineas=0;//para saltarnos la linea del ----
                        }else{
                            numProyectos=Arrays.copyOf(numProyectos, numProyectos.length+1);
                            numProyectos[numProyectos.length-1]=linea;
                        }
                        contLineas++;
                         
                    }
                    
            } catch (IOException e) {
                    System.out.println(e.getMessage());
            }
                
                
             //escribimos en el .dat
             try {
                 ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/ejClase4/empleados.dat"));
                 
                 out.writeObject(cjtoEmpleados);
                 out.close();
            } catch (IOException e) {
                 System.out.println(e.getLocalizedMessage());
            }
             
             
             //leemos del .dat
             
             CjtoEmpleados cjtoEmpleadosBinario=new CjtoEmpleados();
             try {
                 ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/ejClase4/empleados.dat"));
                 
                cjtoEmpleadosBinario=(CjtoEmpleados) in.readObject();
                 
            } catch (IOException e) {
                 System.out.println(e.getLocalizedMessage());
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
		
		do {
			System.out.println("MENU");
			System.out.println("1.BUSCAR EMPLEADO");
			System.out.println("2.LISTAR EMPLEADOS");
			System.out.println("3.LISTAR EMPLEADOS DE UN PROYECTO");
                        System.out.println("4.EMPLEADO CON MAYOR Y MENOR SUELDO");
			System.out.println("5.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			                 switch (opcion) {
                        case 1:
                            System.out.print("Nombre del empleado:");
                             nombre=scanner.next();
                            System.out.print("Apellido:");
                             apellido=scanner.next();
                             int posEmpleado=cjtoEmpleadosBinario.buscarEmpleado(nombre, apellido);
                             
                             if(posEmpleado>=0){
                                 System.out.println(cjtoEmpleadosBinario.empleados[posEmpleado]);
                             }else{
                                 System.out.println("Empleado no encontrado");
                             }
                             
                            break;
                            
                        case 2:
                            for(int i=0;i<cjtoEmpleadosBinario.empleados.length;i++){
                                empleado=cjtoEmpleadosBinario.empleados[i];
                                System.out.println(empleado.toString());
                                System.out.println(empleado.proyectos.toString());
                            }
                            break;
                            
                        case 3:
                            scanner.nextLine();
                            System.out.print("Nombre del proyecto:");
                           String proyecto=scanner.nextLine();
                            
                            for(int i=0;i<cjtoEmpleadosBinario.empleados.length;i++){
                                empleado=cjtoEmpleadosBinario.empleados[i];
                                
                                for(int j=0;j<empleado.proyectos.length;j++){
                                    if(proyecto.equals(empleado.proyectos[j].nombre)){
                                        System.out.println(empleado.toString());
                                    }
                                }
                            }
                            break;
                          
                        case 4:
                            double max=Integer.MIN_VALUE;
                            double min=Integer.MAX_VALUE;
                            
                            Empleado empMax=null,empMin=null;
                            
                            for(int i=0;i<cjtoEmpleadosBinario.empleados.length;i++){
                                empleado=cjtoEmpleadosBinario.empleados[i];
                                if(empleado.sueldo>=max){
                                    max=empleado.sueldo;
                                    empMax=empleado;
                                }
                                
                                if(empleado.sueldo<=min){
                                    min=empleado.sueldo;
                                    empMin=empleado;
                                }
                            }
                            
                            
                            System.out.println("Empleados con mayor sueldo:"+empMax.toString());
                            System.out.println("Empleados con menor sueldo:"+empMin.toString());

                            break;
                    }
                            
		} while (opcion!=5);
	}

}
