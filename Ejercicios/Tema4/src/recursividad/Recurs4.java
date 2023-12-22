package recursividad;

public class Recurs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4. leer un numero entero positivo y mostrar la secuencia numerica 
		 * que hay entre el y el 1 mediante un metodo recursivo, 
		 */
		int n=8;
		secuencia(n);


		
	}
	static void secuencia(int n) {
		if(n>=1) {
			System.out.println(n);
			secuencia(n-1);
		}
	}

}
