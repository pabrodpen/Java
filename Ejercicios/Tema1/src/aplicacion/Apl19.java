package aplicacion;
import java.util.Scanner;
public class Apl19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Numero de entradas infantiles:");
		int numInf=sc.nextInt();
		System.out.print("Numero de entradas adultas:");
		int numAdult=sc.nextInt();
		
		double aux=(double)(numInf*15.5+numAdult*20);
		double resultado=aux>100? aux*0.95:aux;
		
		System.out.println("El precio final de las entradas es:"+resultado);
	}

}
