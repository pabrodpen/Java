package res9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		int opcion=0;
		Scanner scanner=new Scanner(System.in);
		
		ConjRegistros conjRegistros=new ConjRegistros();
		Registro registro;
		
		
		//cargamos los datos de registros.dat
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res9/registros.dat"));
			
			
			conjRegistros=(ConjRegistros) in.readObject();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		do {
			
			
			System.out.println("MENU DE GESTION DE REGISTROS");
			System.out.println("1.ALTA REGISTRO");
			System.out.println("2.LISTAR REGISTROS");
			System.out.println("3.GUARDAR DATOS Y SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Temperatura:");
				double temperatura=scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Fecha y hora(dd-MM-yyyy HH:mm:ss):");
				String fecha=scanner.nextLine();
				
				registro=new Registro(temperatura, fecha);
				conjRegistros.addRegistro(registro);
				
				break;
				
			case 2:
				System.out.println(Arrays.toString(conjRegistros.conjRegistros));
				break;
			
			case 3:
				try {
					ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res9/registros.dat"));
					
					out.writeObject(conjRegistros);
					//out.close();
					System.out.println("DATOS GUARDADOS");
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (opcion!=3);
		
		
	}

}
