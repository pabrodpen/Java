package resueltas;
import java.util.Scanner;
public class Res12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int num=sc.nextInt();
		int valorAbs=num>=0? num:-num;
		
		System.out.println("El valor absoluto de "+num+" es "+valorAbs);
	}

}
