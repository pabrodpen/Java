package ejClase6;

public class Circulo extends FiguraGeometrica {
	double radio;
	final double PI=Math.PI;
	
	
	

	
	
	





	public Circulo(double radio) {
		this.radio = radio;
	}



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
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + "]";
	}














	@Override
	public void comparaAreas(FiguraGeometrica f1, FiguraGeometrica f2) {
		// TODO Auto-generated method stub
		Circulo circulo1=(Circulo) f1;
		Circulo circulo2=(Circulo) f2;
		if(f1.calcularArea()-f2.calcularArea()>0) {
			System.out.println("la primera figura es mayor");
		}else if(f1.calcularArea()-f2.calcularArea()<0) {
			System.out.println("la segunda figura es mayor");

		}else {
			System.out.println("son iguales");

		}
		
	}

}
