package ejClase3;

import java.util.Comparator;

public class ComparaAutor implements Comparator<Publicacion>{//IMP

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		// TODO Auto-generated method stub
		
		if(o1 instanceof Libro && o2 instanceof Libro) {
			Libro l1=(Libro) o1;
			Libro l2=(Libro) o2;
			
			return l1.autor.compareTo(l2.autor);
		}
		return 0;
	}

}
