package ejClase1;

import java.util.Arrays;

public class Alumno {

	String dni,nombre;
	Integer[] codAsig=new Integer[0];
	Integer[]nombreAsig=new Integer[0];
	public Alumno(String dni, String nombre, Integer[] codAsig, Integer[] nombreAsig) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.codAsig = codAsig;
		this.nombreAsig = nombreAsig;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", codAsig=" + Arrays.toString(codAsig) + ", nombreAsig="
				+ Arrays.toString(nombreAsig) + "]";
	}
	
	
	
	
}
