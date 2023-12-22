package resueltas;
import java.util.Scanner;
public class Res5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int numOperacionesCorrectas=0;
		int suma=0,n1=0,n2=0;
		do {
			n1=(int)(Math.random()*(100-1+1)+1);
			n2=(int)(Math.random()*(100-1+1)+1);
			
			System.out.print("¿Cuanto es "+n1+"+"+n2+":");
			suma=sc.nextInt();
			if(suma==(n1+n2)) {
				numOperacionesCorrectas++;
			}
		} while (suma==(n1+n2));
		
		
		System.out.println("Has fallado, numero de operaciones correctas:"+numOperacionesCorrectas);
		
	}

}
