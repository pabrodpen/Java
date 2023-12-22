package resueltas;
import java.util.Scanner;
public class Res11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		int producto=1;
		for(int i=n;i>=1;i--) {
			producto*=i;
			System.out.print(i+"x");
		}
		System.out.print("="+producto);
	}

}
