package ejClase2;

public class Alumno implements Comparable{
	String dni,nombre,apellidos;
	int n1,n2,n3;
	public Alumno(String dni, String nombre, String apellidos, int n1, int n2, int n3) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}

	public double notaMedia() {
		return (double) (n1+n2+n3)/3;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Alumno alumno=(Alumno) o;
		return nombre.compareTo(alumno.nombre);
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia()=" + notaMedia()
				+ "]";
	}
	

	

	
	

}
