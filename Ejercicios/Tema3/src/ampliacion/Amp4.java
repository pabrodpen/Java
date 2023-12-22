package ampliacion;
import java.util.Scanner;
public class Amp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		long n=0;
		
		do {
			System.out.print("Dime un numero entero positivo:");
			n=sc.nextInt();
		} while (n<=0);
		
		
		int nPares=0,nImpares=0;
		long cociente=n;
		while(cociente!=0) {
			int cifra=(int)(cociente%10);
			if(cifra%2==0) {
				nPares++;
			}else {
				nImpares++;
			}
			cociente=cociente/10;
		}
		
		System.out.println(n+" contiene "+nPares+" digitos pares y "+nImpares+" digitos impares");
		
	}

}
