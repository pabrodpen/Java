package aplicacion;
import java.util.Scanner;
public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int divisores=2;
			boolean primo=true;
			while(divisores<i && primo==true) {//comprobamos los posibles divisores de ese numero del 2 al n-1(divisores<i)
				if(i%divisores==0) {
					primo=false;
				}
				divisores++;
			}
			
			if(primo==true) {
				System.out.println(i+" es primo");
			}else {
				System.out.println(i+" no es primo");
			}
			
		}
		
	}

}
