package app13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.NoRouteToHostException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader inNum1=null,inNum2=null;
		String linea;
		BufferedWriter out=null;
		int []numeros=new int[0];
		try {
			inNum1=new BufferedReader(new FileReader("src/app13/numeros1.txt"));
			inNum2=new BufferedReader(new FileReader("src/app13/numeros2.txt"));
			out=new BufferedWriter(new FileWriter("src/app13/ordenados.txt"));
			
			while((linea=inNum1.readLine())!=null) {
				int numero=Integer.parseInt(linea);
				numeros=Arrays.copyOf(numeros, numeros.length+1);
				numeros[numeros.length-1]=numero;
				
			}
			
			while((linea=inNum2.readLine())!=null) {
				int numero=Integer.parseInt(linea);
				numeros=Arrays.copyOf(numeros, numeros.length+1);
				numeros[numeros.length-1]=numero;
				
			}
			
			
			//escrtibimos ordenado
			Arrays.sort(numeros);
			
			for(int i=0;i<numeros.length;i++) {
				out.write(String.valueOf(numeros[i]));
				out.newLine();
			}
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
