package exAnioPasado;

import java.util.Arrays;

public class ConjReparaciones {

	Reparacion[]reparaciones=new Reparacion[0];
	
	public void addReparacion(Reparacion r) {
		if(buscarReparacion(r.getMatricula())>=0) {
			System.out.println("La matricula ya esta eb");
		}else {
			reparaciones=Arrays.copyOf(reparaciones, reparaciones.length+1);
			reparaciones[reparaciones.length-1]=r;
		}
		
	}
	
	public int buscarReparacion(String mat) {
		int pos=-1;
		boolean encontrado=false;
		for(int i=0;i<reparaciones.length && !encontrado;i++) {
			if(reparaciones[i].getMatricula().equals(mat)) {
				pos=i;
				encontrado=true;
			}
		}
		
		return pos;
	}
}
