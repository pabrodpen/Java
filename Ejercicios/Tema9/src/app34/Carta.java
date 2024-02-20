package app34;


public class Carta implements Comparable{

	public enum Palos{ORO,COPAS,ESPADAS,BASTOS};
	
	Palos palo;
	int numero;
	public Carta(Palos palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	
	static public Carta generarCarta() {
		int n=(int)(Math.random()*12-1+1)+1;
		Palos[]auxPalos=Palos.values();
		
		int indPalos=(int)(Math.random()*auxPalos.length);
		
		return new Carta(auxPalos[indPalos], n);
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]\n";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Carta carta=(Carta) o;
		
		
		if(palo.compareTo(carta.palo)==0) {
			return numero-carta.numero;
		}else {
			return palo.compareTo(carta.palo);
		}
	}
	
	
}
