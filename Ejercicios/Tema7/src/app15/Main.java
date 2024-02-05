package app15;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendario calendario1=new Calendario(2022, 12, 31);
		Calendario calendario2=new Calendario(2023, 12, 1);
		
		if(calendario1.fechaCorrecta()) {
			calendario1.incrementarDia();
			calendario1.mostrar();
		}
		
		if(calendario1.iguales(calendario2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}

}
