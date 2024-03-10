package res7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedWriter out=null;
		String cadena="En un lugar de la Mancha";
		try {
			out=new BufferedWriter(new FileWriter("src/res7/quijote.txt"));
			
			for(int i=0;i<cadena.length();i++) {
				out.write(cadena.charAt(i));
			}
			
			cadena="de cuyo nombre no quiero acordarme";
			out.newLine();
			out.write(cadena);
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	
	}

}
