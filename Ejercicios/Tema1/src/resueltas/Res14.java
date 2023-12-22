package resueltas;
import java.util.Scanner;
public class Res14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Esta lloviendo?");
		boolean llueve=sc.nextBoolean();
		System.out.print("Has hecho las tareas?");
		boolean tareasHechas=sc.nextBoolean();
		System.out.print("Tienes que ir a la biblioteca?");
		boolean biblio=sc.nextBoolean();
		
		boolean salirAlaCalle= biblio==true || llueve==false && tareasHechas==true? true:false;
		
		System.out.println("Puedes salir a la calle:"+salirAlaCalle);
	}

}
