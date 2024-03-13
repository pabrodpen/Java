package app21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int opcion=0;
		String[]contactos=new String[20];
		int cont=0;
		do {
			System.out.println("1.Nuevo contacto");
			System.out.println("2.Buscar contacto por nombre");
			System.out.println("3.Mostrar todos");
			System.out.println("4.Salir");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Nombre:");
				String nombre=scanner.next();
				System.out.print("Telefono:");
				String tfno=scanner.next();
				
				contactos[cont]="Nombre:"+nombre+", telefono"+tfno;
				break;
			}
		} while (opcion!=4);
	}
	
	public static boolean buscarContacto(String n) {
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app21/agenda.txt"));
			String linea=in.readLine();
			
			while(linea!=null) {
				if(linea.contains(n)) {
					
				}
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
