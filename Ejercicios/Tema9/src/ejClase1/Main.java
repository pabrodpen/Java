package ejClase1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/*
  Realizar un menú de opciones para llevar el mantenimiento de una asociación de forma que de cada 
  socio los datos son: un ID, un nombre y una fecha de nacimiento. 
  
El ID es el campo clave y no se puede repetir, de tipo numérico. Además, se desea conocer cuál es el 
número de socios que tiene la asociación. 

Las operaciones que se van a realizar son: 
1- Alta de socio (comprobar que el ID sea único)
2- Eliminación de socio (solicita el ID que quiera eliminar)
3- Consultar el nº de socios existentes
4- Consultar los datos de un socio en concreto (solicita ID)
5- Modificar la fecha de nacimiento (solicita ID)
6- Listado ordenado por ID (criterio de ordenación natural)
7- Listado ordenado por la edad y en caso de la misma edad, se ordenará por el nombre del socio
8- Salir
  
  */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		
		String nombre,fecha;
		int id;
		Socio socio;
		Asociacion asociacion=new Asociacion();
		
		do {
			System.out.println("MENU DE GESTION DE LA ASOCIACION");
			System.out.println();
			System.out.println("1.ALTA SOCIO");
			System.out.println("2.BAJA SOCIO");
			System.out.println("3.CONSULTAR NUMERO DE SOCIOS DE LA ASOCIACION");
			System.out.println("4.CONSULTAR DATOS SOCIO");
			System.out.println("5.MODIFICAR FECHA DE NACIMIENTO DE SOCIO");
			System.out.println("6.LISTAR SOCIOS POR ID");
			System.out.println("7.LISTAR POR EDAD");
			System.out.println("8.SALIR");
			System.out.println();
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Nombre del socio:");
				nombre=scanner.next();
				System.out.println("Fecha de nacimiento del socio:");
				fecha=scanner.next();
				
				socio=new Socio(nombre, fecha);
				
				if(!asociacion.comprobarId(socio.id)) {
					asociacion.addSocio(socio);
					System.out.println("Socio dado de alta");
				}else {
					System.out.println("El socio ya existe");
				}
				
				break;
			
			case 2:
				System.out.println("ID del socio que quieres eliminar:");
				id=scanner.nextInt();
				
				if(!asociacion.comprobarId(id)) {
					System.out.println("El socio no existe");
				}else {
					Socio s=asociacion.consultarSocio(id);
					asociacion.elimSocio(s);
					System.out.println("Socio dado de baja");
					Socio.contadorIds--;
				}
				break;
				
			case 3:
				System.out.println("El numero de socios en la asociacion es:"+asociacion.asociacion.length);
				System.out.println();
				break;
				
			case 4:
				System.out.println("ID del socio:");
				id=scanner.nextInt();
				
				if(!asociacion.comprobarId(id)) {
					System.out.println("El socio no existe");
				}else {
					Socio s=asociacion.consultarSocio(id);
					System.out.println(s.toString());
				}
				break;
				
			case 5:
				System.out.println("ID del socio:");
				id=scanner.nextInt();
				
				if(!asociacion.comprobarId(id)) {
					System.out.println("El socio no existe");
				}else {
					System.out.println("Nueva fecha de nacimiento:");
					fecha=scanner.next();
					
					Socio s=asociacion.consultarSocio(id);
					LocalDate fechDate=LocalDate.parse(fecha);
					s.setFechaNac(fechDate);
					System.out.println("Fecha modificada");
				}
				break;
				
			case 6:
				Arrays.sort(asociacion.asociacion);
				System.out.println("ORDENADOS POR ID");
				
				for(int i=0;i<asociacion.asociacion.length;i++) {
					System.out.println(asociacion.asociacion[i].toString());
				}
				break;
				
			case 7:
				Arrays.sort(asociacion.asociacion,new ComparaEdad());
				System.out.println("ORDENADOS POR EDAD");
				
				for(int i=0;i<asociacion.asociacion.length;i++) {
					System.out.println(asociacion.asociacion[i].toString());
				}
				break;
				
			}
		} while (opcion!=8);
		

		System.out.println("HAS SALIDO DEL MENU DE GESTION DE LA ASOCIACION");
		
	}
	

}
