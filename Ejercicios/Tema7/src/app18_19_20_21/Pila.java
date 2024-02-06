package app18_19_20_21;

import java.util.Arrays;

public class Pila {

	Integer[]pila=new Integer[0];
	
	void apilar(Integer n) {
		pila=Arrays.copyOf(pila, pila.length+1);
		System.arraycopy(pila, 0, pila, 1, pila.length-1);
		pila[0]=n;
	}
	
	void desapilar() {
			System.arraycopy(pila, 1, pila, 0, pila.length-1);
			pila=Arrays.copyOf(pila, pila.length-1);
	}
	
	void mostrar() {
		System.out.println(Arrays.toString(pila));
	}
}
