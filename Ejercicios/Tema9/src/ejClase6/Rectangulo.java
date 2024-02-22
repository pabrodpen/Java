package ejClase6;

public class Rectangulo extends FiguraGeometrica implements Imprimible,ComparadorArea{

	double base,altura;
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public void comparaAreas(FiguraGeometrica f1, FiguraGeometrica f2) {
		// TODO Auto-generated method stub
				Rectangulo rectangulo1=(Rectangulo) f1;
				Rectangulo rectangulo2=(Rectangulo) f2;
				if(f1.calcularArea()-f2.calcularArea()>0) {
					System.out.println("la primera figura es mayor");
				}else if(f1.calcularArea()-f2.calcularArea()<0) {
					System.out.println("la segunda figura es mayor");

				}else {
					System.out.println("son iguales");

				}
		
	}

}
