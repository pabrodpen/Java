package resueltas;
import java.util.Scanner;
public class Res4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);

		System.out.print("Dime una frase:");
		String frase=scanner.nextLine();
		int numEspacios=0;
		
		for(int i=0;i<frase.length();i++) {
			if(Character.isSpace(frase.charAt(i))) {
				numEspacios++;
			}
		}
		
		System.out.println(frase);
		System.out.println("Numero de espacios:"+numEspacios);
		
	}

}
