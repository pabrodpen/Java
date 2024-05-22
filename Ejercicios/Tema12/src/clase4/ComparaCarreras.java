package clase4;

import java.util.Comparator;

public class ComparaCarreras implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return o1.carrera.compareTo(o2.carrera);
    }
}
