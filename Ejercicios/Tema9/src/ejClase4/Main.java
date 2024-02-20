package ejClase4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int opcion=0;
		
		Articulo articulo;
		Almacen almacen=new Almacen();
		
		do {
			System.out.println("MENU DE GESTION DEL ALMACEN");
			System.out.println();
			System.out.println("1.LISTADO");
			System.out.println("2.ALTA");
			System.out.println("3.BAJA");
			System.out.println("4.MODIFICACION");
			System.out.println("5.ENTRADA MERCANCIA");
			System.out.println("6.SALIDA MERCANCIA");
			System.out.println("7.SALIR");
			System.out.println();
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			
			switch (opcion) {
			case 1:
				Arrays.sort(almacen.almacen);
				System.out.println(Arrays.toString(almacen.almacen));
				break;
			case 2:
				System.out.print("Descripcion del articulo:");
				String deString=scanner.next();
				System.out.print("Numero de unidades del articulo:");
				int st=scanner.nextInt();
				System.out.print("Precio de compra:");
				double pComp=scanner.nextDouble();
				System.out.print("Precio de venta:");
				double pVent=scanner.nextDouble();
				
				articulo=new Articulo(deString, pComp, pVent, st);
				int pos=almacen.buscarArticulo(articulo.getCodigo());
				if(pos>=0) {
					System.out.println("El articulo ya existe");
				}else {
					almacen.addArticulo(articulo);
				}
				break;
			case 3:
				System.out.print("Codigo del articulo que quieres eliminar:");
				int c=scanner.nextInt();
				
				pos=almacen.buscarArticulo(c);
				if(pos>=0) {
					almacen.elimArticulo(pos);
				}else {
					System.out.println("El articulo no existe");
				}
				break;
			case 4:
				break;
			case 5:
				System.out.print("Codigo del articulo:");
				c=scanner.nextInt();
				pos=almacen.buscarArticulo(c);
				if(pos>=0) {
					System.out.print("Incremento del stock:");
					int incr=scanner.nextInt();
					almacen.entradaMercancia(articulo, c);
				}
				break;
			case 6:
				break;
				
			}
			
		} while (opcion!=7);
	}

}
