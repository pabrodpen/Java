package ejClase7;

public class Circulo extends ClasePadre implements FiguraGeometrica,Comparable{

	double radio;
	
	

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}




	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
		// TODO Auto-generated method stub
		
	}




	@Override
	public int comparaArea(FiguraGeometrica otra) {
		// TODO Auto-generated method stub
		return (int) (calcularArea()-otra.calcularArea());
	}




	
	
	
}
