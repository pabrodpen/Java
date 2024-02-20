package app28_29_30;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import app19_20_21_22_23.Socio;

public class Jornada implements Comparable{

	String dni;
	LocalDate fecha;
	LocalTime horaEntrada,horaSalida;
	
	public Jornada(String dni, String fecha, String horaEntrada, String horaSalida) {
		super();
		this.dni = dni;
		DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter f2=DateTimeFormatter.ofPattern("HH:mm:ss");
		this.fecha = LocalDate.parse(fecha,f1);
		this.horaEntrada = LocalTime.parse(horaEntrada,f2);
		this.horaSalida = LocalTime.parse(horaSalida,f2);
	}
	
	
	@Override
	public String toString() {
		return "Jornada [dni=" + dni + ", fecha=" + fecha + ", minutos trabajados="+minTrabajados()+"]\n";
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	public LocalTime getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}



	public int minTrabajados() {
		return (int) horaEntrada.until(horaSalida, ChronoUnit.MINUTES);
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Jornada jornada=(Jornada) o;
		
		if(dni.compareTo(jornada.dni)==0) {
			return fecha.compareTo(jornada.fecha);
		}else {
			return dni.compareTo(jornada.dni);
		}
		
	}
}