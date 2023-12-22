package aplicacion;
import java.util.Scanner;
public class App20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		double dinero=0;
		double suma=0;
		do {
			System.out.print("Cantidad de dinero:");
			dinero=sc.nextDouble();
			suma+=dinero;
		} while (dinero!=0);
		
		System.out.println("Dinero total:"+suma);
	}

}
