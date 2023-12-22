package ejBoletin;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[10];
		
		int opcion=0,nElementos=0;
		do {
			
			System.out.println("1.Insertar un nuevo elemento en su pos");
			System.out.println("2.Modificar");
			System.out.println("3.Eliminar un elemento");
			System.out.println("4.Listar");
			System.out.println("5.Salir");
			System.out.print("Dime una opcion:");
			opcion=sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.print("Numero:");
				int elemento=sc.nextInt();
				if(nElementos<=0) {
					arr[0]=elemento;
					nElementos++;
				}else {
					int i;
					 for(i=nElementos-1;i>=0 && arr[i]>elemento;i--) {
						 		arr[i+1]=arr[i];//movemos 1 en adelante
						 	}
					 arr[i+1]=elemento;
				 		nElementos++;
						 
					 }
				break;
				
			case 2:
				System.out.print("Posicion:");
				int pos=sc.nextInt();
				if(pos>nElementos-1) {
					System.out.println("Posicion no valida");
				}else {
					System.out.print("Nuevo elemento:");
					elemento=sc.nextInt();
					arr[pos]=elemento;
				}
			break;
			
			case 3:
				System.out.print("Posicion:");
				pos=sc.nextInt();
				for(int i=pos;i<nElementos-1;i++) {
					arr[i]=arr[i+1];
				}
				nElementos--;
				break;
			
			case 4:
				for(int i=0;i<nElementos;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				break;
			}
		} while (opcion!=5);

	}

}
