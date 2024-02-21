package ejClase5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiempo tiempo1=new Tiempo(21, 65, 89);
		
		Tiempo tiempo2=new Tiempo(31, 21, 57);
		
		System.out.println("HORA 1");
		System.out.println(tiempo1.toString());
		
		System.out.println("HORA 2");
		System.out.println(tiempo2.toString());
		
		System.out.println("SUMA DE TIEMPOS");
		Tiempo tiempoSuma=tiempo1.suma(tiempo2);
		System.out.println(tiempoSuma.toString());
	}

}
