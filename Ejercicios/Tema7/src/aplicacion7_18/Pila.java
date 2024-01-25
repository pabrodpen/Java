package aplicacion7_18;

import java.util.Arrays;
public class Pila {
		Integer[] tabla = new Integer[0];

		public void empilar(int x) {
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			tabla[tabla.length - 1] = x;
		}
		
		public void desenpilar() {
			tabla=Arrays.copyOf(tabla, tabla.length - 1);
		}
		
		public void mostrar() {
			System.out.println(Arrays.toString(tabla));
		}

}
