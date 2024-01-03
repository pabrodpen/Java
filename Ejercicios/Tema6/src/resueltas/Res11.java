package resueltas;
import java.util.Scanner;
public class Res11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		char conjunto1[] = {'e', 'i', 'k', 'm', 'p','q', 'r', 's', 't', 'u', 'v'};
		char conjunto2[] = {'p', 'v', 'i', 'u', 'm','t', 'e', 'r', 'k', 'q', 's'};
		
		System.out.print("Tu nombre:");
		String nombre=sc.nextLine();
		
		nombre=nombre.toLowerCase();
		String codificado="";
		
		for(int i=0;i<nombre.length();i++) {
			char caracter=nombre.charAt(i);
			caracter=codifica(conjunto1, conjunto2, nombre.charAt(i));
			codificado+=caracter;
		}
		
		System.out.println("Codificado:"+codificado);
		

	}
	static char codifica(char cjto1[],char cjto2[],char c) {
		boolean encontrado=false;//IMP LA FLAG
		for(int i=0;i<cjto1.length && !encontrado;i++) {
			if(c==cjto1[i]) {
				c=cjto2[i];
				encontrado=true;
			}
		}
		return c;
	}

}
