package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		Coche coche;
		Moto moto;
		Taller taller=new Taller();
		
		
		int opcion=0;
		
		do {
			System.out.println("MENU DE GESTION DE VEHICULOS");
			System.out.println("1.ALTA COCHE");
			System.out.println("2.ALTA MOTO");
			System.out.println("3.ALTA COCHE AUTONOMO");
			System.out.println("4.LISTADO VEHICULOS Y NUM DE COCHES");
			System.out.println("5.LISTADO DE COCHES ALQUILADOS");
			System.out.println("6.LISTADO DE MOTOS");
			System.out.println("7.ALQUILAR UN VEHICULO");
			System.out.println("8.DEVOLVER UN VEHICULO");
			System.out.println("9.SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Marca del coche:");
				String marca=scanner.next();
				System.out.print("Modelo del coche:");
				String modelo=scanner.next();
				scanner.nextLine();
				System.out.print("Numero de ruedas:");
				int numRuedas=scanner.nextInt();
				System.out.print("Capacidad:");
				int capacidad=scanner.nextInt();
				
				coche=new Coche(marca, modelo, numRuedas, capacidad);
				taller.addCoche(coche);
				break;
			case 2:
				System.out.print("Marca de la moto:");
				 marca=scanner.next();
				System.out.print("Modelo de la moto:");
				 modelo=scanner.next();
				scanner.nextLine();
				System.out.print("Numero de ruedas:");
				 numRuedas=scanner.nextInt();
				System.out.println("Sidecar:");
				boolean sidecar=scanner.nextBoolean();
				
				moto=new Moto(marca, modelo, numRuedas, sidecar);
				taller.addMoto(moto);
				break;
			case 3:
				System.out.print("Marca del coche autonomo:");
				 marca=scanner.next();
				System.out.print("Modelo del coche autonomo:");
				 modelo=scanner.next();
				scanner.nextLine();
				System.out.print("Numero de ruedas del coche autonomo:");
				 numRuedas=scanner.nextInt();
				System.out.print("Capacidad del coche autonomo:");
				 capacidad=scanner.nextInt();
				System.out.println("Numero de sensores:");
				int numSens=scanner.nextInt();
				
				coche=new Coche(marca, modelo, numRuedas, capacidad,numSens);
				taller.addCoche(coche);
				break;
			case 4:
				taller.listado();
				break;
			case 5:
				taller.listadoCochesAlquilados();
				break;
			case 6:
				taller.listadoMotos();
				break;
			case 7:
				System.out.print("ID del vehiculo que quieres alquilar:");
				int id=scanner.nextInt();
				
				taller.alquilarVehiculo(id);
				break;
			case 8:
				System.out.print("ID del vehiculo que quieres devolver:");
				id=scanner.nextInt();
				
				taller.devolverVehiculo(id);
				break;
				
			}
				
		} while (opcion!=9);
		
		
	}
	

}	
	


