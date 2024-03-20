package exAnioPasado;

public class Reparacion {

	int cod;
	static int cont=0;
	String matricula,descripcion;
	double precio;
	public Reparacion(String matricula, String descripcion, double precio) {
		super();
		this.cod=cont++;
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	
	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	@Override
	public String toString() {
		return "Reparacion [matricula=" + matricula + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
