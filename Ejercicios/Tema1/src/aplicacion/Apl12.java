package aplicacion;
import java.util.Scanner;
public class Apl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=scanner.nextInt();
		
		
		int aux=n%7==0? 0: 7*(n/7+1)-n;//MUY IMP COMO SE ASIGNA EL VALOR DE AUX
		//ej de la formula: 31/7->cociente 4 
		//para que 31 llegue a 35-->4
		//7*(31/7+1)-31=4-->estoy haciendo lo mismo para calcular el resto pero del siguiente muyltiplp(+1)
		
		System.out.println("A "+n+" hay que sumarle "+aux+" para que sea multiplo de 7");
		
	}

}
