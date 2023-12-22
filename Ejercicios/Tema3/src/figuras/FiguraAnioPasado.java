package figuras;

public class FiguraAnioPasado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		  *               *	i=0 1* 7- 1*
		  * *           * * i=1 2* 5- 2*
		  * * *		  * * *	i=2 3* 3- 3*
		  * * * * _ * * * * i=3 4* 1- 4*
		  
		  n=4
		  
		  asteriscos<=i
		  espacios= 2*n-2*i-1
		  
		 */
		
		

		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {//* de la izq
				System.out.print("* ");
			}
			for(int k=2*n-2*i-1;k>0;k--) {//espacios
				System.out.print("  ");
			}
			for(int l=0;l<=i;l++) {//* de la derecha
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
