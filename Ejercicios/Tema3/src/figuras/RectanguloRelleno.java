package figuras;

import java.util.Scanner;

public class RectanguloRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=0;

		do {
			System.out.print("Numero de asteriscos(par):");
			n=sc.nextInt();
			
		} while (n%2!=0);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
