package aplicacion;
import java.util.Scanner;
public class Apl15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("a:");
		double a=sc.nextDouble();
		System.out.print("b:");
		int b=sc.nextInt();
		System.out.print("c:");
		int c=sc.nextInt();
		System.out.print("X:");
		double x=sc.nextDouble();
		
		
		double resultado=(double)(a*Math.pow(x, 2)+b*x+c);
		
		System.out.print("El valor de y es:"+resultado);
		
	}

}
