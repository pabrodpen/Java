package recursividad;

public class Recurs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. un metodo recursivo para saber si un numero es primo o no.

		int a=4;
		System.out.println(a+" es primo:"+esPrimo(a, a-1));

	}
	static boolean esPrimo(int n,int cont) {
		boolean primo=true;
		if(cont>=2 && primo) {
			if(n%cont==0) {
				primo=false;
			}else {
				primo=esPrimo(n, cont-1);//IMP EL PRIMO=
			}
		}
		return primo;
	}

}
