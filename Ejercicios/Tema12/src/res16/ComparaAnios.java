package res16;

import java.util.Comparator;

public class ComparaAnios implements Comparator<Academico> {
    @Override
    public int compare(Academico o1, Academico o2) {
        return o1.anioIngreso- o2.anioIngreso;
    }
}
