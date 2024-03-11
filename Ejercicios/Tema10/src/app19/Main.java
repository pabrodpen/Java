package app19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader in=new BufferedReader(new FileReader("src/app19/fichero.txt"));
			BufferedWriter out=new BufferedWriter(new FileWriter("src/app19/modificado.txt"));
			
			String linea;
			while((linea=in.readLine())!=null) {
				String lineaCifrada=cifrado(linea);
				out.write(lineaCifrada);
				out.newLine();
			}
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static String cifrado(String cadena) {
		char[]alfabeto= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'
				,'q','r','s','t','u','v','w','x','y','z'};
		
		char[]cifrado= {'e','m','s','r','c','y','j','n','f','x','i','w','t','a','k','o'
				,'z','d','l','q','v','b','h','u','p','g'};
		
		String nuevo="";
		
		for(int i=0;i<cadena.length();i++) {
			int pos=encontrarLetra(cadena.charAt(i), alfabeto);

			if(pos>=0) {
				nuevo+=cifrado[pos];
			}else {//si el caracter no esta en el alfabeto, lo dejamos como esta
				nuevo+=cadena.charAt(i);
			}
			
		}
		
		return nuevo;
	}
	
	public static int encontrarLetra(char c,char[]alf) {
		int pos=-1;
		for(int i=0;i<alf.length;i++) {
			if(alf[i]==c) {
				pos=i;
			}
		}
		return pos;
	}
}
