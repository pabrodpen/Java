package repaso7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc=new Scanner(new File("src/repaso7/fichero.txt"));
			
			char c;
			
			while(sc.hasNext()) {//coge cada palabra separada por espacio
			
				String palabra=sc.next();
				for(int i=0;i<palabra.length();i++) {
					System.out.println(palabra.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
