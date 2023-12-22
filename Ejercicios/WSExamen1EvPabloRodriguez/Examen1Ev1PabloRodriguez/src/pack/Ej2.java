package pack;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime la base:");
		double base=sc.nextDouble();
		
		int exponente=0;
		do {
			System.out.print("Dime el exponente:");
			exponente=sc.nextInt();
		} while (exponente<=0);
		
		
		
		for(int i=1;i<=exponente;i++) {
			System.out.println(base+"^"+i+"="+Math.pow(base, i));
		}
	}

}
