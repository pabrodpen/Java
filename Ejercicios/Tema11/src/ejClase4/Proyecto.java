package ejClase4;

import java.io.Serializable;

public class Proyecto implements Serializable{

	String nombre;

	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + '}';
    }

  
	
	
}
