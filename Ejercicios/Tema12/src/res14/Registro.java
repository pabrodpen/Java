package res14;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable,Comparable<Registro> {

    LocalDateTime hora;
    double temperatura;


    public Registro(double temperatura) {
        this.hora = LocalDateTime.now();
        this.temperatura = temperatura;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
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
        return (int) (temperatura-o.temperatura);
    }
}
