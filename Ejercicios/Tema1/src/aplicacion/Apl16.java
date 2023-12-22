package aplicacion;
import java.util.Scanner;
public class Apl16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime una cantidad de segundos:");
		int num=sc.nextInt();
		
		int seg=num%60;
		int min=(num/60)%60;
		int horas=(num/60)/60;
		
		System.out.print(num+" segundos son "+horas+" horas, "+min+" minutos y "+seg+" segundos");
	}

}
