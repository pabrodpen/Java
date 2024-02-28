package ejClase7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FiguraGeometrica[]figuras=new FiguraGeometrica[3];
		
		figuras[0]=new Circulo("azul", 2);
		
		Punto[]puntos1= {new Punto(2,3),new Punto(1, 0),new Punto(-3, 2),new Punto(5, 7)};
		figuras[1]=new Cuadrado("rojo", puntos1);
		
		Punto[]puntos2= {new Punto(5,10),new Punto(11, 6),new Punto(-3, -7)};
		figuras[2]=new Triangulo(null, puntos2);
		
		
		System.out.println(Arrays.toString(figuras));
	}

}
