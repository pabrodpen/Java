package ejClase2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta[]cartasJugador1=new Carta[5];
		
		Carta[]cartasJugador2=new Carta[5];
		
		cartasJugador1[0]=Carta.generarCarta();
		cartasJugador1[1]=Carta.generarCarta();
		cartasJugador1[2]=Carta.generarCarta();
		cartasJugador1[3]=Carta.generarCarta();
		cartasJugador1[4]=Carta.generarCarta();
		
		
		
		cartasJugador2[0]=Carta.generarCarta();
		cartasJugador2[1]=Carta.generarCarta();
		cartasJugador2[2]=Carta.generarCarta();
		cartasJugador2[3]=Carta.generarCarta();
		cartasJugador2[4]=Carta.generarCarta();
		
		
		System.out.println("CARTAS DEL JUGADOR 1");
		Arrays.sort(cartasJugador1);
		System.out.println(Arrays.toString(cartasJugador1));
		System.out.println();
		System.out.println("CARTAS DEL JUGADOR 2");
		Arrays.sort(cartasJugador2);
		System.out.println(Arrays.toString(cartasJugador2));

	}

}
