package ejClase6;

public class Triangulo extends FiguraGeometrica implements Imprimible,ComparadorArea{

	double base,altura;
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

}
