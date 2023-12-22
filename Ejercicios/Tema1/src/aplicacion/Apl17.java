package aplicacion;
import java.util.Scanner;
public class Apl17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime una cantidad en mm:");
		int mm=sc.nextInt();
		System.out.print("Dime una cantidad en cm:");
		int cm=sc.nextInt();
		System.out.print("Dime una cantidad en m:");
		int m=sc.nextInt();
		
		double resultado=(double)(m*100+cm+mm*0.1);
		
		System.out.println("La cantidad en total son "+resultado+" cm");
	}

}
