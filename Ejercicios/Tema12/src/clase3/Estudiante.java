package clase3;

public class Estudiante {
    String nombre;
    int edad;
    double media;

    public Estudiante(String nombre, int edad, double media) {
        this.nombre = nombre;
        this.edad = edad;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", media=" + media +
                '}';
    }
}
