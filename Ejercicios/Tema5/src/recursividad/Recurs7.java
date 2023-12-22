package recursividad;

public class Recurs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,5,7};
		imprimirInverso(arr, arr.length-1);
		
	}
	
	static void imprimirInverso(int[]v,int cont) {
		if(cont>=0) {
			System.out.print(v[cont]+" ");
			imprimirInverso(v, cont-1);
		}
	}

}
