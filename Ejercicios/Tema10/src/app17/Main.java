package app17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Numero de lineas en la que se va a dividir el fichero:");
		int lineas=scanner.nextInt(); 
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app17/fichero.txt"));
			int contLineas=0;
			String linea;
			
			
			while((linea=in.readLine())!=null) {
				System.out.println(linea);
				contLineas++;
				if(contLineas >= lineas) {
					System.out.println("SIGUIENTE SECUENCIA DE LINEAS");
					contLineas=0;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
