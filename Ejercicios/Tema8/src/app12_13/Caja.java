package app12_13;

public class Caja {

	
	int ancho,alto,fondo;
	Unidad unidad;
	String etiqueta;
	
	

	public Caja(int ancho, int alto, int fondo,Unidad unidad) {
		super();
		if(unidad.equals(Unidad.CM)) {
			this.ancho = ancho/100;
			this.alto = alto/100;
			this.fondo = fondo/100;
		}else {
			this.ancho = ancho;
			this.alto = alto;
			this.fondo = fondo;
		}
		this.unidad=unidad;

		
	};
	
	double getVolumen() {//en metros cubicos
		return (double)(ancho*alto*fondo);
	}
	
	void setEtiqueta(String etiqueta) {
		this.etiqueta=etiqueta;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
				+ etiqueta + "]";
	}

	
	
}
