package aplicacion;
import java.util.Scanner;
public class App18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int a=sc.nextInt();
		System.out.print("Dime otro:");
		int b=sc.nextInt();
		
		int mayor=a>b? a:b;
		
		int mcm=-1;
		int cont=mayor;
		boolean encontrado=false;
		while(encontrado==false) {
			if(cont%a==0 && cont%b==0) {//ej: entre 3 y 7-->21 -->21%3==0 y 21%7==0,  eso significa que es multiplo
				mcm=cont;
				encontrado=true;
			}
			cont++;
		}
		
		System.out.println("Minimo comun multiplo entre "+a+" y "+b+" es "+mcm);

	}

}
