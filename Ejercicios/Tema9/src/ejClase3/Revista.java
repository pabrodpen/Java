package ejClase3;

public class Revista extends Publicacion{
	
	int numero;


	public Revista(int codigo, int anio, String titulo,int numero) {
		super(codigo, anio, titulo);
		// TODO Auto-generated constructor stub
		this.numero=numero;
	}


	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", codigo=" + codigo + ", anio=" + anio + ", titulo=" + titulo + "]";
	}
	
	public int getCodigo() {
		return super.getCodigo();
	}
	
	public int getAnio() {
		return super.getAnio();
	}

	
	
}
