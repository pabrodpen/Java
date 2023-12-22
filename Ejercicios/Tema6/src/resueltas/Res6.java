package resueltas;
import java.util.Scanner;
public class Res6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Nombre:");
		String nombre=sc.nextLine();
		
		String vocales="aeiouAEIOUáéíóúÁÉÍÓÚ";
		
		for(int i=0;i<nombre.length();i++) {
			CharSequence c=nombre.charAt(i);
			if(vocales.contains(c)) {
				
			}
		}
		
	}

}
