package amp31;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	String dni,nombre;
	LocalDate fechaNac;
	double saldo;
	public Cliente(String dni, String nombre, String fechaNac, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNac = LocalDate.parse(fechaNac,formatter);
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", saldo=" + saldo + "]";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
