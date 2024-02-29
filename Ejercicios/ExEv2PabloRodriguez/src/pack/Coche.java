package pack;

public class Coche extends Vehiculo{

	int capacidad=2;
	int numSensores;

	public Coche(String marca, String modelo, int numRuedas, int capacidad) {
		super(marca, modelo, numRuedas);
		if(capacidad<=0) {//si no se pone nada por defecto es 2
			this.capacidad=2;
		}else {
			this.capacidad = capacidad;
		}
		
	}
	
	
	public Coche(String marca, String modelo, int numRuedas, int capacidad,int numSensores) {
		super(marca, modelo, numRuedas);
		if(capacidad>=0) {//si no se pone nada por defecto es 2
			this.capacidad = capacidad;
		}
		
		if(numSensores>=3 && numSensores<=5) {
			this.numSensores=numSensores;
		}else {
			this.numSensores=3;
		}
		
	}

	@Override
	public String toString() {
		return "Coche [numId=" + numId +", capacidad=" + capacidad + ", numSensores=" + numSensores +  ", marca="
				+ marca + ", modelo=" + modelo + ", numRuedas=" + numRuedas + "]";
	}
	
	
	
	
	
}
