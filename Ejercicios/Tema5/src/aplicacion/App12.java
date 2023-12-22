package aplicacion;

import java.util.Arrays;

public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {2,4,5,8,10};
		System.out.println("ARRAY NORMAL");
		System.out.println(Arrays.toString(arr));
		desordenar(arr);
		System.out.println("ARRAY DESORDENADO");
		System.out.println(Arrays.toString(arr));
		 
	}
	//intercambiamos indices por todo el array-->como en el bucle de la burbuja cogiendo
	//un aux, pero con 2 indices random

	 static void desordenar(int t[]){
		 for(int i=0;i<t.length;i++) {
			 int indice1=(int)(Math.random()*t.length);
			 int indice2=(int)(Math.random()*t.length);
			 int aux=t[indice1];
			 t[indice1]=t[indice2];
			 t[indice2]=aux;
		 }
	        
	}
			
	
}
