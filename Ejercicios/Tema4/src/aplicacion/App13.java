package aplicacion;
import java.util.Scanner;
public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero:");
		int num=sc.nextInt();
		muestraPares(num);
		
		
	}
	static void muestraPares(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
