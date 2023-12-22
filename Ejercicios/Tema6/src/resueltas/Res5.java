package resueltas;

import java.util.Scanner;

public class Res5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);

		System.out.print("Dime una frase:");
		String frase=scanner.nextLine();
		String inverso="";
		
		for(int i=frase.length()-1;i>=0;i--) {
			inverso+=frase.charAt(i);
		}
		
		System.out.println(frase);
		System.out.println("Frase invertida:"+inverso);
	}

}
