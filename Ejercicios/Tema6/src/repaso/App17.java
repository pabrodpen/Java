package repaso;
import java.util.Scanner;

import javax.security.auth.Subject;
public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Palabra:");
		String palabra=sc.nextLine();
		System.out.print("Numero de letras en cada linea:");
		int n=sc.nextInt();
		
		for(int i=0;i<palabra.length();i++) {
			for(int j=0;j<n;j++) {
				System.out.print(palabra.charAt(j));
			}
			System.out.println();
			if(n<palabra.length()) {
				palabra=palabra.substring(n);
			}else {
				n=palabra.length();
			}
		}
	}

}
