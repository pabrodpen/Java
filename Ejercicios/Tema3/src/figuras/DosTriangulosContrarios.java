package figuras;

import java.util.Scanner;

public class DosTriangulosContrarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 n=3
		      *	  *		i=0 3- 1* 1- 1* 3-
		    * *   * * 	i=1 2- 2* 1- 2* 2-
		  * * * _ * * * i=2 0- 4* 1- 4* 0-
		  
		  *<=i
		  espacios=n-i
		  
		 */
		
		System.out.print("Dime el numero de filas:");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>=0;j--) {//espacios de la izq
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {//* de la izq
				System.out.print("* ");
			}
			System.out.print("  ");//espacio del centro
			for(int l=0;l<=i;l++) {//* de la derecha
				System.out.print("* ");
			}
			for(int m=n-i;m>=0;m--) {//* de la derecha
				System.out.print("  ");
			}
			System.out.println();
		}
		
		
		
		
		
		  /*for (int i = n; i >=0; i--) {
	            // Triángulo rectángulo apuntando a la derecha
	            for (int j = 0; j < i; j++) {
	                System.out.print("  ");
	            }
	            for (int j = i; j < n; j++) {
	                System.out.print("* ");
	            }

	            // Espacio entre los triángulos
	            //System.out.print("  ");

	            // Triángulo rectángulo apuntando a la izquierda
	            for (int j = i; j < n; j++) {
	                System.out.print("* ");
	            }
	            
	            System.out.println();
	        }*/
        
    	
        
        
      
	}

}
