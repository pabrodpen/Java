package app19_20_21_22_23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{

	int id;
	LocalDate fechaNac;
	String nombre;
	public Socio(int id, String fechaNac, String nombre) {
		super();
		this.id = id;
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.fechaNac = LocalDate.parse(fechaNac,formatter);
		this.nombre = nombre;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int edad() {
		return (int) fechaNac.until(LocalDate.now(), ChronoUnit.YEARS);

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Socio socio=(Socio) o;
		if(edad()-socio.edad()==0) {
			return id-socio.id;
			//si quisiesemos poner de mayor a menor id:
			//return socio.id-id;
		}else {
			return edad()-socio.edad();
		}
		
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ",edad="+edad()+"\n]";
	}
	
}
