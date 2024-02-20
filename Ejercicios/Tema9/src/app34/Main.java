package app34;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta cartas[]=new Carta[5];
		
		cartas[0]=Carta.generarCarta();
		cartas[1]=Carta.generarCarta();
		cartas[2]=Carta.generarCarta();
		cartas[3]=Carta.generarCarta();
		cartas[4]=Carta.generarCarta();
		
		System.out.println("CARTAS");
		Arrays.sort(cartas);
		System.out.println(Arrays.toString(cartas));
	}

}
