package recursividad;

public class Recurs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2. leer dos numeros enteros y positivos y pasarlo a un metodo recursivo que obternga 
		 * la multiplicacion de ambos y la devuelva al principal.
		 */

		int n1=5;
		int n2=0;
		
		System.out.println(n1+" x "+n2+" es:"+multiplicacion(n1, n2));
		
	}
	static int multiplicacion(int a,int b) {
		int producto;
		if(a==0 || b==0) {
			producto=0;
		}else {
			producto=a+multiplicacion(a, b-1);
		}
		return producto;
	}

}
