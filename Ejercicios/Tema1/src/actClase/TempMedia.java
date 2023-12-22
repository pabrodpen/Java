package actClase;

import java.util.Scanner;
public class TempMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Temperatura 1:");
		int t1=sc.nextInt();
		System.out.print("Temperatura 2:");
		int t2=sc.nextInt();
		System.out.print("Temperatura 3:");
		int t3=sc.nextInt();
		System.out.print("Temperatura 4:");
		int t4=sc.nextInt();
		double media;
		
		media=(double)(t1+t2+t3+t4)/4;
		
		System.out.println("La media es:"+media);
		
		
		
	
		
	}

}
