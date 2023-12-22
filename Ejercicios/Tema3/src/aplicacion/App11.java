package aplicacion;
import java.util.Scanner;
public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		int cociente=n;//para inicializar el cociente y que empecemos desde el numero que introducimos.
		//si pusiesemos cociente=n/2 antes del bucle empezaria saltandose la primera division
		
		
		int elevado=0;
		int binario=0;
		while(cociente!=0) {//si pongo cociente !=1 se salta el ultimo paso(hay que poner cociente !=0
			int resto=cociente%2;//coge el rsto del cociente que ya hemos calculado fuera del bucle
			binario+=resto*Math.pow(10, elevado);//para darle la vuelta al numero(0*10^0+1*10^1)
			elevado++;
			cociente=cociente/2;//volvemos a dividir entre 2
		}
		//binario+=cociente;//le añadimos el ultimo cociente
		
		System.out.println(n+" en binario es "+binario);
		
		
		
		
	}

}
