package pack;
import java.awt.Container;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Hasta que termino quieres ver de la serie?");
		int n=sc.nextInt();
		
		int fibo1=0;
		int fibo2=1;
		int cont=1;
		while(cont<=n) {
			System.out.print(fibo1+",");
			fibo2=fibo1+fibo2;
			fibo1=fibo2-fibo1;
			cont++;
		}
	}

}
