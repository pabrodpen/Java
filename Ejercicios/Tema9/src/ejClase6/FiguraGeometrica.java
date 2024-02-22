package ejClase6;

public abstract class FiguraGeometrica implements Imprimible,ComparadorArea{
	String color;
	
	public abstract double calcularArea();

	@Override
	public void imprimir() {
		System.out.println(toString());
	}

	public FiguraGeometrica(String color) {
		super();
		this.color = "verde";
	}

	public FiguraGeometrica() {
		super();
	}
	
	
	
	

	
}
