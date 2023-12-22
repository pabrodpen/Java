package aplicacion;
import java.util.Scanner;
public class Apl11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Base imponible:");
		double base=sc.nextDouble();
		
		System.out.print("IVA:");
		int iva=sc.nextInt();
		
		double resultado=base+base*(iva/100.0);
		
		System.out.println("Precio final:"+resultado);
	}

}
