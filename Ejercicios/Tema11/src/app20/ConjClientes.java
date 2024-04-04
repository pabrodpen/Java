package app20;

import java.util.Arrays;

public class ConjClientes {

	Cliente[]clientes=new Cliente[0];
	
	public void addCliente(Cliente c) {
		clientes=Arrays.copyOf(clientes, clientes.length+1);
		clientes[clientes.length-1]=c;
	}
	
	public void rmCliente(int pos) {
		System.arraycopy(clientes, pos+1, clientes, pos, clientes.length-pos-1);
		clientes=Arrays.copyOf(clientes, clientes.length-1);
	}
	
	public int buscarCliente(int id) {
		boolean encontrado=false;
		int pos=-1;
		for(int i=0;i<clientes.length & !encontrado;i++) {
			if(clientes[i].getId()==id) {
				pos=i;
				encontrado=true;
			}
		}
		
		return pos;
	}
}
