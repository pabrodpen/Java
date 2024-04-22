package ejClase1;

import java.io.Serializable;
import java.util.Arrays;

public class Alumno implements Serializable{

	String dni,nombre;
	ParCodAsign[] notasPorAsign=new ParCodAsign[5];
	public Alumno(String dni, String nombre, ParCodAsign[] notasPorAsign) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.notasPorAsign = notasPorAsign;
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
	public ParCodAsign[] getNotasPorAsign() {
		return notasPorAsign;
	}
	public void setNotasPorAsign(ParCodAsign[] notasPorAsign) {
		this.notasPorAsign = notasPorAsign;
	}
	
	
	
	
	
}
