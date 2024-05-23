package ej2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jugador implements Comparable<Jugador>{
    int dorsal;
    String nombre;
    LocalDate fechaIncorporacion;
    Posicion posicion;

    static int contJugadores=1;

    public Jugador(String nombre, String fechaIncorporacion, Posicion posicion) {
        this.dorsal = contJugadores++;
        this.nombre = nombre;
        this.fechaIncorporacion = LocalDate.parse(fechaIncorporacion, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.posicion = posicion;
    }

    public int antiguedad(){
        return (int)fechaIncorporacion.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{dorsal=" + dorsal + ", nombre=" + nombre+", fechaIncorporacion=" + fechaIncorporacion + ", posicion=" + posicion + "}\n";
    }


    @Override
    public int compareTo(@NotNull Jugador o) {
        return antiguedad()-o.antiguedad();
    }


}
