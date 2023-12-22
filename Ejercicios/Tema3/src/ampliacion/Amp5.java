package ampliacion;
import java.util.Scanner;
public class Amp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=0;
		
		do {
			System.out.print("Dime un numero positivo:");
			n=sc.nextInt();
		} while (n<=0);
		
		for(int i=0;i<5;i++) {
			boolean primo=true;
			int cont=2;
			while(cont<=n/2 && primo==true) {
				if(n%cont==0) {
					primo=false;
				}else {
					cont++;
				}
			}
			if(primo==false) {
				System.out.println(n+" no es primo");
			}else {
				System.out.println(n+" es primo");
			}
			n++;
		}
	}

}
