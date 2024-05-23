package ej2;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Jugador> {
    @Override
    public int compare(Jugador o1, Jugador o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
}
