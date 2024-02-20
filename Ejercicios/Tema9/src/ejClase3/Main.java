package ejClase3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		Publicacion[]biblioteca=new Publicacion[0];
		Libro libro;
		Revista revista;
		
		int opcion=0;
		
		do {
			System.out.println("MENU DE GESTION DE LA BIBLIOTECA");
			System.out.println();
			System.out.println("1.INSERTAR UN LIBRO");
			System.out.println("2.INSERTAR UNA REVISTA");
			System.out.println("3.ELIMINAR UN LIBRO, DADO UN CODIGO");
			System.out.println("4.CONSULTAR DATOS DE UN LIBRO");
			System.out.println("5.LISTADO DE PUBLICACIONES ORDENADAS POR EL CODIGO");
			System.out.println("6.LISTADO DE LIBROS PRESTADOS");
			System.out.println("7.LISTADO DE LIBROS NO PRESTADOS");
			System.out.println("8.LISTADO DE LIBROS ORDENADOS POR AUTOR");
			System.out.println("9.CONSULTAR EL NUMERO DE PUBLICACIONES EXISTENTES");
			System.out.println("10.CAMBIAR ESTADO DE UN LIBRO");
			System.out.println();
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
				
			case 1:
				System.out.print("Codigo del libro:");
				int codigo=scanner.nextInt();
				System.out.print("Año del libro:");
				int anio=scanner.nextInt();
				// Limpia el salto de línea después de leer el entero
				scanner.nextLine();
				System.out.print("Nombre del libro:");
				String nombre=scanner.nextLine();				
				System.out.print("Autor del libro:");
				String autor=scanner.nextLine();
				
				libro=new Libro(codigo, anio, nombre, autor);
				biblioteca=Arrays.copyOf(biblioteca, biblioteca.length+1);
				biblioteca[biblioteca.length-1]=libro;
				break;
			case 2:
				System.out.print("Codigo de la revista:");
				codigo=scanner.nextInt();
				System.out.print("Año de la revista:");
				anio=scanner.nextInt();
				// Limpia el salto de línea después de leer el entero
				scanner.nextLine();
				System.out.print("Nombre de la revista:");
				nombre=scanner.nextLine();
				System.out.print("Numero de la revista:");
				int numero=scanner.nextInt();
				
				revista=new Revista(codigo, anio, nombre, numero);
				biblioteca=Arrays.copyOf(biblioteca, biblioteca.length+1);
				biblioteca[biblioteca.length-1]=revista;
				break;
			case 3:
				System.out.print("Codigo del libro que quieres eliminar:");
				codigo=scanner.nextInt();
				int pos=-1;
				boolean encontrado=false;
				for(int i=0;i<biblioteca.length && !encontrado;i++) {
					if(biblioteca[i].getCodigo()==codigo) {
						pos=i;
						encontrado=true;
					}
				}
				if(encontrado) {
					System.arraycopy(biblioteca, pos+1, biblioteca, pos, biblioteca.length-1-pos);
					System.out.println("Libro eliminado");
				}else {
					System.out.println("Libro no encontrado");
				}
				break;
			case 4:
				System.out.print("Codigo del libro que quieres consultar:");
				codigo=scanner.nextInt();
				pos=-1;
				encontrado=false;
				for(int i=0;i<biblioteca.length && !encontrado;i++) {
					if(biblioteca[i].getCodigo()==codigo) {
						System.out.println(biblioteca[i]);
						encontrado=true;
					}
				}
				if(!encontrado) {
					System.out.println("Libro no encontrado");
				}
				
				
				break;
			case 5:
				Arrays.sort(biblioteca);
				System.out.println(Arrays.toString(biblioteca));
				break;
			case 6:
				for(int i=0;i<biblioteca.length;i++) {
					if(biblioteca[i] instanceof Libro) {
						libro=(Libro) biblioteca[i];
						if(libro.isPrestado()) {
							System.out.println(libro.toString());
						}
					}
				}
				break;
			case 7:
				for(int i=0;i<biblioteca.length;i++) {
					if(biblioteca[i] instanceof Libro) {
						libro=(Libro) biblioteca[i];
						if(!libro.isPrestado()) {
							System.out.println(libro.toString());
						}
					}
				}
				break;
			case 8:
				Arrays.sort(biblioteca,new ComparaAutor());
				System.out.println(Arrays.toString(biblioteca));
				break;
			case 9:
				System.out.println("Numero de publicaciones existentes:"+biblioteca.length);
				break;
				
			case 10:
				System.out.print("Codigo del libro del que quieres modificar su estado:");
				codigo=scanner.nextInt();
				pos=-1;
				encontrado=false;
				for(int i=0;i<biblioteca.length && !encontrado;i++) {
					if(biblioteca[i].getCodigo()==codigo && biblioteca[i] instanceof Libro) {
						pos=i;
						encontrado=true;
					}
				}
			
				if(pos>=0) {
					libro=(Libro)biblioteca[pos];
					if(libro.isPrestado()) {
						libro.devolver();
						System.out.println("El libro ha pasado de prestado a devuelto");
					}else {
						libro.prestar();
						System.out.println("El libro ha pasado de devuelto a prestado");
					}
				}else {
					System.out.println("Libro no encontrado");
				}
				
				
			}
			
		} while (opcion!=11);
	}

}
