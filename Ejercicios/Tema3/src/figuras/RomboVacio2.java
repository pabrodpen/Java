package figuras;
import java.util.Scanner;
public class RomboVacio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  
	    *
	  *   *
	*       *
	  *   *
	    * 
	  
	 */
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		do {
			System.out.print("Numero de filas:");
			n=sc.nextInt();
		} while (n%2==0 || n<3);
		
		//parte superior 
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {//for llega hasta 2*i+1 , ultima col=2*i
				if(k==2*i || k==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		//parte central
		
		for(int i=0;i<n;i++) {//como llega el for hasta n, ultima col=n-1
			if(i==0 || i==n-1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
		
		//parte inferior
		for(int i=n/2-1;i>=0;i--) {
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {//como el for llega a 2*i+1, el if es k==2*i(ultima col)
				if(k==0 || k==2*i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
