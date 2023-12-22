package recursividad;

public class Recurs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. leer un numero entero y positivo y mosterar la secuencia numerica que 
		//hay entre el 1 y el.
		
		int a=7;
		secuencia(a,1);


	}
	static void secuencia(int n,int cont) {
		
		if(cont<=n) {
			System.out.println(cont);
			secuencia(n,cont+1);
		}
	}

}
