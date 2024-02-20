package ejClase4;

import java.util.Arrays;

public class Almacen {

	Articulo[]almacen=new Articulo [0];
	
	static int numArticulos;

	public Almacen() {
		super();
	}

	@Override
	public String toString() {
		return "Almacen [almacen=" + Arrays.toString(almacen) + "]";
	}
	
	
	public void addArticulo(Articulo articulo) {
		almacen=Arrays.copyOf(almacen, almacen.length+1);
		almacen[almacen.length-1]=articulo;
	}
	
	public void elimArticulo(int pos) {
		System.arraycopy(almacen, pos+1, almacen, pos, pos-1-almacen.length);
		almacen=Arrays.copyOf(almacen, almacen.length-1);
			
	}
	
	public int buscarArticulo(int cod) {
		boolean encontrado=false;
		int pos=-1;
		for(int i=0;i<almacen.length && !encontrado;i++) {
			if(cod==almacen[i].getCodigo()) {
				pos=i;
				encontrado=true;
			}
		}
		return pos;
	}
	
	public void modArticulo(int pos,String descrp,int st,double prCompra,double prVenta) {
		boolean encontrado=false;
		
		if(pos>=0) {
			for(int i=0;i<almacen.length && !encontrado;i++) {
				if(pos==i) {
					almacen[i].setDescripcion(descrp);
					almacen[i].setStock(st);
					almacen[i].setPrecioCompra(prCompra);
					almacen[i].setPrecioVenta(prVenta);
					encontrado=true;
				}
			}
		}else {
			System.out.println("No se ha encontrado el articulo");
		}
		
		
	}
	
	
	public void entradaMercancia(Articulo articulo,int cantidad) {
		int nuevoStock=articulo.getStock()+cantidad;
		articulo.setStock(nuevoStock);
	}
	
	public void salidaMercancia(Articulo articulo,int cantidad) {
		if(articulo.getStock()-cantidad<0) {
			System.out.println("Cantidad no disponible");
		}else {
			int nuevoStock=articulo.getStock()-cantidad;
			articulo.setStock(nuevoStock);
		}
	}
	
	
	
	
}
