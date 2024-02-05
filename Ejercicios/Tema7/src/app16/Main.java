package app16;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1=new Punto(3.6,7.3);
		
		p1.mostrar();
		p1.desplazaX(2);
		p1.mostrar();
		p1.desplaza(1, 2.4);
		p1.mostrar();
		
		Punto p2=new Punto(2.8, 12.7);
		
		System.out.println("Distancia entre los 2 puntos:"+p1.distanciaEuclidea(p2));
	}

}
