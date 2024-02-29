package pack;

import java.util.Arrays;

public class Taller {

	Vehiculo[]tallVehiculos=new Vehiculo[0];

	public Taller() {
		super();
	}
	
	public int numVehiculos(){
		return tallVehiculos.length;
	}

	@Override
	public String toString() {
		return "Taller [tallVehiculos=" + Arrays.toString(tallVehiculos) + "]\n";
	}
	
	public int buscarVehiculo(int id) {
		int pos=-1;
		boolean encontrado=false;
		for(int i=0;i<tallVehiculos.length && !encontrado;i++) {
			if(tallVehiculos[i].numId==id) {
				pos=i;
				encontrado=true;
			}
		}
		return pos;
	}
	
	public void addCoche(Coche coche) {
		if(buscarVehiculo(coche.numId)<0) {
			tallVehiculos=Arrays.copyOf(tallVehiculos, tallVehiculos.length+1);
			tallVehiculos[tallVehiculos.length-1]=coche;
		}else {
			System.out.println("El coche ya existe");
		}
		
		
	}
	
	
	
	public void addMoto(Moto moto) {
		if(buscarVehiculo(moto.numId)<0) {
			tallVehiculos=Arrays.copyOf(tallVehiculos, tallVehiculos.length+1);
			tallVehiculos[tallVehiculos.length-1]=moto;
		}else {
			System.out.println("La moto ya existe");
		}
	}
	
	public void alquilarVehiculo(int id) {
		int posAlqular=buscarVehiculo(id);
		if(posAlqular>=0) {
			for(int i=0;i<tallVehiculos.length;i++) {
				if(posAlqular==i) {
					if(tallVehiculos[i].alquilado==true) {
						System.out.println("El vehiculo ya esta alquilado");
					}else {
						tallVehiculos[i].setAlquilado(true);
					}
					
				}
			}
		}else {
			System.out.println("El vehiculo no se encuentra en el sistema");
		}
	}
	
	
	public void devolverVehiculo(int id) {
		int posDevolver=buscarVehiculo(id);
		if(posDevolver>=0) {
			for(int i=0;i<tallVehiculos.length;i++) {
				if(posDevolver==i) {
					if(tallVehiculos[i].alquilado==false) {
						System.out.println("El vehiculo ya esta devuelto");
					}else {
						tallVehiculos[i].setAlquilado(false);
					}
					
				}
			}
		}else {
			System.out.println("El vehiculo no se encuentra en el sistema");
		}
	}
	
	public void listado() {
		System.out.println(Arrays.toString(tallVehiculos));
		System.out.println("NUMERO DE VEHICULOS EXISTENTES:"+numVehiculos());
		System.out.println();
	}
	
	public void listadoCochesAlquilados() {
		System.out.println("COCHES ALQUILADOS");
		for(int i=0;i<tallVehiculos.length;i++) {
			if(tallVehiculos[i] instanceof Coche && tallVehiculos[i].alquilado==true) {
				System.out.println(tallVehiculos[i]);
			}
		}
		
	}
	
	public void listadoMotos() {
		System.out.println("MOTOS");
		for(int i=0;i<tallVehiculos.length;i++) {
			if(tallVehiculos[i] instanceof Moto) {
				System.out.println(tallVehiculos[i]);
			}
		}
	}
	

	
}
