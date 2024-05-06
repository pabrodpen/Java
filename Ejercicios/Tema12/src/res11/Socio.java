package res11;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {
    String dni,nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta,formatter);
    }


    public boolean equals(Socio s) {
        return dni.equals(s.dni);
    }

    public int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }


    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni=" + dni +
                ", nombre=" + nombre +
                ", antiguedad=" + antiguedad() + " años" +
                "}\n";
    }

    //un constructor para las busquedas
    //ej: eliminacion-->cjto.remove(new Socio(dni))


    public Socio(String dni) {
        this.dni = dni;
    }
}
