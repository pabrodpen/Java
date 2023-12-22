package aplicacion;
import java.util.Scanner;
public class Apl14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Base:");
		double base=sc.nextDouble();
		System.out.print("Altura:");
		double altura=sc.nextDouble();
		
		double area=(base*altura)/2;
		
		System.out.println("Area del triangulo:"+area);
	}

}
