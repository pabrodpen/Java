package repaso6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(new File("src/repaso6/estudiantes.txt"));
		
		// scanner.useLocale(Locale.US); 
		// Establecer el locale para aceptar puntos como separador decimal
		String[]mayEdad=new String[0];
		double mediaEdad,mediaNotas;
		double sumaNota=0;
		int sumaEdad=0,numAlumn=0;
		
		while(scanner.hasNextLine()) {
			String nombre=scanner.next();
			int edad=scanner.nextInt();
			double nota=scanner.nextDouble();
			
			sumaEdad+=edad;
			sumaNota+=nota;
			if(edad>=18) {
				mayEdad=Arrays.copyOf(mayEdad, mayEdad.length+1);
				mayEdad[mayEdad.length-1]=nombre;
				
			}
			numAlumn++;
			
		}
		
		System.out.println("ALUMNOS MAYORES DE EDAD");
		System.out.println(Arrays.toString(mayEdad));
		
		mediaEdad=(double) sumaEdad/numAlumn;
		mediaNotas=(double) sumaNota/numAlumn;
		
		System.out.println();
		System.out.println("Media de edad:"+mediaEdad);
		System.out.println("Media de notas(sobre 100):"+mediaNotas);
	}

}
