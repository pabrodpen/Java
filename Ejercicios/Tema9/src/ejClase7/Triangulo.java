package ejClase7;

import java.util.Arrays;

public class Triangulo extends ClasePadre implements FiguraGeometrica,Comparable{

	Punto[]puntos=new Punto[3];
	
	




	public Triangulo(String color, Punto[] puntos) {
		super(color);
		this.puntos = puntos;
	}

	


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return ((puntos[0].y-puntos[1].y)*(puntos[0].x-puntos[1].x))/2;
	}



	@Override
	public String toString() {
		return "Triangulo [puntos=" + Arrays.toString(puntos) + ", color=" + color + ", area="
				+ calcularArea() + "]";
	}
	
	@Override
	public int comparaArea(FiguraGeometrica otra) {
		// TODO Auto-generated method stub
		return (int) (calcularArea()-otra.calcularArea());
	}

}
