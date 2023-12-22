package figuras;

import java.util.Scanner;

public class PiramideInvertidaVacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		
		/*
		  
		 * * * * n=4 i=0  0_
		 _*   * _  n=4 i=1  1_
		 __* *__   n=4 i=2  2_
		 ___*___   n=4 i=3  3_
		 
		 entonces los espacios seran =i y los * seran =n-i pero con un ç
		 if(k=0,k=i,i=n-1)-->1a columna y ultima columna de cada fila, y ultima fila
		  
		  */
		

		for(int i=0;i<n;i++) {//cuenta las lineas
			for(int j=0;j<=i;j++) {
				System.out.print(" ");//hago los espacios de la izquierda
			}
			
			for(int k=0;k<n-i;k++) {//*
				if(k==0 || k==n-i-1 || i==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}

}
