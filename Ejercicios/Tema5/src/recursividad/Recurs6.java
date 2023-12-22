package recursividad;

public class Recurs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,5,7};
		imprimir(arr, 0);
		
	}
	static void imprimir(int[]v,int cont) {
		if(cont<v.length) {
			System.out.print(v[cont]+" ");
			imprimir(v,cont+1);
		}
	}

}
