package aplicacion1;

public class MarcaPagina {
	private int numPagina;
	public void incrementarPagina() {
		numPagina++;
	}
	public int getPagina() {
		return numPagina;
	}
	public void empezarDeNuevo() {
		numPagina = 0;
	}
}
