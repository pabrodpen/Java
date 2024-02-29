package pack;

public class Moto extends Vehiculo{

	boolean sidecar=false;

	public Moto(String marca, String modelo, int numRuedas, boolean sidecar) {
		super(marca, modelo, numRuedas);
		
		this.sidecar = sidecar;
	}

	@Override
	public String toString() {
		return "Moto [numId=" + numId +", sidecar=" + sidecar + ", marca=" + marca + ", modelo=" + modelo
				+ ", numRuedas=" + numRuedas +"]";
	}
	
	
}
