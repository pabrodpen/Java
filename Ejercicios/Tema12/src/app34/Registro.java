package app34;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable,Comparable<Registro> {

    String hora;
    double temperatura;


    public Registro(String hora, double temperatura) {
        this.hora = hora;
        this.temperatura = temperatura;
    }

    public Registro(double temperatura) {
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Registro{hora=" + hora + ", temperatura=" + temperatura +"}\n";
    }

    @Override
    public int compareTo(Registro o) {
        LocalTime h1=LocalTime.parse(hora,DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime h2=LocalTime.parse(o.hora,DateTimeFormatter.ofPattern("HH:mm:ss"));

        return h1.compareTo(h2);
    }
}
