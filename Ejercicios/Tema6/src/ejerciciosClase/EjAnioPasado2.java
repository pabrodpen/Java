package ejerciciosClase;
import java.util.Scanner;
public class EjAnioPasado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//metodo que diga las ocurrencias de una palabra en una
		//matriz char
		
		Scanner sc=new Scanner(System.in);
		
		char[][]mat= {{'h','o','l','a'},{'p','e','r','a'},{'h','o','l','a'},{'p','e','r','a'}};
		
		System.out.print("Palabra:");
		String palabra=sc.nextLine();
		String aux="";
		int nVeces=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
					aux+=mat[i][j];
			}
			if(palabra.equals(aux)) {
				nVeces++;
			}
			aux="";
		}
		
		System.out.println("Numero de ocurrencias de "+palabra+":"+nVeces+" veces");
	}

}
