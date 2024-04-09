package app20;

import java.io.Serializable;

public class Cliente implements Serializable{

	static int contId=1;
	int id;
	String nombre;
	int tfno;
	public Cliente(String nombre, int tfno) {
		super();
		this.id = contId++;
		this.nombre = nombre;
		this.tfno = tfno;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", tfno=" + tfno + "]";
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
	public int getTfno() {
		return tfno;
	}
	public void setTfno(int tfno) {
		this.tfno = tfno;
	}
	
	
	
	
}
