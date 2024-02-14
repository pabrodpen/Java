package app14_app15_app16_app17_app18_app19_app20_app21_app22;

public class Pila extends Lista{


	public Pila(Integer[] pila) {
		super();
		Lista lista=new Lista();
	}
	
	
	void apilar(Integer elemento) {
		super.insertarPrimeraPos(elemento);
	}
	
	void desapilar(Integer elemento) {
		super.eliminarPos(0);
	}
	
	public String toString() {
		return super.toString();
	}
}
