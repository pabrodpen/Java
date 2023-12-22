package aplicacion;
import java.util.Scanner;
public class App11 {

	public static void main(String[] args) {
		//Ahora traducimos una cadena el conjunto 2 al conjunto1
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char conjunto1[]= {'e','i','k','m','p','q','r','s','t','u','v'};
		char conjunto2[]= {'p','v','i','u','m','t','e','r','k','q','s'};
		char[] codificado=new char[conjunto2.length];
		
		System.out.print("Dime una frase:");
		String frase=teclado.nextLine();
		frase= frase.toLowerCase();//Pasamos a minusculas
		for(int i=0;i<frase.length();i++) {
			codificado[i]=codifica(conjunto1,conjunto2,frase.charAt(i));
	}
		System.out.println(codificado);
		
}
	static char codifica(char conjunto1[],char conjunto2[],char c) {
		//Este metodo devuelve EL CARACTER TRADUCIDO-->COMO LA LLAMADA AL METODO LO TENEMOS EN UN FOR
		//SE VA A IR REPITIENDO HASTA QUE DEVUELVA LA CADENA ENTERA
		//Convertimos conjunto2 en un string con todos sus elementos
		char traducido;//Declaramos una variable que devolveremos en caso de que se traduzca
		String cjto2=String.valueOf(conjunto2);
		int i;
		int pos=cjto2.indexOf(c);//Buscamos el elemento de c en cjto2
		//SI NO CONVIRTIESEMOS conjunto2 EN UN STRING-->TENDRIAMOS QUE BUSCARLO MANUALMENTE EN UN FOR
		if(pos==-1) {
			traducido=c;//Si no encuentra el caracter en el cjto 1 significa que no esta traducido,
			//por lo que se devuelve el caracter tal como estaba
		}else {
			traducido=conjunto1[pos];
		}
		
		return traducido;
	}

}

