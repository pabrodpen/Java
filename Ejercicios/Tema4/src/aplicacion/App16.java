package aplicacion;
import java.util.Scanner;
public class App16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un numero:");
		int num=sc.nextInt();
		divisoresPrimos(num);

	}
	static void divisoresPrimos(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0 && esPrimo(i)) {
				System.out.println(i);
			}
		}
		
	}
	static boolean esPrimo(int n) {
		boolean primo=true;
		for(int i=n/2;i>1 && primo;i--) {
			if(n%i==0) {
				primo=false;
			}
		}
		return primo;
	}

}
