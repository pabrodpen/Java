package exAnioPasado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//coger reparaciones de los 4 txt
		//add,elim,modif precio reparacion
		//listar taller
		
		//escribir todas las reparaciones en el conj txt y cada vez que se inicie 
		//el menu coger todas las reparaciones de cjto txt
		
		
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("MENU DE GESTION DE REPARACIONES");
			System.out.println("1.ALTA REPARACION");
			System.out.println("2.BAJA REPARACION");
			System.out.println("3.MODIFICAR PRECIO");
			System.out.println("4.LISTAR REPARACIONES");
			System.out.println("5.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				
			}
		} while (opcion!=5);
	}

}
