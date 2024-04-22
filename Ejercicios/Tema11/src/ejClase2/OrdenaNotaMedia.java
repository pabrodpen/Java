package ejClase2;

import java.util.Comparator;

public class OrdenaNotaMedia implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stubç
		Alumno alumno1=(Alumno) o1;
		Alumno alumno2=(Alumno) o2;
		return (int) (alumno1.notaMedia()-alumno2.notaMedia());
	}

}
