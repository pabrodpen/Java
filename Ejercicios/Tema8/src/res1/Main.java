package res1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora hora=new Hora(23, 59);
		
		hora.incremento();
		
		System.out.println(hora.mostrar());
		
		HoraExacta horaExacta=new HoraExacta(23, 59, 59);
		
		horaExacta.incremento();
		System.out.println(horaExacta.mostrar());
		
	}

}
