package app18_19_20_21;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Cola cola=new Cola();
		
		Pila pila=new Pila();
		
		cola.encolar(2);
		cola.encolar(5);
		cola.mostrar();
		cola.desencolar();
		cola.mostrar();
		
		pila.apilar(7);
		pila.apilar(-5);
		pila.mostrar();
		pila.desapilar();
		pila.mostrar();*/
		
		
		Cjto cjto1=new Cjto();
		Cjto cjto2=new Cjto();
		
		cjto1.insertar(5);
		cjto1.insertar(2);
		cjto1.insertar(17);
		System.out.println("CJTO1");
		cjto1.mostrar();
		
		cjto2.insertar(17);
		cjto2.insertar(28);
		cjto2.insertar(5);
		System.out.println("CJTO2");
		cjto2.mostrar();
		
		//IMP COMO SE GUARDA LO QUE SE DEVUELVE DE UN METODO STATIC
		Cjto cjtoUnion=Cjto.union(cjto1, cjto2);
		Cjto cjtoIntersecc=Cjto.interseccion(cjto1, cjto2);
		Cjto cjtoDif=Cjto.diferencia(cjto1, cjto2);
		
		
		System.out.println("TODOS LOS ELEMENTOS");
		System.out.println(Arrays.toString(cjtoUnion.cjto));
		System.out.println("ELEMENTOS REPETIDOS");
		System.out.println(Arrays.toString(cjtoIntersecc.cjto));
		System.out.println("ELEMENTOS NO REPETIDOS");
		System.out.println(Arrays.toString(cjtoDif.cjto));
		
		
		
	}

}
