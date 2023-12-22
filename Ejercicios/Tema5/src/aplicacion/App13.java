package aplicacion;

import java.util.Arrays;

public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {2,4,5,8,10};
		int[]aux=desordenar(arr);
		System.out.println("ARRAY NORMAL");
		System.out.println(Arrays.toString(arr));
		desordenar(arr);
		System.out.println("ARRAY DESORDENADO");
		System.out.println(Arrays.toString(aux));
	}

	 static int[] desordenar(int t[]){
		 int desordenado[]=new int[t.length];
		 System.arraycopy(t, 0, desordenado, 0, t.length);
	 
		 for(int i=0;i<desordenado.length;i++) {
			 int indice1=(int)(Math.random()*t.length);
			 int indice2=(int)(Math.random()*t.length);
			 int aux=desordenado[indice1];
			 desordenado[indice1]=desordenado[indice2];
			 desordenado[indice2]=aux;
		 }
		 return desordenado;
	 }
}
