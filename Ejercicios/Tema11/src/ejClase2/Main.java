package ejClase2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.AÑADIR NUEVO ALUMNO");
			System.out.println("2.MODIFICAR NOTAS ALUMNO");
			System.out.println("3.CALCULAR NOTAS MEDIA FINAL");
			System.out.println("4.CONSULTAR NOTAS DE UN ALUMNO");
			System.out.println("5.MOSTRAR EL ALUMNO CON MAYOR Y MENOR CALIFICACION");
			System.out.println("6.LISTAR LOS NOMBRES DE LOS ALUMNOS Y LAS NOTAS MEDIAS ORDENADO POR NOMBRE");
			System.out.println("7.LISTAR LOS NOMBRES DE LOS ALUMNOS Y LAS NOTAS MEDIAS ORDENADO POR NOTA MEDIA");
			System.out.println("8.SALIR");
			System.out.print("Dime una opcion:");
			opcion=sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				
			}
		} while (opcion!=8);
		
	
	}

}
