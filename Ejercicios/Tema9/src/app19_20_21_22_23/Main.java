package app19_20_21_22_23;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio[]conjSocios=new Socio[5];
		
		conjSocios[0]=new Socio(1, "2002-08-29", "Pablo");
		conjSocios[1]=new Socio(2, "2004-10-05", "Luis");
		conjSocios[2]=new Socio(3, "1998-08-11", "Javi");
		conjSocios[3]=new Socio(4, "2001-12-01", "Olalla");
		conjSocios[4]=new Socio(5, "2002-11-17", "Carmen");
		
		Arrays.sort(conjSocios);
		System.out.println(Arrays.toString(conjSocios));
		
		System.out.println("POR FECHA DE NACIMIENTO");
		Arrays.sort(conjSocios, new ComparaFechas());
		System.out.println(Arrays.toString(conjSocios));
		
		
		System.out.println("ALFEBETICAMENTE");
		Arrays.sort(conjSocios, new ComparaNombres());
		System.out.println(Arrays.toString(conjSocios));
		
		
		
		System.out.println("ALFEBETICAMENTE INVERTIDO");
		Arrays.sort(conjSocios, new ComparaNombres().reversed());
		System.out.println(Arrays.toString(conjSocios));
	}

}
