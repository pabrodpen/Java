package figuras;
import java.util.Scanner;
public class CuadradoRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Numero de asteriscos:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
