package ej2;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Equipo implements Comparable<Equipo>{
    String nombre;
    List<Jugador> jugadores=new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public Jugador buscarJugador(int d){
        Jugador jugadorEncontrado=null;
        for(Jugador jugador:jugadores){
            if(jugador.dorsal==d){
                jugadorEncontrado=jugador;
            }
        }
        return jugadorEncontrado;
    }

    @Override
    public int compareTo(@NotNull Equipo o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Equipo{nombre=" + nombre +", jugadores=" + jugadores + "}\n";
    }
}
