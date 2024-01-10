package ejClase;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);		
		
		
		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		
		System.out.print("Numero de columnas:");
		int m=sc.nextInt();
		
		int[][]mat=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("Elemento de la matriz:");
				int elemento=sc.nextInt();
				mat[i][j]=elemento;
			}
			
		}
		
		//mostramos
		System.out.println("MATRIZ SELECCIONADA");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
				
		System.out.println();
		System.out.println();
		
		
		
		int[][]traspuesta=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				traspuesta[i][j]=mat[j][i];
			}
		}
		
		//mostramos
		System.out.println("MATRIZ TRASPUESTA");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(traspuesta[i][j]+" ");
			}
			System.out.println();
		}
	}

}
