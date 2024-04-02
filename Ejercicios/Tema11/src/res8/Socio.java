package res8;

import java.io.Serializable;

public class Socio implements Serializable{

	String nombre;
	int edad;
	
	
	public Socio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
