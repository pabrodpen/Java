package figuras;
import java.util.Scanner;
public class Casa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {//piramide normal
			for(int j=0;j<n-i;j++) {//3 filas(n/+1) y en las demas cosas tmb n/2
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				if(k==0 || k==i /*|| i==n-1*/) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//CUADRADO VACIO
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" *");//IMP PONERLO AL REVES
			}
			System.out.println();
		}
	}

}
