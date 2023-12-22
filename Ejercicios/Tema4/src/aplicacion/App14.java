package aplicacion;
import java.util.Scanner;
public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Horas:");
		int horas=sc.nextInt();
		System.out.println("Minutos:");
		int min=sc.nextInt();
		System.out.println("Segundos:");
		int seg=sc.nextInt();
		
		System.out.println("Numero total de segundos:"+numSegundos(horas, min, seg));
		
	}
	static int numSegundos(int h,int m,int s) {
		int numSegundos=0;
		numSegundos+=h*3600;
		numSegundos+=m*60;
		numSegundos+=s;
		return numSegundos;
	}

}
