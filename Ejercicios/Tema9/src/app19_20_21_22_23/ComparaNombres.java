package app19_20_21_22_23;

import java.util.Comparator;

public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Socio socio1=(Socio) o1;
		Socio socio2=(Socio) o2;
		return socio1.nombre.compareTo(socio2.nombre);
	}

}
