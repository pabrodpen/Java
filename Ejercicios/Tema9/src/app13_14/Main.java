package app13_14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Futbolista[]equipo=new Futbolista[5];

		equipo[0]=new Futbolista("123", "Pablo", 21, 5);
		equipo[1]=new Futbolista("321", "Javi", 31, 20);
		equipo[2]=new Futbolista("567", "Fran", 19, 16);
		equipo[3]=new Futbolista("234", "Dani", 19, 2);
		equipo[4]=new Futbolista("890", "Andres", 34, 9);
		
		System.out.println("ORDENADOS POR DNI");
		Arrays.sort(equipo);
		System.out.println(Arrays.toString(equipo));
		
		
		System.out.println("ORDENADOS POR NOMBRE");
		Arrays.sort(equipo,new ComparaNombre());
		System.out.println(Arrays.toString(equipo));

		
		System.out.println("ORDENADOS POR EDAD DE MENOR A MAYOR");
		Arrays.sort(equipo,new ComparaEdad());
		System.out.println(Arrays.toString(equipo));
		
		
		System.out.println("ORDENADOS POR EDAD DE MAYOR A MENOR");
		Arrays.sort(equipo,new ComparaEdad().reversed());
		System.out.println(Arrays.toString(equipo));

		
	}

}
