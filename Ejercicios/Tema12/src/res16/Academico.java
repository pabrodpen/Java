package res16;

public class Academico implements Comparable<Academico>{
    String nombre;
    Integer anioIngreso;

    public Academico(String nombre, Integer anioIngreso) {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Academico{nombre=" + nombre+ ", anioIngreso=" + anioIngreso +"}\n";
    }

    @Override
    public int compareTo(Academico o) {
        return o.nombre.compareTo(nombre);
    }
}
