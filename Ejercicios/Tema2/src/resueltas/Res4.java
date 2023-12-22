package resueltas;
import java.util.Scanner;
public class Res4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Dime un numero:");
		int n=scanner.nextInt();
		
		if(n!=0 && n>-1 && n<0) {
			System.out.println(n+ "es un casi cero");
		}else {
			System.out.println(n+ "no es un casi cero");

		}
		
	}

}
