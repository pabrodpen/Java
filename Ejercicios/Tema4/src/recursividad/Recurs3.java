package recursividad;

public class Recurs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. algortimo recursivo que reciba un numero entero positivo y muestre su tabla 
		//de multiplicar.
		
		int a=5;
		tablaMultiplicar(a,1);


	}
	static void tablaMultiplicar(int n,int cont) {
		int resultado;
		if(cont<=10) {
			resultado=n*cont;
			System.out.println(resultado);
			tablaMultiplicar(n,cont+1);
		}
	}

}
