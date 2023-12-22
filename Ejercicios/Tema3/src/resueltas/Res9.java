package resueltas;
import java.util.Scanner;
public class Res9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.print("Dime un numero del 1 al 10:");
			n=sc.nextInt();
		} while (n<1 || n>10);
		
		System.out.println("TABLA DEL "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
