package ejAnioPasado;

import java.util.Arrays;

import ejAnioPasado.Jugador.Posicion;

public class Equipo {

	String nombreEquipo;
	Integer presupuesto;
	Jugador[]jugadores=new Jugador[0];
	public Equipo(String nombreEquipo, Integer presupuesto, Jugador[] jugadores) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.presupuesto = presupuesto;
		this.jugadores = jugadores;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public Integer getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Jugador[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", presupuesto=" + presupuesto + ", jugadores="
				+ Arrays.toString(jugadores) + "]";
	}
	
	public void addJugador(Jugador jugador) {
		jugadores[jugadores.length-1]=jugador;
		jugadores=Arrays.copyOf(jugadores, jugadores.length+1);
	}
	
	public int buscarJugador(String dni) {
		boolean encontrado=false;
		int pos=-1;
		for(int i=0;i<jugadores.length && !encontrado;i++) {
			if(jugadores[i].getDni().compareTo(dni)==0) {
				pos=i;
				encontrado=true;
			}
		}
		
		return pos;
	}
	
	public void elimJugador(Jugador jugador) {
		int posicionElim=buscarJugador(jugador.getDni());
		System.arraycopy(jugadores, posicionElim+1, jugadores, posicionElim, jugadores.length-posicionElim-1);
		jugadores=Arrays.copyOf(jugadores, jugadores.length-1);
	}
	
	public void modifJugador(Jugador jugador,String nuevoNombre,String nuevaNacionalidad,String nuevaPosicion) {
		boolean encontrado=false;
		int posicionModif=buscarJugador(jugador.getDni());
		for(int i=0;i<jugadores.length && !encontrado;i++) {
			if(i==posicionModif) {
				jugadores[i].setNombre(nuevoNombre);
				jugadores[i].setNacionalidad(nuevaNacionalidad);
				 // Convierte el String a enum
		        Posicion posicion = Posicion.valueOf(nuevaPosicion);
				jugadores[i].setPosicion(posicion);
			}
		}
	}
	
}
