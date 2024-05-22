package clase1;

import java.io.Serializable;
import java.util.Comparator;

public class ComparaNombres implements Serializable, Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
}
