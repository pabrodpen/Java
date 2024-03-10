package prop3;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file=new File("src/prop3/jugadores.txt");
			Scanner scanner=new Scanner(file);
			int sumaEdad=0;
			double sumaEstatura=0,mediaEdad,mediaEstatuta;
			scanner.useDelimiter(" ");
			String[]datos=new String[3];
			
			while(scanner.hasNextLine()) {
				String linea=scanner.nextLine();
				datos=linea.split(" ");
				
				String nombre=datos[0];
				int edad=Integer.parseInt(datos[1]);
				double altura=Double.parseDouble(datos[2]);
				System.out.println("Nombre:"+nombre+", edad:"+edad+", altura:"+altura);
				sumaEdad+=edad;
				sumaEstatura+=altura;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
