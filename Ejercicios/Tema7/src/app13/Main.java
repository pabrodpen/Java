package app13;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Colores colores=new Colores();
		
		colores.addColor("rojo");
		
		colores.mostrar();
		
		colores.addColor("azul");
		colores.addColor("amarillo");
		colores.addColor("verde");
		colores.addColor("morado");
		colores.mostrar();
		
		String[]arr=colores.elegirColores(3);
		
		System.out.println("COLORES ELEGIDOS AL AZAR");
		System.out.println(Arrays.toString(arr));
	}

}
