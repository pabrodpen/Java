package resueltas;
import java.util.Scanner;
public class Res3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n1=sc.nextInt();
		System.out.print("Diem otro:");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+" es mayor que "+n2);
		}else if(n1<n2){
			System.out.println(n2+" es mayor que "+n1);
		}else {
			System.out.println("Son iguales");
		}
	}

}
