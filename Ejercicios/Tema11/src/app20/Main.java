package app20;

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
		
		ConjClientes conjClientes=new ConjClientes();
		Cliente cliente;
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/app20/clientes.dat"));
			
			conjClientes=(ConjClientes) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		do {
			System.out.println("1.ALTA CLIENTE");
			System.out.println("2.BAJA CLIENTE");
			System.out.println("3.MODIFICAR CLIENTE");
			System.out.println("4.LISTAR CLIENTES");
			System.out.println("5.GUARDAR Y SALIR");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				scanner.nextLine();
				System.out.print("Nombre:");
				String nombre=scanner.nextLine();
				System.out.print("Telefono");
				int tfno=scanner.nextInt();
				
				cliente=new Cliente(nombre, tfno);
				conjClientes.addCliente(cliente);
				break;
				
			case 2:
				System.out.print("ID del cliente que quieres eliminar:");
				int id=scanner.nextInt();
				
				int posCliente=conjClientes.buscarCliente(id);
				conjClientes.rmCliente(posCliente);
				break;
				
			case 3:
				System.out.print("ID del cliente que quieres modificar:");
				id=scanner.nextInt();
				if(id>conjClientes.clientes.length) {
					System.out.println("El cliente no existe");
				}else {
					System.out.print("Nuevo nombre:");
					scanner.nextLine();
					String nuevoNombre=scanner.nextLine();
					System.out.print("Nuevo telefono:");
					int nuevoTfno=scanner.nextInt();
					
					posCliente=conjClientes.buscarCliente(id);
					conjClientes.clientes[posCliente].setNombre(nuevoNombre);
					conjClientes.clientes[posCliente].setTfno(nuevoTfno);
				}
					break;
					
					
			case 4:
			System.out.println("CLIENTES");
			System.out.println(Arrays.toString(conjClientes.clientes));
			break;
			
			case 5:
				try {
					ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app20/clientes.dat"));
					
				
					out.writeObject(conjClientes);
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
			}
		} while (opcion!=5);
	}

}
