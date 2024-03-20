package repaso5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] vocales={'A','E','I','O','U','a','e','i','o','u','Á','É','Í','Ó','Ú','á','é','í','ó','ú'};
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/repaso5/fichero.txt"));
			BufferedWriter out=new BufferedWriter(new FileWriter("src/repaso5/matriculas.txt"));
			
			
			String linea;
			while((linea=in.readLine())!=null) {
				int contMayus=0,contDig=0;
				String matString=linea;
				boolean hayVocal=false;
				//vemos si tiene alguna vocal
				for(int i=0;i<matString.length() && !hayVocal;i++) {
					
					for(int j=0;j<vocales.length && !hayVocal;j++) {
						if(matString.charAt(i)==vocales[j]) {
							hayVocal=true;
						}
					}
				}

				
				if(!hayVocal) {
						
					for(int i=0;i<matString.length();i++) {
							if(Character.isUpperCase(matString.charAt(i))) {
							contMayus++;
							}
								
							if(Character.isDigit(matString.charAt(i))) {
								contDig++;
							}
							
					}
								
				}
				
				
				
				
			if(contMayus==3 && contDig==4) {
				out.write(matString);
				out.newLine();
				contMayus=0;
				contDig=0;
			}
			
			
		}
				
			out.close();
			System.out.println("ESCRITO");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
