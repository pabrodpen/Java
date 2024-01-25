package res1;

public class CuentaCorriente {

	private String dni,nombre;
	
	private double saldo;
	
	Gestor gestor;
	
	

public CuentaCorriente(String dni, double saldo,Gestor gestor) {
		super();
		this.dni = dni;
		this.saldo = saldo;
		this.gestor=gestor;
	}



public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}



 void sacarDinero(double cantidad) {
	if((saldo-cantidad)<0) {
		System.out.println("Saldo insufuciente");
	}else {
		saldo-=cantidad;
	}
	
	}

 void ingreso(double cantidad) {
	saldo+=cantidad;
}
 
 void mostrar() {
	 System.out.println("Nombre del titular:"+nombre);
	 System.out.println("Saldo disponible:"+saldo);
 }
 }