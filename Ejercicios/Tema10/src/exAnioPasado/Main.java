package exAnioPasado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//coger reparaciones de los 4 txt
		//add,elim,modif precio reparacion
		//listar taller
		
		//escribir todas las reparaciones en el conj txt y cada vez que se inicie 
		//el menu coger todas las reparaciones de cjto txt
		
		Reparacion reparacion;
		ConjReparaciones conjReparaciones=new ConjReparaciones();
		
		
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		
		try {
			BufferedReader in1=new BufferedReader(new FileReader("src/exAnioPasado/taller1.txt"));
			BufferedReader in2=new BufferedReader(new FileReader("src/exAnioPasado/taller2.txt"));
			BufferedReader in3=new BufferedReader(new FileReader("src/exAnioPasado/taller3.txt"));
			BufferedReader in4=new BufferedReader(new FileReader("src/exAnioPasado/taller4.txt"));

			
			
			
			String linea,mat="",descripcion="";
			double precio;
			int contLineas=0;
			
			//taller1.txt
			while((linea=in1.readLine())!=null) {
					if(contLineas==0) {
						mat=linea;
						contLineas++;
					}else if(contLineas==1) {
						descripcion=linea;
						contLineas++;
					}else {
						precio=Double.parseDouble(linea);
						reparacion=new Reparacion(mat, descripcion, precio);
						conjReparaciones.addReparacion(reparacion);
						contLineas=0;
					}
			}
			
			
			contLineas=0;
			//taller2.txt
			while((linea=in2.readLine())!=null) {
					if(contLineas==0) {
						mat=linea;
						contLineas++;
					}else if(contLineas==1) {
						descripcion=linea;
						contLineas++;
					}else {
						precio=Double.parseDouble(linea);
						reparacion=new Reparacion(mat, descripcion, precio);
						conjReparaciones.addReparacion(reparacion);
						contLineas=0;
					}
				}
			
			contLineas=0;
			//taller3.txt
			while((linea=in3.readLine())!=null) {
					if(contLineas==0) {
						mat=linea;
						contLineas++;
					}else if(contLineas==1) {
						descripcion=linea;
						contLineas++;
					}else {
						precio=Double.parseDouble(linea);
						reparacion=new Reparacion(mat, descripcion, precio);
						conjReparaciones.addReparacion(reparacion);
						contLineas=0;
					}
				}
		
			
			contLineas=0;
			//taller4.txt
			while((linea=in4.readLine())!=null) {
					if(contLineas==0) {
						mat=linea;
						contLineas++;
					}else if(contLineas==1) {
						descripcion=linea;
						contLineas++;
					}else {
						precio=Double.parseDouble(linea);
						reparacion=new Reparacion(mat, descripcion, precio);
						conjReparaciones.addReparacion(reparacion);
						contLineas=0;
					}
				}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		do {
			System.out.println("MENU DE GESTION DE REPARACIONES");
			System.out.println("1.ALTA REPARACION");
			System.out.println("2.BAJA REPARACION");
			System.out.println("3.MODIFICAR PRECIO");
			System.out.println("4.LISTAR REPARACIONES");
			System.out.println("5.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Matricula del coche:");
				String matricula=scanner.next();
				System.out.print("Descripcion de la reparacion:");
				String descripcion=scanner.next();
				System.out.print("Precio de la reparacion");
				double precio=scanner.nextDouble();
				
				if(conjReparaciones.buscarReparacion(matricula,descripcion,precio)<0) {
					reparacion=new Reparacion(matricula, descripcion, precio);
					conjReparaciones.addReparacion(reparacion);
				}
				
				break;
				
			case 2:
				System.out.print("Matricula del coche:");
				 matricula=scanner.next();
				System.out.print("Descripcion de la reparacion:");
				 descripcion=scanner.next();
				System.out.print("Precio de la reparacion");
				 precio=scanner.nextDouble();
				
				 if(conjReparaciones.buscarReparacion(matricula,descripcion,precio)<0) {
						int pos=conjReparaciones.buscarReparacion(matricula,descripcion,precio);
						conjReparaciones.rmReparacion(pos);
				}else {
					System.out.println("La reparacion no existe");
				}
				break;
				
			case 3:
				System.out.print("Matricula del coche:");
				 matricula=scanner.next();
				System.out.print("Descripcion de la reparacion:");
				 descripcion=scanner.next();
				 scanner.nextLine();
				System.out.print("Precio de la reparacion");
				 precio=scanner.nextDouble();
				
				 int pos = conjReparaciones.buscarReparacion(matricula, descripcion, precio);
				    if (pos >= 0) {
				        System.out.print("Nuevo precio de la reparacion:");
				        double nuevoPrecio = scanner.nextDouble();
				        conjReparaciones.reparaciones[pos].setPrecio(nuevoPrecio);
				        System.out.println("Precio cambiado");
				    } else {
				        System.out.println("La reparacion no existe");
				    }
				    break;
				
			case 4:
				System.out.println("LISTADO DE REPARACIONES ORDENADO POR MATRICULA");
				Arrays.sort(conjReparaciones.reparaciones);
				System.out.println(Arrays.toString(conjReparaciones.reparaciones));
				break;
				
			case 5:
				try {
					BufferedWriter out=new BufferedWriter(new FileWriter("src/exAnioPasado/conjTalleres.txt"));
					for(int i=0;i<conjReparaciones.reparaciones.length;i++) {
						reparacion=conjReparaciones.reparaciones[i];
						out.write(reparacion.getMatricula());
						out.newLine();
						out.write(reparacion.getDescripcion());
						out.newLine();
						out.write(String.valueOf(reparacion.getPrecio()));
						out.newLine();
					}
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		} while (opcion!=5);
	}

}
