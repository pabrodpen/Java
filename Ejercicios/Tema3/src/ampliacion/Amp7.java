package ampliacion;
import java.util.Scanner;
public class Amp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int suma=0,cantidadNumeros=0;
		while(suma<=10000) {
			System.out.print("Dime un numero:");
			int n=sc.nextInt();
			suma+=n;
			cantidadNumeros++;
		}
		System.out.println("Valor acumulado:"+suma);
		System.out.println("Numeros introducidos:"+cantidadNumeros);
		double media=(double)suma/cantidadNumeros;
		System.out.println("Media:"+media);
	}

}
