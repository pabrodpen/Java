package app16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String[]nombres=new String[0];
		//leemos los nombres que haya del fichero
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/app16/nombres.dat"));
			
            nombres = (String[]) in.readObject(); // Leer el array directamente
            in.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		int opcion=0;
		
		do {
			System.out.println("1.Escribir nombres");
			System.out.println("2.Listar nombres");
			System.out.println("3.Guardar ysalir");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			
			switch (opcion) {
			case 1:
				System.out.print("Dime un nombre:");
				String nombre=scanner.next();
				while(!nombre.equals("fin")) {
					
					boolean encontrado=false;
					for(int i=0;i<nombres.length && !encontrado;i++) {
						if(nombres[i].equals(nombre)) {
							encontrado=true;
						}
					}
					
					if(!encontrado) {
						nombres=Arrays.copyOf(nombres, nombres.length+1);
						nombres[nombres.length-1]=nombre;
					}
					System.out.print("Dime un nombre:");
					nombre=scanner.next();
				}
				break;
				
			case 2:
				System.out.println("NOMBRES");
				System.out.println(Arrays.toString(nombres));
				break;
				
			case 3:
				try {
					ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app16/nombres.dat"));
					
					out.writeObject(nombres);
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		} while (opcion!=3);
	}

}
