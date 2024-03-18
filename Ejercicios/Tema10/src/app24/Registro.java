package app24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Registro {

    LocalDate fecha;
    double tempMax;
    double tempMin;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Registro(String fecha, double tempMax, double tempMin) {
        this.fecha = LocalDate.parse(fecha, formatter);
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    @Override
    public String toString() {
        return fecha.format(formatter) + "\t\t" + tempMax + "\t\t" + tempMin;
    }
}
