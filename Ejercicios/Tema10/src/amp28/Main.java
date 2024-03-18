package amp28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Dime una palabra:");
		String palabra=scanner.next();
		int numVeces=0;
		
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/amp28/fichero.txt"));
			
			String linea;
			
			while((linea=in.readLine())!=null) {
				if(linea.contains(palabra)) {
					numVeces++;
				}
			}
			
			System.out.println("Numero de veces que aparece "+palabra+":"+numVeces);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
