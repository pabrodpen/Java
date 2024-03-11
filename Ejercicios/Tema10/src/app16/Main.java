package app16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int opcion=0;
		
		do {
			System.out.println("1.MOSTRAR LIBRO");
			System.out.println("2.INSERTAR NOMBRE");
			System.out.println("3.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				try {
					BufferedReader in=new BufferedReader(new FileReader("src/app16/firmas.txt"));
					
					String linea;
					System.out.println("LIBRO DE FIRMAS");
					while((linea=in.readLine())!=null) {
						System.out.println(linea);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getLocalizedMessage());
				}
				
			break;
			
			case 2:
				try {
					System.out.print("Nombre:");
					String nombre=scanner.next();
					
					if(!buscarFirma(nombre)) {
						BufferedWriter out=new BufferedWriter(new FileWriter("src/app16/firmas.txt",true));
						out.write(nombre);
						out.newLine();
						out.close();
					}else {
						System.out.println("El nombre ya esta en el libro");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		} while (opcion!=3);
		
		
	}

	public static boolean buscarFirma(String f) {
		boolean encontrado=false;
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app16/firmas.txt"));
			
			String linea;
			while((linea=in.readLine())!=null && !encontrado) {
				if(linea.compareTo(f)==0) {
					encontrado=true;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		
		return encontrado;
	}
}
