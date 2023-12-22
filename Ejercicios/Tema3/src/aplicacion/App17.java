package aplicacion;
import java.util.Scanner;
public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int a=sc.nextInt();
		System.out.print("Dime un otro:");
		int b=sc.nextInt();
		
		int mayor,menor,mcd=-1;
		mayor=a>b? a:b;
		menor=a<b? a:b;
		
		boolean encontrado=false;//los divisores estaran entre 1 y el numero menor
		for(int i=menor;i>=1 && encontrado==false;i--) {
			if(mayor%i==0 && menor%i==0) {
				mcd=i;
				encontrado=true;
			}
		}
		
		System.out.println("El maximo comun divisor entre "+mayor+" y "+menor+" es "+mcd);
		
	}

}
