package app28_29_30;

import java.util.Comparator;

public class ComparaMinutos implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Jornada j1=(Jornada) o1;
		Jornada j2=(Jornada) o2;
		return j1.minTrabajados()-j2.minTrabajados();
	}

}
