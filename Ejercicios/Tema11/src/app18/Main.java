package app18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0;
		Scanner scanner=new Scanner(System.in);
		
		
		//cargamos datos
		String[]nombres=new String[0];
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/app18/nombres.dat"));
		
			nombres=(String[]) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		do {
			System.out.println("1.Escribir nombre");
			System.out.println("2.Listar nombres");
			System.out.println("3.Guardar datos");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				scanner.nextLine();
				System.out.print("Nombre:");
				String nombre=scanner.nextLine();
				
				boolean encontrado=false;
				for(int i=0;i<nombres.length && !encontrado;i++) {
					if(nombres[i].equals(nombre)) {
						encontrado=true;
					}
				}
				
				
				if(!encontrado) {
					nombres=Arrays.copyOf(nombres, nombres.length+1);
					nombres[nombres.length-1]=nombre;
				}else {
					System.out.println("El nombre ya esta en el libro");
				}
				
				break;
			
			case 2:
				System.out.println(Arrays.toString(nombres));
				break;
				
			case 3:
				try {
					ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app18/nombres.dat"));
				
					out.writeObject(nombres);
					out.close();
				
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (opcion!=3);
	}

}
