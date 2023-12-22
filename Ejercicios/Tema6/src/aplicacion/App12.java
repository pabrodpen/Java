package aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class App12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		boolean finJuego = false;
		int vidas = 7;

		// Si una letra se repite se sigue poniendo en la primera posicion que encuentra

		String opciones[] = { "palabra"};
		int n = (int) (Math.random() * opciones.length);
		String palabra = opciones[n];

		int aciertos=0;
		char progreso[] = new char[palabra.length()];
		crearHuecos(progreso);
		do {
			System.out.println("TURNO DEL JUGADOR");
			System.out.print("Dime una letra:");
			char letra = teclado.next().charAt(0);
		 	int pos = palabra.indexOf(letra);
		 	char busqueda[] = new char[palabra.length()];
		 	busqueda=palabra.toCharArray();
		 	
		 	//RECORRER EN UN FOR CADA CARACTER DE PALBRA Y COMPARARLO CON LETRA
		 	
			if (pos == -1 && vidas>0) {
				System.out.println("Lo siento, intentalo otra vez");
				vidas--;
				muñeco(vidas);
			} else {
				System.out.println("Sigue asi");
				for(int i=0;i<palabra.length();i++) {
			 		if(busqueda[i]==letra) {
			 			progreso[i] = letra;
			 			aciertos++;
			 		}
			 	}
			}
			for(int i=0;i<progreso.length;i++) {
				System.out.print((progreso[i]));
			}
			System.out.println();
			if(aciertos==palabra.length()) {
				finJuego=true;
			}
		} while (finJuego==false && vidas != 0);
		if (finJuego==true) {
			System.out.println("Enhorabuena, has ganado!");
		} else if (vidas == 0) {
			System.out.println("Lo siento, has perdido...");
		}

	}

	static void crearHuecos(char[] aciertos) {
		for (int i = 0; i < aciertos.length; i++) {
			aciertos[i] = '-';
			System.out.print(aciertos[i]);
		}
		
		System.out.println();
	}

	static void muñeco(int vidas) {
		switch (vidas) {
		//de 1 vida a 0 vidas
		case 1: {
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|        /|\\");
			System.out.println("|        / \\");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		//de 2 vidas a 1 vida
		case 2: {
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|        /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		//de 3 vidas a 2 vidas
		case 3: {
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		//de 4 vidas a 3 vidas
		case 4: {
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			
			break;
		}
		//de 5 vidas a 4 vidas
		case 5: {
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");

			break;
		}
		//de 6 vidas a 5 vidas
		case 6: {
			System.out.println("___________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		//de 7 vidas a 6 vidas
		case 7:{
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		
		}

	}
}
