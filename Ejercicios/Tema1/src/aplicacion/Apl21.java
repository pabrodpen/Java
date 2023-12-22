package aplicacion;
import java.util.Scanner;
public class Apl21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n1=sc.nextInt();
		System.out.print("Dime otro:");
		int n2=sc.nextInt();
		
		boolean iguales=n1==n2? true:false;
		
		System.out.println(n1+" y "+n2+" son iguales:"+iguales);
	}

}
