package app18_19_20_21;

import java.util.Arrays;

public class Cola {

	Integer[]cola=new Integer[0];
	
	void encolar(Integer n) {
		cola=Arrays.copyOf(cola, cola.length+1);
		cola[cola.length-1]=n;
	}
	
	void desencolar() {
		System.arraycopy(cola, 1, cola, 0, cola.length-1);
		cola=Arrays.copyOf(cola, cola.length-1);
	}
}
