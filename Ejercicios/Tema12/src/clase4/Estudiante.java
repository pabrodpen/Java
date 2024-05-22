package clase4;

import java.io.Serializable;

public class Estudiante implements Serializable {
    int cod;
    String nombre;
    int edad;
    double media;
    String carrera;

    public Estudiante(int cod, String nombre, int edad, double media, String carrera) {
        this.cod = cod;
        this.nombre = nombre;
        this.edad = edad;
        this.media = media;
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", media=" + media +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
