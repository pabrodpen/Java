package repaso3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]lineas=new String[0];
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/repaso3/fichero.txt"));
			String linea;
			
			while((linea=in.readLine())!=null) {
				linea=linea.trim();
				linea=linea.toLowerCase();
				//quitamos espacios de principio y fina y las mayus
				lineas=Arrays.copyOf(lineas, lineas.length+1);
				lineas[lineas.length-1]=linea;
			}
			
			Arrays.sort(lineas);
			
			BufferedWriter out=new BufferedWriter(new FileWriter("src/repaso3/alfabetico.txt"));
			for(int i=0;i<lineas.length;i++) {
				out.write(lineas[i]);
				out.newLine();
			}
			out.close();
			System.out.println("Escrito");
		} catch (IOException e) {
			// TODO: handle exception
		    e.printStackTrace();
		}
	}

}
