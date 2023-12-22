package propuestas;
import java.util.Scanner;
public class Prop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		boolean posit;
		if(n>=0) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negativo");
		}
		
	}

}
