package aplicacion;
import java.util.Scanner;
public class App16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		int valorAbs=n>=0? n:-n;
		
		System.out.println("Valor absoluto de "+n+" es "+valorAbs);
	}

}
