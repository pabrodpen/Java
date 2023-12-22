package figuras;
import java.util.Scanner;
public class LetraX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=0;
		do {
			System.out.print("Dime el numero de filas(impar):");
			n=sc.nextInt();
		} while (n%2==0 && n<=1);
		
		//piramide invertida de 2
				for(int i=0;i<n/2;i++) {
					for(int j=0;j<=i;j++) {
						System.out.print(" ");
					}
					for(int k=0;k<=n/2-i;k++) {//IMP EL N/2
						if(k==0 || k==n/2-i) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
				//piramide normal de 3
				for(int i=0;i<n/2+1;i++) {//IMP EL +1 PARA QUE LA PARTE SUPERIOR E INFERIOR DE LAFIGURA TENGAN LOS MISMOS *
					for(int j=0;j<=n/2-i;j++) {//IMP EL N/2
						System.out.print(" ");
					}
					for(int k=0;k<=i;k++) {
						if(k==0 || k==i) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
						
					}
					System.out.println();
				}
	}

}
