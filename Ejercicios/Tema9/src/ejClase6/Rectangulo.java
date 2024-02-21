package ejClase6;

public class Rectangulo extends FiguraGeometrica implements Imprimible,ComparadorArea{

	double base,altura;
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

}
