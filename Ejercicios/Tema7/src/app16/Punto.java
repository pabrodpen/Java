package app16;

public class Punto {

	double x,y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	void desplazaX(double incremento) {
		x+=incremento;
	}
	
	void desplazaY(double incremento) {
		y+=incremento;
	}
	
	void desplaza(double incrementoX,double incrementoY) {
		x+=incrementoX;
		y+=incrementoY;
	}
	
	double distanciaEuclidea(Punto otro) {
		return Math.sqrt((Math.pow(x-otro.x, 2)+Math.pow(y-otro.y, 2)));
	}
	
	void mostrar() {
		System.out.println("Coordenada del punto:"+x+","+y);
	}
}
