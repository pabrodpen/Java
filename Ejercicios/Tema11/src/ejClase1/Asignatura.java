package ejClase1;

import java.io.Serializable;

public class Asignatura implements Serializable{

	int codigo;
	String nombre;
	int numSuspensos=0,numSuficientes=0,numBien=0,numNotables=0,numSobresalientes=0;
	public Asignatura(int codigo, String nombre) {
		super();
		this.codigo=codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumSuspensos() {
		return numSuspensos;
	}
	public void setNumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}
	public int getNumSuficientes() {
		return numSuficientes;
	}
	public void setNumSuficientes(int numSuficientes) {
		this.numSuficientes = numSuficientes;
	}
	public int getNumBien() {
		return numBien;
	}
	public void setNumBien(int numBien) {
		this.numBien = numBien;
	}
	public int getNumNotables() {
		return numNotables;
	}
	public void setNumNotables(int numNotables) {
		this.numNotables = numNotables;
	}
	public int getNumSobresalientes() {
		return numSobresalientes;
	}
	public void setNumSobresalientes(int numSobresalientes) {
		this.numSobresalientes = numSobresalientes;
	}
	
	
	
	
}
