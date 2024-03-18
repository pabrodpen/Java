package repaso1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numeros=new int[0];
		boolean encontrado=false;
		try {
			BufferedReader in1=new BufferedReader(new FileReader("src/repaso1/fich1.txt"));
			BufferedReader in2=new BufferedReader(new FileReader("src/repaso1/fich2.txt"));
			
			String linea1,linea2;
			
			while((linea1=in1.readLine())!=null) {
				int num1=Integer.parseInt(linea1);
				 for(int i=0;i<numeros.length && !encontrado;i++) {
					 if(num1==numeros[i]) {
						 encontrado=true;
					 }
				 }
				 
				 if(!encontrado) {
					 numeros=Arrays.copyOf(numeros, numeros.length+1);
					 numeros[numeros.length-1]=num1;
				 }else {
					 encontrado=false;
				 }
			}
			encontrado=false;
			while((linea2=in2.readLine())!=null) {
				int num2=Integer.parseInt(linea2);
				 for(int i=0;i<numeros.length && !encontrado;i++) {
					 if(num2==numeros[i]) {
						 encontrado=true;
					 }
				 }
				 
				 if(!encontrado) {
					 numeros=Arrays.copyOf(numeros, numeros.length+1);
					 numeros[numeros.length-1]=num2;
				 }else {
					 encontrado=false;
				 }
			}

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("src/repaso1/cjto.txt"));

			for(int i=0;i<numeros.length;i++) {
				out.write(String.valueOf(numeros[i]));
				out.newLine();
			}
			out.close();
			System.out.println("ESCRITO");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	

}
