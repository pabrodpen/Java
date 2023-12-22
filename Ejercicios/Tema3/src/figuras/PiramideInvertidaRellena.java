package figuras;
import java.util.Scanner;
public class PiramideInvertidaRellena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		
		/*
		  
		 * * * * n=4 i=0 4* 0_
		 _* * * _  n=4 i=1 3* 1_
		 __* *__   n=4 i=2 2* 2_
		 ___*___   n=4 i=3 1* 3_
		 
		 entonces los espacios seran =i y los * seran =n-i
		  
		  */
		

		for(int i=0;i<n;i++) {//cuenta las lineas
			for(int j=0;j<=i;j++) {
				System.out.print(" ");//hago los espacios de la izquierda
			}
			
			for(int k=0;k<n-i;k++) {//*
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
