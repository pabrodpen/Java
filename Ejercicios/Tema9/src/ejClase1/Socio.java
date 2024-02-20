package ejClase1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{

	static int contadorIds=1;
	static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	String nombre;
	LocalDate fechaNac;
	int id;
	
	public Socio(String nombre, String fechaNac) {
		super();
		this.id=contadorIds++;
		this.nombre = nombre;
		this.fechaNac = LocalDate.parse(fechaNac,formatter);
	}
	
	@Override
	public String toString() {
		return "Socio [id="+id +", nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Socio socio=(Socio) o;
		return id-socio.id;
	}
	
	public int edad() {
		return (int) fechaNac.until(LocalDate.now(),ChronoUnit.YEARS);
	}
	
	
}
