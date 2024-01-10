package ejClase;
import java.util.Scanner;
public class MatrizPorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		System.out.print("Numero de columnas:");
		int m=sc.nextInt();
		System.out.print("Numero a multiplicar:");
		int numero=sc.nextInt();
		
		int matriz[][]=new int[n][m];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print("Elemento de la matriz:");
				int elem=sc.nextInt();
				matriz[i][j]=elem;
			}
		}
		
		
		int resultado[][]=new int[n][m];
		
		for(int i=0;i<resultado.length;i++) {
			for(int j=0;j<resultado[i].length;j++) {
				resultado[i][j]=numero*matriz[i][j];
			}
		}
		
		//mostramos
		for(int i=0;i<resultado.length;i++) {
			for(int j=0;j<resultado[i].length;j++) {
				System.out.print(resultado[i][j]+"|");
			}
			System.out.println();
		}
		
	}

}
