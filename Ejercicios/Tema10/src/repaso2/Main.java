package repaso2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/repaso2/fichero.txt"));
			BufferedWriter out1=new BufferedWriter(new FileWriter("src/repaso2/mayus.txt"));
			BufferedWriter out2=new BufferedWriter(new FileWriter("src/repaso2/minus.txt"));

			int c;
			
			while((c=in.read())!=-1) {
				char caracter=(char) c;
				if(Character.isLowerCase(caracter)) {
					out2.write(caracter);
				}else if(Character.isUpperCase(caracter)) {
					out1.write(caracter);
				}
			}
			out1.close();
			out2.close();
			System.out.println("HECHO");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
