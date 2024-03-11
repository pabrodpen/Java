package app15;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in=null;
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		try {
			in=new BufferedReader(new FileReader("src/app15/numeros.txt"));
			String linea;
			
			while((linea=in.readLine())!=null){
				int numero=Integer.parseInt(linea);
				
				if(numero>max) {
					max=numero;
				}
				if(numero<min) {
					min=numero;
				}
			}
			
			System.out.println("MAXIMO:"+max);
			System.out.println("MINIMO:"+min);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
