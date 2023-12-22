package aplicacion;
import java.util.Scanner;
public class Apl20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		double n=sc.nextDouble();
		
		double resultado=Math.sqrt(n);
		System.out.println("Raiz cuadrada de "+n+" es "+resultado);
		
	}

}
