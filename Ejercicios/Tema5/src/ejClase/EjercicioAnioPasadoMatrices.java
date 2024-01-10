package ejClase;
import java.util.Scanner;
public class EjercicioAnioPasadoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear y rellenar una matriz de la cual indicamos el numero de filas pero 
		//al recorrer cada fila indicamos el numero de columnas para cada fila

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Numero de filas:");
		int n=sc.nextInt();
		
		int matriz[][]=new int[n][];
		
		for(int i=0;i<matriz.length;i++) {
			System.out.print("Numero de columnas para esta fila:");
			int m=sc.nextInt();
			
			 // Crear la fila con el número de columnas especificado
            matriz[i] = new int[m];
            
			for(int j=0;j<m;j++) {
				System.out.print("Elemento de la matriz:");
				int elem=sc.nextInt();
				matriz[i][j]=elem;
			}
		}
		
		//mostramos
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
	}

}
