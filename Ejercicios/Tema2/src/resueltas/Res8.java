package resueltas;
import java.util.Scanner;

public class Res8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		double x1,x2,d;
		
		System.out.print("Dime el valor de a:");
			a=sc.nextInt();
		System.out.print("Dime el valor de b:");
			b=sc.nextInt();
		System.out.print("Dime el valor de c:");
			c=sc.nextInt();
			
		d=Math.pow(b,2)-4*a*c;
		
		if (d<0){
			System.out.print("El numero no existe");
			}else if (a==0){
				System.out.print("El numero no es real");
				}else{
			x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
			x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		
			System.out.println("Valor 1:"+x1);
			System.out.println("Valor 2:"+x2);
			}

	}
}
