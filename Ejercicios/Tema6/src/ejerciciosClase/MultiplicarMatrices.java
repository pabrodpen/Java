package ejerciciosClase;
import java.util.Scanner;
public class MultiplicarMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Numero de filas de la primera matriz:");
		int n1=sc.nextInt();
		System.out.print("Numero de columnas de la primera matriz:");
		int m1=sc.nextInt();
		
		
		System.out.print("Numero de filas de la segunda matriz:");
		int n2=sc.nextInt();
		System.out.print("Numero de columnas de la segunda matriz:");
		int m2=sc.nextInt();
		
		while(m1!=n2) {
			System.out.println("Las filas de la matriz 2 tienen que ser iguales a las columnas de la matriz 1");
			System.out.print("Numero de filas de la segunda matriz:");
			n2=sc.nextInt();
			System.out.print("Numero de columnas de la primera matriz:");
			m1=sc.nextInt();
		}
		
		int[][]mat1=new int[n1][m1];
		int[][]mat2=new int[n2][m2];
		int elem;
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				System.out.print("Elemento de la primera matriz:");
				elem=sc.nextInt();
				mat1[i][j]=elem;
			}
		}
		
		
		

		for(int i=0;i<n2;i++) {
			for(int j=0;j<m2;j++) {
				System.out.print("Elemento de la segunda matriz:");
				elem=sc.nextInt();
				mat2[i][j]=elem;
			}
		}
		
		int[][]matResultado=new int[n1][m2];
		
		for(int i=0;i<matResultado.length;i++) {
			for(int j=0;j<matResultado[i].length;j++) {
				for(int k=0;k<m1;k++) {
				matResultado[i][j]+=mat1[i][k]*mat2[k][j];
				}
				
			}
		
		}
		
		//mostramos
		System.out.println();
		System.out.println();
		System.out.println("MATRIZ PRODUCTO");
		for(int i=0;i<matResultado.length;i++) {
			for(int j=0;j<matResultado[i].length;j++) {
				System.out.print(matResultado[i][j]+"|");
			}
			System.out.println();
		}
		
		
	}

}
