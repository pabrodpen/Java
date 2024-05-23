package ej2;

import java.util.Comparator;

public class ComparaAntiguedad implements Comparator<Jugador> {
    @Override
    public int compare(Jugador o1, Jugador o2) {
        return o1.antiguedad()-o2.antiguedad();
    }
}
