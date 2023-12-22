package resueltas;
import java.util.Scanner;
public class Res13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Nota del primer trimestre:");
		int primero=sc.nextInt();
		System.out.print("Nota del segundo trimestre:");
		int segundo=sc.nextInt();
		System.out.print("Nota del tercer trimestre:");
		int tercer=sc.nextInt();
		
		int notaBoletin=(primero+segundo+tercer)/3;
		double notaExp=(primero+segundo+tercer)/3.0;
		
		System.out.println("Media del curso del boletin:"+notaBoletin);
		System.out.println("Media del curso del expediente academico:"+notaExp);
	}

}
