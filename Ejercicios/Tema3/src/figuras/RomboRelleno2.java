package figuras;

import java.util.Scanner;

public class RomboRelleno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		/*
		  
		    *
		  * * *
		* * * * *
		  * * *
		    * 
		  
		 */
		
		int n=0;
		
		do {
			System.out.print("Numero de filas(impar):");
			 n=sc.nextInt();
		} while (n%2==0 || n<3);
		
		//parte superior del rombo
		
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//parte central de rombo
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		//parte inferior del rombo-->lo mismo que el superior pero el primero decreciente
		for(int i=n/2-1;i>=0;i--) {//IMP EL-1
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
      
	}

}
