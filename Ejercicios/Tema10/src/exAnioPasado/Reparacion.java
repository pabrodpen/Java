package exAnioPasado;

public class Reparacion implements Comparable{

	String matricula,descripcion;
	double precio;
	public Reparacion(String matricula, String descripcion, double precio) {
		super();
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	


	@Override
	public String toString() {
		return "Reparacion [matricula=" + matricula + ", descripcion=" + descripcion + ", precio=" + precio + "]\n";
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


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Reparacion reparacion=(Reparacion) o;
		if(matricula.compareTo(reparacion.getMatricula())==0){
			return (int) (precio-reparacion.precio);
		}else {
			return matricula.compareTo(reparacion.getMatricula());

		}
	}
	
	
	
}
