package app31_32_33;

import java.util.Comparator;

public class ComparaCoste implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Llamada llamada1=(Llamada) o1;
		Llamada llamada2=(Llamada) o2;
		
		return (int) (llamada1.coste()-llamada2.coste());
	}

}
