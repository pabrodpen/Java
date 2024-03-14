package app22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumaEdad=0,numDeportistas=0;
		double sumaEstatura=0,sumaPeso=0,mediaEdad,mediaEstatura,mediaPeso;
		try {
			Scanner scanner=new Scanner(new File("src/app22/deportistas.txt"));
			scanner.nextLine();//pasamos a la segunda linea, ya que en
			//la primera solo estan los nombres de los datos
			while(scanner.hasNextLine()) {
				String linea=scanner.nextLine();
				String[]aux=linea.split("\t+");
				
				int edad=Integer.parseInt(aux[1]);
				double peso=Double.parseDouble(aux[2]);
				double altura=Double.parseDouble(aux[3]);
				System.out.println(aux[0]+", "+edad+", "+peso+", "+altura);
				sumaEdad+=edad;
				sumaEstatura+=altura;
				sumaPeso+=peso;
				numDeportistas++;
			}
			
			mediaEdad=(double) sumaEdad/numDeportistas;
			mediaEstatura=(double) sumaEstatura/numDeportistas;
			mediaPeso=(double) sumaPeso/numDeportistas;

			
			System.out.println("Media de edad:"+mediaEdad);
			System.out.println("Media de estatura:"+mediaEstatura);
			System.out.println("Media de peso:"+mediaPeso);

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}

}
