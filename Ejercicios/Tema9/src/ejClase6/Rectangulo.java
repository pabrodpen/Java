package ejClase6;

public class Rectangulo extends FiguraGeometrica implements Imprimible,ComparadorArea{

	double base,altura;
	
	
	
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
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

	
	@Override
	public void imprimir() {
		System.out.println("Rectangulo: base="+base+", altura="+altura+", color="+color);
	}

}
