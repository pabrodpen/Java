package res6;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file=new File("src/res6/Enteros.txt");
			
			Scanner scanner=new Scanner(file);
			int suma=0,cont=0;
			double media;
			
			scanner.useDelimiter("\\s+");
			while(scanner.hasNext()) {
				int numero=scanner.nextInt();
				suma+=numero;
				cont++;
				System.out.println(numero);
			}
			
			media=(double) suma/cont;
			System.out.println("Suma:"+suma);
			System.out.println("Media:"+media);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
