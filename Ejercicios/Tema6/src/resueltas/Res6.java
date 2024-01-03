package resueltas;
import java.text.StringCharacterIterator;
import java.util.Scanner;
public class Res6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Nombre:");
		String nombre=sc.nextLine();
		String nueva="";
		
		String vocales="aeiouAEIOUáéíóúÁÉÍÓÚ";
		
		for(int i=0;i<nombre.length();i++) {
			String aux=String.valueOf(nombre.charAt(i));
			if(!(vocales.contains(aux))) {
				nueva+=nombre.charAt(i);
			}
		}
		
		System.out.println(nueva);
		
	}

}
