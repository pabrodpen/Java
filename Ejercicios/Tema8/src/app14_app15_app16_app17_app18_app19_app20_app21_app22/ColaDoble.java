package app14_app15_app16_app17_app18_app19_app20_app21_app22;

import java.util.Arrays;

public class ColaDoble extends Cola{

	
	public ColaDoble() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void encolarPrincipio(Integer elemento) {
		super.encolar(elemento);
	}
	
	void desencolarFinal(Integer elemento) {
		super.desencolar(elemento);
	}
	
	@Override
	public String toString() {
		return "ColaDoble [cola=" + Arrays.toString(lista) + ", tabla=" + Arrays.toString(lista) + "]";
	}

	

	

	
}
