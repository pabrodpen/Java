package app20;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader infich1=new BufferedReader(new FileReader("src/app20/fichero1.txt"));
			BufferedReader infich2=new BufferedReader(new FileReader("src/app20/fichero2.txt"));

			String linea1,linea2;
			boolean iguales=true;
			int contLineas=0;
			int pos=-1;
			while((linea1=infich1.readLine())!=null && iguales) {
				
				linea2=infich2.readLine();
				boolean encontrado=false;
				if(linea1.compareTo(linea2)!=0) {
					for(int i=0;i<linea1.length() && !encontrado;i++) {
						if(linea1.charAt(i)!=linea2.charAt(i)) {
							pos=i;
							encontrado=true;
						}
					}
					iguales=false;
				}
				
				contLineas++;
			}
			
			if(iguales) {
				System.out.println("Los 2 ficheros son iguales");
			}else {
				System.out.println("Diferencia en la linea "+contLineas+", caracter "+pos);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		
	}

}
