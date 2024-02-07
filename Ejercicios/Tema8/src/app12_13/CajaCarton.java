package app12_13;

public class CajaCarton extends Caja{

	public CajaCarton(int ancho, int alto, int fondo) {
		super(ancho, alto, fondo, Unidad.CM);
		// TODO Auto-generated constructor stub
	}
	
	double getVolumen() {
		return super.getVolumen()*0.8;
	}

	double getArea() {
		return ancho*alto;
	}
	
	void setEtiqueta(String etiqueta) {
		super.setEtiqueta(etiqueta);
	}
	

	@Override
	public String toString() {
		return "CajaCarton [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + 
				", etiqueta=" + etiqueta + "]";
	}
	
	
}
