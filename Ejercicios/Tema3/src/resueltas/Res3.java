package resueltas;
import java.util.Scanner;
public class Res3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int numSecreto=(int)(Math.random()*(100-1+1)+1);
		
		System.out.print("Adivina el numero secreto(rindete pulsando -1):");
		int n=sc.nextInt();
		while(n!=numSecreto && n!=-1) {

			if(n>numSecreto) {
				System.out.print("El numero secreto es menor, vuelve a intentarlo:");
			}else {
				System.out.print("El numero secreto es mayor, vuelve a intentarlo");
			}
			n=sc.nextInt();
		}
		
		
		
		if(n==numSecreto) {
			System.out.println("Has acertado");
		}else {
			System.out.println("El numero secreto era "+numSecreto);
		}
	}

}
