package app11;


public class MarcaPagina {

	private int pagActual;
	



public MarcaPagina(int pagActual) {
		super();
		this.pagActual = pagActual;
	}






public int getPagActual() {
		return pagActual;
	}




	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}




	public void addPg() {
		int pgActual=getPagActual();
		pgActual++;
		setPagActual(pgActual);

	}

	public void mostrarPgActual() {
		System.out.println("Estas en la pagina:"+getPagActual());
	}
	
	public void inicio() {
		setPagActual(0);
	}


}