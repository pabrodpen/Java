package ejAnioPasado;

public class Jugador {

	String nombre,dni,nacionalidad;
	
	public enum Posicion{PORTERO,DEFENSA,MEDIO,DELANTERO}
	
	Posicion posicion;

	public Jugador(String dni,String nombre ,String nacionalidad, Posicion posicion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.posicion=posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", posicion="
				+ posicion + "]";
	}
	
	

	
	
	
}
