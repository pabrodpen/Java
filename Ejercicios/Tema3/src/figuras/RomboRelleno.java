package figuras;

import java.util.Scanner;

public class RomboRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		int n=0;
		
		do {
			System.out.print("Numero de filas(impar):");
			 n=sc.nextInt();
		} while (n%2==0 || n<3);
		
		
		for(int i=0;i<n/2+1;i++) {//piramide normal
			for(int j=0;j<n/2-i;j++) {//3 filas(n/+1) y en las demas cosas tmb n/2
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n/2;i++) {//piramide invertida de 2 filas(n/2)
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n/2-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
      
	}

}
