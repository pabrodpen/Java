package examenAnioPasado;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//metodo para pasar a binario
		System.out.print("Dime un numero decimal:");
		int decimal=sc.nextInt();
		System.out.println(decimal+" en binario es:"+binario(decimal));
		
		
	}
	static long binario(int n) {
		long resultado=0,base=1;
		int resto;
		while(n>0) {
			resto=n%2;
			resultado+=resto*base;
			base=base*10;
			n=n/2;
		}
		return resultado;
	}

}
