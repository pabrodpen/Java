package ejerciciosClase;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime hasta que numero quieres ver la serie de Fibonacci:");
		int n=sc.nextInt();
		int cont=0;
		int fibo1=1,fibo2=1;
		while(cont<n) {
			System.out.print(fibo1+", ");
			cont++;
			fibo2=fibo1+fibo2;
			fibo1=fibo2-fibo1;
			
		}
	}

}
