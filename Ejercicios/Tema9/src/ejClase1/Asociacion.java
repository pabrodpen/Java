package ejClase1;

import java.util.Arrays;

public class Asociacion {

	Socio[]asociacion=new Socio[0];

	public Asociacion() {
		super();
	}
	
	public void addSocio(Socio s) {
		asociacion=Arrays.copyOf(asociacion, asociacion.length+1);
		asociacion[asociacion.length-1]=s;
	}
	
	public void elimSocio(Socio s) {
		asociacion=Arrays.copyOf(asociacion, asociacion.length-1);
	}
	
	public Socio consultarSocio(int id) {
		Socio encontradoSocio=null;
		for(int i=0;i<asociacion.length;i++) {
			if(id==asociacion[i].id) {
				encontradoSocio= asociacion[i];
			}
		}
		return encontradoSocio;
	}
	

	
	public boolean comprobarId(int id) {
		boolean repetido=false;
		for(int i=0;i<asociacion.length && !repetido;i++) {
			Socio socio=asociacion[i];
			if(id==socio.id) {
				repetido=true;
			}
		}
		return repetido;
	}

	@Override
	public String toString() {
		return "Asociacion [asociacion=" + Arrays.toString(asociacion) + "]";
	}
	
	
	
}
