package resueltas;
import java.util.Scanner;
public class Res13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Frase:");
		String frase=sc.nextLine();
		int nVeces=0;
		
		frase=frase.toLowerCase();
		
		for(char letra='a';letra<='z';letra++) {
			for(int i=0;i<frase.length();i++) {
				if(frase.charAt(i)==letra) {
					nVeces++;
				}
			}
			if(nVeces>0) {
				System.out.println(letra+" aparece "+nVeces+" veces");
			}
			nVeces=0;
		}
	}

}
