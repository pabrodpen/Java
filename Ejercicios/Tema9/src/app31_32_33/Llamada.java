package app31_32_33;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Llamada implements Comparable{

	int nCliente,nInterlocutor;
	boolean entrante;
	
	LocalDateTime inicioLlamada,finLlamada;
	
	public enum Zonas{EUROPA,AMERICA,OCEANIA,ASIA,AFRICA}
	
	final double[]tarifas= {1.45,2.99,3.95,2.34,1.23};
	
	Zonas zonaLlamada;
	
	
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


	
	public Llamada(int nCliente, int nInterlocutor, boolean entrante, String inicioLlamada,
			String finLlamada, Zonas zonaLlamada) {
		super();
		this.nCliente = nCliente;
		this.nInterlocutor = nInterlocutor;
		this.entrante = entrante;
		
		this.inicioLlamada = LocalDateTime.parse(inicioLlamada,formatter);
		this.finLlamada = LocalDateTime.parse(finLlamada,formatter);
		
		this.zonaLlamada = zonaLlamada;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Llamada llamada=(Llamada) o;
		
		if(nCliente-llamada.nCliente==0) {
			return inicioLlamada.compareTo(llamada.inicioLlamada);
		}else {
			return nCliente-llamada.nCliente;
		}
	}
	
	public int minutosLlamada() {
		return (int) inicioLlamada.until(finLlamada, ChronoUnit.MINUTES);
	}
	
	public double coste() {
		int indZona=0;
		if(!entrante) {
			Zonas[]z=Zonas.values();
			
			for(int i=0;i<z.length;i++) {
				if(zonaLlamada.equals(z[i])) {
					indZona=i;
				}
			}
			
			
			return minutosLlamada()*tarifas[indZona];
		}else {
			return 0;
		}
		
	}

	@Override
	public String toString() {
		String inicioLlamadaConFormato=inicioLlamada.format(formatter);

		return "Llamada [numero del cliente=" + nCliente + ", numero del interlocutor=" + nInterlocutor + ", hora de la llamada=" + inicioLlamadaConFormato
				+ ", minutos de la llamada=" + minutosLlamada() + ", coste=" + Math.floor(coste()*100)/100 + "]\n";
	}
	//el math floor para truncar

	
	
	
}
