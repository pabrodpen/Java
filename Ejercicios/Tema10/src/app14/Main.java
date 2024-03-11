package app14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		String linea;
		int contCarac=0,contLineas=0,contPalabras=0;
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app14/carta.txt"));

			while((linea=in.readLine())!=null) {
				String[]aux=linea.split(" ");
				contPalabras+=aux.length;
				for(int i=0;i<aux.length;i++) {
					contCarac+=aux[i].length();
				}
				contLineas++;
			}
			
			
			System.out.println("NUMERO DE LINEAS:"+contLineas);
			System.out.println("NUMERO DE PALABRAS:"+contPalabras);
			System.out.println("NUMERO DE LETRAS:"+contCarac);

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

}
