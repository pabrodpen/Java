package resueltas;
import java.util.Scanner;

import org.w3c.dom.html.HTMLFrameSetElement;
public class Res8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime una frase:");
		String frase=sc.nextLine();
		
		if(frase.indexOf("Javalin, javalon")==0) {
			System.out.println("Es idioma de javalandia");
			frase=frase.replace("Javalin, javalon", "");
			frase=frase.strip();
			System.out.println("Frase sin muletillas:"+frase);
		}else if(frase.lastIndexOf("	javalen, len, len")==0){
			System.out.println("Es idioma de javalandia");
			frase=frase.replace("	javalen, len, len","");
			frase=frase.strip();
			System.out.println("Frase sin muletillas:"+frase);
		}else if(frase.lastIndexOf(" javalen, len, len")==0) {
			System.out.println("Es idioma de javalandia");
			frase=frase.replace(" javalen, len, len","");
			frase=frase.strip();
			System.out.println("Frase sin muletillas:"+frase);
		}else {
			System.out.println("No es idioma de javalandia");
		}
	}

}
