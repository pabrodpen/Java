package ejClase3;

import java.io.Serializable;

public class Asignatura implements Serializable{

    String nombre;
    double media;

    public Asignatura(String nombre,double media) {
        this.nombre = nombre;
        this.media=media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    


}
