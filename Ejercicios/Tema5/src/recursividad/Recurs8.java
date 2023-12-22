package recursividad;

public class Recurs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,5,7};

		System.out.println("Suma de los elementos del vector:"+sumaVector(arr, 0));

	}
	
	static int sumaVector(int[]v,int cont) {
		int suma;
		if(cont<v.length) {
			suma+=v[cont];
			sumaVector(v, cont+1);
		}
		
		return suma;
	}

}
