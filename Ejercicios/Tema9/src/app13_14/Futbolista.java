package app13_14;

public class Futbolista implements Comparable{

	String dni,nombre;
	int edad,nGoles;
	public Futbolista(String dni, String nombre, int edad, int nGoles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getnGoles() {
		return nGoles;
	}
	public void setnGoles(int nGoles) {
		this.nGoles = nGoles;
	}
	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", nGoles=" + nGoles + "]\n";
	}
	
	boolean equals(Futbolista otro) {
		if(dni.equals(otro.dni)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Futbolista futbolista=(Futbolista) o;
		return dni.compareTo(futbolista.dni);
	}
}
