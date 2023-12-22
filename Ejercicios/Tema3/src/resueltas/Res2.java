package resueltas;
import java.util.Scanner;
public class Res2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int edad=0;
		int numAlumnos=0,suma=0,numMayores=0;

			
		while (edad>=0) {
			System.out.print("Introduce la edad del alumno(hasta que pulses un numero negativo):");
			 edad=sc.nextInt();
			 if(edad>=0) {
				 numAlumnos++;
				 suma+=edad;
				 if(edad>=18) {
					 numMayores++;
				 }
			 }
			
		}
		
		
		System.out.println("Suma de las edades:"+suma);
		double media=(double) suma/numAlumnos;
		System.out.println("Media de las edades:"+media);
		System.out.println("Numero de alumnos:"+numAlumnos);
		System.out.println("Numero de alumnos mayores de edad:"+numMayores);
		
	}

}
