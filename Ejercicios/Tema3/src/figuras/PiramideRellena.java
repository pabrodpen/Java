package figuras;
import java.util.Scanner;
public class PiramideRellena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime el numero de asteriscos de la base de la piramide:");
		int n=sc.nextInt();
		
		/*
		 
	_ _ _ * 		-->i=0 n=4 1* y 3 espacios a la izq
	_ _ * _ * 		-->i=1 n=4 2* y 2 espacios a la izq
	_ * _ * _ *		-->i=2 n=4 3* y 1 espacio a la izq
	* _ * _ * _ *	-->i=3 n=4 4* y 0 espacios a la izq
		 
		 
		 
		  */
		
		for(int i=0;i<n;i++) {//cuenta las lineas
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");//hago los espacios de la izquierda
			}
			//ej: en la primera linea cuenta 3 espacios (i=0 y n=4,ya que es < y no <=)
			//asi que queda k=0 e i=1(imprime 1 asterisco)
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
