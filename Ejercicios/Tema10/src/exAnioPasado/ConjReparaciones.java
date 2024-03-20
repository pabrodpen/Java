package exAnioPasado;

import java.util.Arrays;

public class ConjReparaciones {

	Reparacion[]reparaciones=new Reparacion[0];
	
	public void addReparacion(Reparacion r) {
		if(buscarReparacion(r.getMatricula(),r.getDescripcion(),r.getPrecio())>=0) {
			System.out.println("La matricula ya esta en el sistema");
		}else {
			reparaciones=Arrays.copyOf(reparaciones, reparaciones.length+1);
			reparaciones[reparaciones.length-1]=r;
		}
		
	}
	
	public int buscarReparacion(String m,String d,double p) {
		int pos=-1;
		boolean encontrado=false;
		for(int i=0;i<reparaciones.length && !encontrado;i++) {
			if(reparaciones[i].getMatricula().equals(m) && reparaciones[i].getDescripcion().equals(d) && reparaciones[i].getPrecio()==p) {
				pos=i;
				encontrado=true;
			}
		}
		
		return pos;
	}
	
	public void rmReparacion(int pos) {
		System.arraycopy(reparaciones, pos+1, reparaciones, pos, reparaciones.length- pos-1);
		reparaciones=Arrays.copyOf(reparaciones, reparaciones.length-1);
	}
}
