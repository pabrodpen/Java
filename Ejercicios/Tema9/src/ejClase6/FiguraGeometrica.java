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
		if(color==null) {
			this.color = "verde";
		}else {
			this.color=color;
		}
	}

	public FiguraGeometrica() {
		super();
	}
	
	
	
	

	
}
