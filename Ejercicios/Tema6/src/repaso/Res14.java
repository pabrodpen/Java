package repaso;
import java.util.Scanner;
public class Res14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String palabra="palabra";
		boolean desordenando=true;
		char[]aux=new char[palabra.length()];
		while(desordenando) {
			int pos1=(int)(Math.random()*palabra.length());
			int pos2=(int)(Math.random()*palabra.length());
			while(pos1==pos2) {
				pos2=(int)(Math.random()*palabra.length());
			}
			aux=palabra.toCharArray();
			char c=aux[pos1];
			aux[pos1]=aux[pos2];
			aux[pos2]=c;
			
			System.out.print("Quieres seguir desordenando?");
			String respuesta=sc.nextLine();
			if(respuesta.equals("no")) {
				desordenando=false;
			}
		}
		
		String desordenada=String.valueOf(aux);
		
		System.out.println(desordenada);
	}

}
