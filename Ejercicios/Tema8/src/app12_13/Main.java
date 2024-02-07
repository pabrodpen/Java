package app12_13;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja caja=new Caja(223, 356, 823, Unidad.M);
		
		System.out.println("Volumen:"+caja.getVolumen()+" metros cubicos");
		caja.setEtiqueta("Sevilla");
		System.out.println(caja.toString());
		
		CajaCarton cajaCarton=new CajaCarton(982, 566, 113);
		cajaCarton.setEtiqueta("Madrid");
		
		System.out.println(cajaCarton.toString());
		
	}

}
