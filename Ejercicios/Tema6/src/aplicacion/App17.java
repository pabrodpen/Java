package aplicacion;
import java.util.Arrays;
import java.util.Scanner;
public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Palabra:");
		String palabra=sc.nextLine();
		
		System.out.print("Secuencia de letras:");
		int n=sc.nextInt();
		
		while(!palabra.isEmpty()) {
			if(palabra.length()>=n) {
				String linea=palabra.substring(0, n);
				palabra=palabra.substring(n,palabra.length());//borramos las letras del principio hasta n(las 4 
				//primeras-->las que hemos cogido anteriormente)
				System.out.println(linea);
			}else {
				String linea=palabra;
				System.out.println(linea);
				palabra="";
			}
		}
			
			
	}

}
