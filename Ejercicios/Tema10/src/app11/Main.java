package app11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Nombre para el fichero:");
		String nombre=scanner.next();
		
		BufferedWriter out=null;
		
		try {
			String fichero="src/app11/"+nombre+".txt";
			out=new BufferedWriter(new FileWriter(fichero));
			
			BufferedReader in=new BufferedReader(new FileReader(fichero));
			String linea;
			
			// Leer cada línea del archivo
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
