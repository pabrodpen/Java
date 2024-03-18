package app24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int opcion=0;
		Registro[]registros=new Registro[0];
		
		//escribimos la cabecera del txt
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("src/app24/registros.txt"));
			out.write("Fecha\t\tTemperatura maxima\t\tTemperatura minima");
			out.newLine();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		do {
			System.out.println("1.Registrar nueva temperatura");
			System.out.println("2.Mostrar historial de registros");
			System.out.println("3.Salir");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Fecha del registro(dd-MM-yyyy):");
				String fechaString=scanner.next();
				System.out.print("Temperatura maxima:");
				double maximo=scanner.nextDouble();
				System.out.print("Temperatura minima:");
				double minima=scanner.nextDouble();
				
				
				registros=Arrays.copyOf(registros, registros.length+1);
				registros[registros.length-1]=new Registro(fechaString, maximo, minima);
				break;
			
			case 2:
				try {
					BufferedReader in=new BufferedReader(new FileReader("src/app24/registros.txt"));
					
					String linea;
					in.readLine();//nos saltamos la cabecera
					System.out.println("REGISTROS");
					while((linea=in.readLine())!=null) {
						System.out.println(linea);
					}
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			
			case 3:
				try {
					BufferedWriter out=new BufferedWriter(new FileWriter("src/app24/registros.txt",true));
					for(int i=0;i<registros.length;i++) {
						out.write(registros[i].toString());
						out.newLine();
						
					}
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (opcion!=3);
	
	}

}
