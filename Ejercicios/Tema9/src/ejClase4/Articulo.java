package ejClase4;

public class Articulo implements Comparable{

	int codigo;
	String descripcion;
	double precioCompra,precioVenta;
	int stock;
	static int contUnidades=0;
	

	public Articulo(String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = contUnidades++;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]\n";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Articulo articulo=(Articulo) o;
		return codigo-articulo.codigo;
	}
	
}
