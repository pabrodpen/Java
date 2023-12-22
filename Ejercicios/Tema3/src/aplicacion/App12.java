package aplicacion;
import java.util.Scanner;
public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero en binario:");
		int n=sc.nextInt();
		int potencia=0,decimal=0;
		int binario=n;
		//separamos las cifras
		
	
		
		while(binario!=0) {
			decimal+=(binario%10)*Math.pow(2, potencia);
			potencia++;
			binario=binario/10;
		}
		
		System.out.println(n+" en decimal es "+decimal);
	}

}
