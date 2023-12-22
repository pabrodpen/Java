package ejBoletin;
import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[]arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*100-1+1)+1;
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nDime un numero:");
		int n=sc.nextInt();
		
		boolean encontrado=false;
		for(int i=0;i<arr.length && !encontrado;i++) {
			if(arr[i]==n) {
				encontrado=true;
			}
		}
		if(encontrado) {
			System.out.println(n+" esta en la lista");
		}else {
			System.out.println(n+" no esta en la lista");
		}
	}

}
