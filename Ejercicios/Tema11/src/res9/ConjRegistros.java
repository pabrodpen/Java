package res9;

import java.util.Arrays;

public class ConjRegistros {

	Registro[]conjRegistros=new Registro[0];
	
	public void addRegistro(Registro r) {
		conjRegistros=Arrays.copyOf(conjRegistros, conjRegistros.length+1);
		conjRegistros[conjRegistros.length-1]=r;
	}
	
}
