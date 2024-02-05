package app12;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		EcuacionSegundoGrado ecuacionSegundoGrado=new EcuacionSegundoGrado(7.7, 23, 1.7);
		
		double[]aux=ecuacionSegundoGrado.resultados(ecuacionSegundoGrado);
		
		System.out.println("Resultados de la ecuacion:"+Arrays.toString(aux));
		

	}

}
