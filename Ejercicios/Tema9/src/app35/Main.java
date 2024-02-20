package app35;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona=new Persona("123", "Pablo", true, true);
		
		persona.aumentarSaldo(1000);
		persona.incrementarHoras(23);
		
		System.out.println(persona.toString());
	}

}
