package ejBoletin;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		int[]arr=new int[10];
		for(int i=0;i<10;i++) {
			System.out.print("Numero:");
			int elemento=sc.nextInt();
			arr[i]=elemento;
		}
		System.out.println("VECTOR INVERSO");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
