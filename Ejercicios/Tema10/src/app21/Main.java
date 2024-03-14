package app21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
				
				if(!estaEnAgenda(nombre)) {
					contactos[cont]="Nombre:"+nombre+", telefono:"+tfno;
					cont++;
				}else {
					System.out.println("El contacto ya esta en la agenda");
				}
				break;
				
			case 2:
				System.out.print("Nombre del contacto:");
				 nombre=scanner.next();
				buscarContacto(nombre);
				break;
				
			case 3:
				mostrar();
				break;
			case 4:
				escribirContactos(contactos,cont);
				break;
			}
		} while (opcion!=4);
	}
	
	public static void buscarContacto(String n) {
		boolean encontrado=false;

		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app21/agenda.txt"));
			String linea;
			
			while((linea=in.readLine())!=null) {
				if(linea.contains(n)) {
					System.out.println(linea);
					encontrado=true;
				}
			}
			
			if(!encontrado) {
				System.out.println("No se ha encontrado el contacto");
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static boolean estaEnAgenda(String n) {
		boolean encontrado=false;
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app21/agenda.txt"));
			String linea;
			
			while((linea=in.readLine())!=null && !encontrado) {
				if(linea.contains(n)) {
					encontrado=true;
					break;
				}
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return encontrado;
	}

	
	public static void mostrar() {
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app21/agenda.txt"));
			String linea;
			
			while((linea=in.readLine())!=null) {
				System.out.println(linea);
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void escribirContactos(String[]arr,int c) {
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("src/app21/agenda.txt",true));
			for(int i=0;i<c;i++) {
				out.write(arr[i]);
				out.newLine();
			}
			out.close();
			System.out.println("Contactos guardados");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
