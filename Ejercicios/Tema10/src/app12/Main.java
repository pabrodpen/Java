package app12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("MENU");
			System.out.println("1.ESCRIBIR DATOS");
			System.out.println("2.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Nombre:");
				String nombre=scanner.next();
				System.out.print("Edad:");
				int edad=scanner.nextInt();
				
				BufferedWriter out=null;
				
				try {
					
					String rutaArchivo = "src/app12/datos.txt";
                    File archivo = new File(rutaArchivo);

                    // Verificar si el archivo no existe, entonces crearlo
                    if (!archivo.exists()) {
                        archivo.createNewFile();
                    }

					
					out=new BufferedWriter(new FileWriter(archivo));
					
					out.write(nombre+" "+edad);
					out.newLine();
					out.close();
					
					System.out.println("DATOS ESCRITOS CORRECTAMENTE");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				break;
				
			}
		} while (opcion!=2);
		
		
		

		}

}
