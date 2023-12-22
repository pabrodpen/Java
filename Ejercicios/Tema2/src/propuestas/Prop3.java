package propuestas;
import java.util.Scanner;
public class Prop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n1=sc.nextInt();
		System.out.print("Dime otro:");
		int n2=sc.nextInt();
		
		boolean iguales;
		
		if(n1==n2 || n1==0 || n2==0) {
			iguales=true;
		}else {
			iguales=false;
		}
		
		System.out.println("Los numeros son iguales o alguno es 0:"+iguales);
	}

}
