package amp31;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	String dni,nombre;
	LocalDate fechaNac;
	double saldo;
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public Cliente(String dni, String nombre, String fechaNacString, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		
		
		this.fechaNac = LocalDate.parse(fechaNacString,formatter);
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac.format(formatter) + ", saldo=" + saldo + "]";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
	
	
}
