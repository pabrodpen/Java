package res1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente corriente=new CuentaCorriente("2j22j2j","Pablo", 2000);
		
		corriente.ingreso(100);
		corriente.mostrar();
		corriente.sacarDinero(500);
		corriente.mostrar();
	}

}
