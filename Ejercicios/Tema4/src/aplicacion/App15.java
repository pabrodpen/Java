package aplicacion;
import java.util.Scanner;
public class App15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hora 1:");
		int h1=sc.nextInt();
		System.out.println("Minuto1:");
		int m1=sc.nextInt();
		System.out.println("Hora2 :");
		int h2=sc.nextInt();
		System.out.println("Minutos2:");
		int m2=sc.nextInt();
		System.out.println("Diferencia de minutos:"+diferenciaMin(h1, m1, h2, m2));

	}
	
	static int diferenciaMin(int hora1,int minuto1,int hora2,int minuto2) {
		int numMinutos1=0,numMinutos2=0;
		numMinutos1=hora1*60+minuto1;
		numMinutos2=hora2*60+minuto2;
		int diferencia=numMinutos1-numMinutos2;
		if(diferencia<0) {
			diferencia=-diferencia;
		}
		return diferencia;
	}

}
