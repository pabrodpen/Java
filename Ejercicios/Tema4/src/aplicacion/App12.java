package aplicacion;
import java.util.Scanner;
public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Coordenada x del punto 1");
		double x1=sc.nextDouble();
		System.out.println("Coordenada y del punto 1");
		double y1=sc.nextDouble();
		System.out.println("Coordenada x del punto 2");
		double x2=sc.nextDouble();
		System.out.println("Coordenada y del punto 2");
		double y2=sc.nextDouble();
		System.out.println("Distancia euclidea:"+distancia(x1, y1, x2, y2));

	}
	static double distancia(double x1,double y1,double x2,double y2) {
		double resultado=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
		return resultado;
	}

}
