package res1;

public class Gestor {
	
	String nombre,tfno;
	double importeMax;
	@Override
	public String toString() {
		return "Gestor [nombre=" + nombre + ", tfno=" + tfno + ", importeMax=" + importeMax + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTfno() {
		return tfno;
	}
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	public double getImporteMax() {
		return importeMax;
	}
	public void setImporteMax(double importeMax) {
		this.importeMax = importeMax;
	}
	
	
}
