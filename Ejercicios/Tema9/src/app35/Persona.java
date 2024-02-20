package app35;

public class Persona implements Cliente,Empleado{
	
	int numHoras;
	double saldo;
	String dni;
	String nombre;
	boolean esCliente,esEmpleado;
	

	@Override
	public void incrementarHoras(int cantidad) {
		// TODO Auto-generated method stub
		if(esEmpleado) {
			numHoras+=cantidad;
		}else {
			System.out.println("No se puede aumentar horas de trabajo a un no empleado");
		}
		
	}

	@Override
	public void aumentarSaldo(double cantidad) {
		// TODO Auto-generated method stub
		if(esCliente) {
			saldo+=cantidad;
		}else {
			System.out.println("No se puede aumentar el saldo a un no cliente");
		}
	}

	public Persona(String dni, String nombre, boolean esCliente,boolean esEmpleado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.esCliente = esCliente;
		this.esEmpleado=esEmpleado;
		this.numHoras = 0;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ",numHoras=" + numHoras + ", saldo=" + saldo + " ]\n";
	}

	
	
	

}
