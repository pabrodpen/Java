package ejClase3;

public class Publicacion implements Comparable{

	int codigo,anio;
	String titulo;
	public Publicacion(int codigo, int anio, String titulo) {
		super();
		this.codigo = codigo;
		this.anio = anio;
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Publicacion publicacion=(Publicacion) o;
		return codigo-publicacion.codigo;
	}

	
	
	
	
}
