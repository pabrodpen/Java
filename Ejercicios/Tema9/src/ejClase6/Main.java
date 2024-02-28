package ejClase6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica f1 = new Circulo(23,"rojo");
		
		FiguraGeometrica f2 = new Rectangulo(null,13,3);
		
		FiguraGeometrica f3=new Triangulo("azul",1,6);
		
		
		f1.imprimir();
		
		f2.imprimir();
		
		f3.imprimir();
		
		f1.comparaAreas(f2, f3);
		
		
	}

}
