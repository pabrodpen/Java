package clase4;

import clase3.Estudiante;

import java.util.Comparator;

public class ComparaMedias implements Comparator<clase4.Estudiante> {



    @Override
    public int compare(clase4.Estudiante o1, clase4.Estudiante o2) {
        return (int) (o1.media-o2.media);
    }
}
