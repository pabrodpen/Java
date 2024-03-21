package pack;

import java.util.Comparator;

public class ComparaEdad implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Empleado e1=(Empleado) o1;
		Empleado e2=(Empleado) o2;
		return e1.edad()-e2.edad();
	}

}
