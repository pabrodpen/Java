package app13_14;

import java.util.Comparator;

public class ComparaNombre implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Futbolista f1=(Futbolista) o1;
		Futbolista f2=(Futbolista) o2;
		return f1.nombre.compareTo(f2.nombre);
	}

}
