package app18;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="Hol1 qu3 t4al est8as";
		
		Scanner scanner=new Scanner(cadena);
		int[]numeros=new int[0];
		
		for(int i=0;i<cadena.length();i++) {
			if(Character.isDigit(cadena.charAt(i))) {
				int n=Character.getNumericValue(cadena.charAt(i));
				numeros=Arrays.copyOf(numeros, numeros.length+1);
				numeros[numeros.length-1]=n;
			}
		}
		
		System.out.println("LISTA DE NUMEROS");
		System.out.println(Arrays.toString(numeros));
	}

}
