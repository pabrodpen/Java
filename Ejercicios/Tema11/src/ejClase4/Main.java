package ejClase4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		
		int opcion=0;
		Scanner scanner=new Scanner(System.in);
                
                //leemos del txt
                
                try {
                    BufferedReader in=new BufferedReader(new FileReader("src/empleados.txt"));
                    
                    
            } catch (IOException e) {
                    System.out.println(e.getMessage());
            }
		
		do {
			System.out.println("MENU");
			System.out.println("1.AÑADIR EMPLEADO");
			System.out.println("2.BUSCAR EMPLEADO");
			System.out.println("3.CAMBIAR DATOS EMPLEADO");
			System.out.println("4.LISTAR EMPLEADOS");
			System.out.println("5.LISTAR EMPLEADOS DE UN PROYECTO");
			System.out.println("6.GUARDAR Y SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			                 switch (opcion) {
                        case 1:
                            
                            break;
                       
                    }
                            
		} while (opcion!=3);
	}

}
