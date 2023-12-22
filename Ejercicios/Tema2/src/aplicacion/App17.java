package aplicacion;
import java.util.Scanner;
public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n1=(int)Math.random()*99;
		int n2=(int)Math.random()*99;
		
		System.out.print("Cuanto es "+n1+"+"+n2);
		int suma=sc.nextInt();
		
		if(suma==(n1+n2)) {
			System.out.println("Respuesta correcta");
		}else {
			System.out.println("Incorrecto");
		}
	}

}
