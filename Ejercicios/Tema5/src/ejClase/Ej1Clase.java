package ejClase;
import java.util.Scanner;
public class Ej1Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear tabla que sean los 10 primeros numeros naturales y mostrar por pantalla
		Scanner sc=new Scanner(System.in);

		int [] arr=new int[10];
		int n=0;
		for(int i=0;i<10;i++) {
			do {
				System.out.println("Dime un numero natural:");
				n=sc.nextInt();
			} while (n<=0);
			arr[i]=n;
			
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}

}
