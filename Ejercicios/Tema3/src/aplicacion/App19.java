package aplicacion;
import java.util.Scanner;
public class App19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero para su raiz entera:");
		int n=sc.nextInt();
		
		int cont=1;
		boolean pasado=false;
		while(pasado==false) {
			if(Math.pow(cont, 2)<=n) {
				cont++;
			}else {
				pasado=true;
			}
		}
		cont--;
		System.out.println("La raiz entera de "+n+" es "+cont);
	}

}
