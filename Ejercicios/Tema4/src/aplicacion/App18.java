package aplicacion;
import java.util.Scanner;
public class App18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cantidad de numeros");
		int n=sc.nextInt();
		System.out.println("Maximo:");
		int mx=sc.nextInt();
		System.out.println("Minimo:");
		int mn=sc.nextInt();

		numerosAleatorios(n, mn, mx);
	}
	static void numerosAleatorios(int cantidad,int min,int max) {
		for(int i=1;i<=cantidad;i++) {
			int numero=(int)(Math.random()*(max-min+1)+min);
			System.out.println(numero);
		}
	}

}
