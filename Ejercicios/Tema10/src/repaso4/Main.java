package repaso4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Longitud de palabra:");
		int longitud=scanner.nextInt();

		try {
			BufferedReader in=new BufferedReader(new FileReader("src/repaso4/fichero.txt"));
			BufferedWriter outMay=new BufferedWriter(new FileWriter("src/repaso4/mayores.txt",true));
			BufferedWriter outMin=new BufferedWriter(new FileWriter("src/repaso4/menores.txt",true));

			String linea;
			
			while((linea=in.readLine())!=null) {
				String[]aux=linea.split(" ");
				for(int i=0;i<aux.length;i++) {
					if(aux[i].length()>=longitud) {
						outMay.write(aux[i]+",");
					}else {
						outMin.write(aux[i]+",");
					}
				}
			}
			outMay.close();
			outMin.close();
			System.out.println("ESCRITO");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
