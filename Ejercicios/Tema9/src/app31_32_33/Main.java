package app31_32_33;

import java.util.Arrays;

import app31_32_33.Llamada.Zonas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Llamada[]llamadas=new Llamada[3];
		
		llamadas[0]=new Llamada(1, 1, false, "2024-12-12 12:34:23", "2024-12-12 13:45:21", Zonas.AFRICA);
		llamadas[1]=new Llamada(2, 2, true, "2024-11-23 11:44:57", "2024-11-23 13:00:21", Zonas.EUROPA);
		llamadas[2]=new Llamada(3, 3, false, "2024-12-12 21:25:00", "2024-12-12 21:45:11", Zonas.AMERICA);
		
		System.out.println("LLAMADAS POR NUM CLIENTE,FECHA");
		Arrays.sort(llamadas);
		System.out.println(Arrays.toString(llamadas));
		
		
		System.out.println("LLAMADAS POR COSTE");
		Arrays.sort(llamadas, new ComparaCoste());
		System.out.println(Arrays.toString(llamadas));
	
		
	}

}
