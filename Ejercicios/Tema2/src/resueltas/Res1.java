package resueltas;
import java.util.Scanner;
public class Res1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Numero:");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" es par");
		}else {
			System.out.println(n+" es impar");
		}
	}

}
