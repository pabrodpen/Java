package pack;

import java.util.Arrays;

public class ConjEmpleados {

	Empleado[] cjtoEmpleados=new Empleado[0];
	
	public void addEmpleado(Empleado e) {
		cjtoEmpleados=Arrays.copyOf(cjtoEmpleados, cjtoEmpleados.length+1);
		cjtoEmpleados[cjtoEmpleados.length-1]=e;
	}
	
	public Empleado buscarEmpleado(String n) {
		boolean encontrado=false;
		Empleado empleado = null;
		for(int i=0;i<cjtoEmpleados.length;i++) {
			if(n.equals(cjtoEmpleados[i].getNombre())) {
				empleado= cjtoEmpleados[i];
				encontrado=false;
			}
		}
		return empleado;
	}
}
