package figuras;
import java.util.Scanner;
public class PiramideVacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Numero de filas:");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {//cuenta las lineas
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");//hago los espacios de la izquierda
			}
			/*
			 igual que en la piramide normal pero dentro del for de k (que es el que
			 imprime los asteriscos contando las columnas) hacemos un if
			 
			 si k=0 significa que en cada fila imprimimos * en la primera columna
			 si k=i significa que en cadafila imprimimos * en la ultima columna
			 si i=n-1 significa que  imprimimos todos los * de la ultima fila 
			 
			 * */
			for(int k=0;k<=i;k++) {
				if(k==0 ||i==n-1 || k==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}

}
