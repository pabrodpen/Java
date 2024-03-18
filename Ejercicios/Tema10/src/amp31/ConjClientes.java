package amp31;

import java.util.Arrays;

public class ConjClientes {

	Cliente[]conjClientes=new Cliente[0];
	
	public void addCliente(Cliente c) {
		conjClientes=Arrays.copyOf(conjClientes, conjClientes.length+1);
		conjClientes[conjClientes.length-1]=c;
	}
	
	public int buscarCliente(String dni) {
		int pos=-1;
		for(int i=0;i<conjClientes.length;i++) {
			if(conjClientes[i].getDni().equals(dni)) {
				pos=i;
			}
		}
		return pos;
	}
	
	public void rmCliente(String dni) {
		int posCliente=buscarCliente(dni);
	}
}
