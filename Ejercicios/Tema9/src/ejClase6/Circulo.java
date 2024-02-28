package ejClase6;

public class Circulo extends FiguraGeometrica implements Imprimible,ComparadorArea {
	double radio;
	final double PI=Math.PI;
	

	public Circulo(double radio,String color) {
		super(color);
		this.radio = radio;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return PI*Math.pow(radio, 2);
	}

	
	@Override
	public void imprimir() {
		System.out.println("Circulo: radio="+radio+", color="+color);
	}


	@Override
	public void comparaAreas(FiguraGeometrica f1, FiguraGeometrica f2) {
	    double area1 = f1.calcularArea();
	    double area2 = f2.calcularArea();

	    if (area1 > area2) {
	        System.out.println("La primera figura es mayor");
	    } else if (area1 < area2) {
	        System.out.println("La segunda figura es mayor");
	    } else {
	        System.out.println("Las figuras tienen el mismo área");
	    }
	}


}
