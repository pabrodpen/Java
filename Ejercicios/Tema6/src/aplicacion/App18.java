package aplicacion;

import java.util.Arrays;

public class App18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="Me GUsta merenDAR gaLLEtas";
		
		String[]arr=frase.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i>0) {
				arr[i]=arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1,arr[i].length()).toLowerCase();
			}else {
				arr[i]=arr[i].toLowerCase();
			}
			arr[i]=arr[i].strip();//quitamos los espacios
		}
		
		String nuevo="";
		for(int i=0;i<arr.length;i++) {
			nuevo+=arr[i];
		}
		System.out.println(nuevo);
	}

}
