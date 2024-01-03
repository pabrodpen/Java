package resueltas;
import java.util.Scanner;
public class Res3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Contraseña:");
		String passwd=sc.next();
		
		boolean acertado=false;
	
		
		while(!acertado) {
			System.out.print("Dime una palabra:");
			String intento=sc.next();
			
			if(intento.compareTo(passwd)==0) {
				System.out.println("HAS ACERTADO!");
				acertado=true;
			}else if(intento.compareTo(passwd)>0) {
				System.out.println("La contraseña es menor alfabeticamente");
			}else {
				System.out.println("La contraseña es mayor alfabeticamente");
			}
		}
		
	}

}
