package ejClase6;

public class Circulo extends FiguraGeometrica implements Imprimible,ComparadorArea{
	double radio;
	final double PI=Math.PI;

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return PI*Math.pow(radio, 2);
	}

	@Override
	public int compareTo(FiguraGeometrica otra) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

}
