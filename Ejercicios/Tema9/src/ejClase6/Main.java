package ejClase6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica c1 = new Circulo(23,"rojo");
		
		FiguraGeometrica c2 = new Circulo(33);
		
		c1.imprimir();
		c2.imprimir();
		
		c1.comparaAreas(c1,c2);
		
		
	}

}
