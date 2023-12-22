package aplicacion;
import java.util.Scanner;
public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Kilos de comida:");
		int kg=sc.nextInt();
		
		System.out.print("Numero de animales:");
		int nAnimales=sc.nextInt();
		
		System.out.print("Media de comida");
		double media=sc.nextDouble();
		
		double resultado=(double)kg/nAnimales;
		if(resultado<media) {
			System.out.println("No disponemos de suficiente racion");
			System.out.println("Nueva racion:"+resultado+" kg");
		}
	}

}
