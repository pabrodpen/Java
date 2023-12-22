package figuras;
import java.util.Scanner;
public class RomboEnmarcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=0;
		
		
		/*
		 n=5
		 
		  * * * * * * * horizontal
		  * * *   * * * i=0 3* 1- 3*
		  * *       * * i=1 2* 3- 2*
		  *           * i=2 1* 5- 1*
		  * *       * * i=3 2* 3- 2*
		  * * *   * * * i=4 3* 1- 3*
		  * * * * * * * horizontal
		  
		  PARTE SUPERIOR(4 PRIMERAS LINEAS)
		  
		  1º HORIZONTAL
		  2º BUCLE ROMBO
		  numespacios=2*i-1
		  y asteriscos es <=i decreciente(n/2 )porque en total son 3 *
		  a la izq y 3 * a ala derecha
		  
		  PARTE INFERIOR
		  BUCLE ROMBO AL REVES(FOR DE I DECRECIENTE)
		  HORIZONTAL
		  
		  
		 */
		
		
		do {
			System.out.print("Numero de filas del rombo:");
			n=sc.nextInt();
		} while (n<3);
		
		for(int i=0;i<n+2;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=0;i<n/2;i++) {
			for(int k=n/2;k>=i;k--) {
				System.out.print("* ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("  ");
			}
			for(int k=n/2;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=n/2;i>=0;i--) {
			for(int k=n/2;k>=i;k--) {
				System.out.print("* ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("  ");
			}
			for(int k=n/2;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<n+2;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		
	}

}
