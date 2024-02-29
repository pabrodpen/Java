package pack;

public class Vehiculo implements Comparable{

	int numId;
	String marca,modelo;
	int numRuedas;
	
	static int contIds=1;
	boolean alquilado=false;
	public Vehiculo(String marca, String modelo, int numRuedas) {
		super();
		this.numId = contIds++;
		this.marca = marca;
		this.modelo = modelo;
		this.numRuedas = numRuedas;
		this.alquilado = false;
	}
	
	
	
	public Vehiculo() {
		super();
		this.numId = contIds++;
	}



	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public static int getContIds() {
		return contIds;
	}
	public static void setContIds(int contIds) {
		Vehiculo.contIds = contIds;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=(Vehiculo) o;
		return numId-vehiculo.numId;
	}
	
	
	
	
}
