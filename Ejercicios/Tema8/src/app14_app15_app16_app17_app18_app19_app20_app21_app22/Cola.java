package app14_app15_app16_app17_app18_app19_app20_app21_app22;

import java.util.Arrays;

public class Cola extends Lista{

	public Cola() {
		super();
		Lista lista=new Lista();
	}
	

	void encolar(Integer elemento) {
		super.insertarUltimaPos(elemento);
	}
	
	void desencolar(Integer elmento) {
		super.eliminarPos(lista.length-1);
	}


	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
