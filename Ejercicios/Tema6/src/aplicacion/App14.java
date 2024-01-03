package aplicacion;
import java.util.Arrays;
import java.util.Scanner;
public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int opcion=0;
		String[]agenda=new String[0];
		
		do {
			System.out.println("1.Añadir contacto");
			System.out.println("2.Buscar tfno a partir del nombre");
			System.out.println("3.Mostrar agenda");
			System.out.println("4.Salir");
			
			System.out.print("Dime una opcion:");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Nombre:");
				String nombre=sc.next();
				System.out.print("Tfno:");
				String tfno=sc.next();
				
				agenda=Arrays.copyOf(agenda, agenda.length+1);
				agenda[agenda.length-1]="Nombre:"+nombre+", telefono:"+tfno;
				break;
			case 2:
				System.out.print("Nombre del contacto:");
				String buscado=sc.next();
				boolean encontrado=false;
				for(int i=0;i<agenda.length && !encontrado;i++) {
					if(agenda[i].contains(buscado)) {
						System.out.println(agenda[i]);
						encontrado=true;
					}
				}
				break;
			case 3:
				System.out.println(Arrays.toString(agenda));
				break;
			}
		} while (opcion!=4);
	}

}
