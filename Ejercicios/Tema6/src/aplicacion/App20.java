package aplicacion;

import java.util.Arrays;

public class App20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="Hola como estas";
		frase=frase.toLowerCase();
		String[]arr=frase.split(" ");
		Arrays.sort(arr);
		
		String ordenado="";
		for(int i=0;i<arr.length;i++) {
			ordenado+=arr[i]+",";
			
		}
		
		System.out.println(ordenado);
	}

}
