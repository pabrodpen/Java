package resueltas;
import java.util.Scanner;
public class Res13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Frase:");
		String frase=sc.nextLine();
		int nVeces=0;
		for(int i=0;i<frase.length();i++) {
			for(int j=0;j<frase.length();j++) {
				if(frase.charAt(i)==frase.charAt(j)) {
					nVeces++;
				}
			}
			System.out.println(frase.charAt(i)+": "+nVeces+" veces");
			nVeces=0;
		}
	}

}
