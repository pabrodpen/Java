package ejClase1;

import java.util.Comparator;

public class ComparaEdad implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Socio socio1=(Socio) o1;
		Socio socio2=(Socio) o2;
		
		if(socio1.edad()-socio2.edad()==0) {
			return socio1.id-socio2.edad();
		}else {
			return socio1.edad()-socio2.edad();
		}
	}

}
