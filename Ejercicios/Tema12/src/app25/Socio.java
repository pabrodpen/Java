package app25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {

    String nombre;
    LocalDate fechaAlta;
    transient DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Socio(String nombre, String fechaAlta) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.parse(fechaAlta, formatter);
    }

    @Override
    public String toString() {
        return "Socio{nombre=" + nombre + ", antiguedad=" + antiguedad() + " meses}\n";
    }

    public int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.MONTHS);
    }

    @Override
    public int compareTo(Socio o) {
        return antiguedad() - o.antiguedad();
    }
}
