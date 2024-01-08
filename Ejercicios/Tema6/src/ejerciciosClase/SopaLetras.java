package ejerciciosClase;
import java.util.Scanner;
public class SopaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		char[][]tablero=new char[4][4];
		
		
		
		
		String[]palabras= {"pala","ola","roca"};
		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero.length;j++) {
				tablero[i][j]=(char) (Math.random()*26+'A');
			}
		}
	}

}
