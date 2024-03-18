package amp31;

import java.util.Arrays;

public class ConjClientes {

	Cliente[]conjClientes=new Cliente[0];
	
	
	
	@Override
	public String toString() {
		return "ConjClientes [" + Arrays.toString(conjClientes) + "]";
	}

	public void addCliente(Cliente c) {
		conjClientes=Arrays.copyOf(conjClientes, conjClientes.length+1);
		conjClientes[conjClientes.length-1]=c;
	}
	
	public int buscarCliente(String dni) {
		boolean encontrado=false;
		int pos=-1;
		for(int i=0;i<conjClientes.length && !encontrado;i++) {
			if(conjClientes[i].getDni().equals(dni)) {
				pos=i;
				encontrado=true;
			}
		}
		return pos;
	}
	
	public void rmCliente(String dni) {
		int posCliente=buscarCliente(dni);
		System.arraycopy(conjClientes, posCliente+1, conjClientes, posCliente, conjClientes.length-posCliente-1);
		conjClientes=Arrays.copyOf(conjClientes, conjClientes.length-1);
	}
	
	
}
