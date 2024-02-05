package app13;

import java.util.Arrays;


public class Colores {

	String[]colores;

	public Colores() {
		super();
		this.colores = new String[0];
	}
	
	public void addColor(String nuevo) {
		boolean repetido=false;
		for(int i=0;i<colores.length && !repetido;i++) {
			if(nuevo.equals(colores[i])) {
				repetido=true;
			}
		}
		
		if(!repetido) {
			colores=Arrays.copyOf(colores, colores.length+1);
			colores[colores.length-1]=nuevo;
			repetido=false;
		}
	
		
	}
	
	public void mostrar() {
		System.out.println(Arrays.toString(colores));
	}
	
	public String[] elegirColores(int numColores) {
		boolean repetido=false;
		String[] elegidos=new String[0];
		
		while(elegidos.length<numColores) {
			repetido=false;
			String color=colores[(int)(Math.random()*colores.length)];
			for(int i=0;i<elegidos.length && !repetido;i++) {
				if(color.equals(elegidos[i])) {
					repetido=true;
				}
			}
			
			if(!repetido) {
				elegidos=Arrays.copyOf(elegidos, elegidos.length+1);
				elegidos[elegidos.length-1]=color;
			}
		}
		
		return elegidos;
		
	}
}
