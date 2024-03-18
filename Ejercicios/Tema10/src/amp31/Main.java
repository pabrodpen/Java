package amp31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		ConjClientes conjClientes=new ConjClientes();
		Cliente cliente;
		int opcion=0;
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

		//imp hacer la leida de datos del principio (del tyxt al array) antes del do-while
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/amp31/clientes.txt"));
			String linea;
			//nos saltamos el encabezado
			in.readLine();
			while((linea=in.readLine())!=null) {
				String[]aux=linea.split("\t");
				String dni=aux[0];
				String nombre=aux[1];
				
	            String fechaString=aux[2];
				double saldo=Double.parseDouble(aux[3]);
				
				cliente=new Cliente(dni, nombre, fechaString, saldo);
				conjClientes.addCliente(cliente);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		do {
			
			
			
			System.out.println("MENU DE GESTION DEL BANCO");
			System.out.println("1.Alta cliente");
			System.out.println("2.Baja cliente");
			System.out.println("3.Listar clientes");
			System.out.println("4.Modificar saldo");
			System.out.println("5.Salir");
			System.out.print("Dime una opcion:");
			opcion=scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("DNI del cliente:");
				String dni=scanner.next();
				System.out.print("Nombre del cliente:");
				String nombre=scanner.next();
				System.out.print("Fecha de nacimiento:");
				String fecha=scanner.next();
				System.out.print("Saldo del cliente:");
				double saldo=scanner.nextDouble();
				
				cliente=new Cliente(dni, nombre, fecha, saldo);
				conjClientes.addCliente(cliente);
				break;
			case 2:
				System.out.print("DNI del cliente que quieres eliminar:");
				dni=scanner.next();
				
				if(conjClientes.buscarCliente(dni)>=0) {
					conjClientes.rmCliente(dni);
					System.out.println("Cliente eliminado");
				}else {
					System.out.println("Cliente no encontrado");
				}
				break;
			
			case 3:
				System.out.println("CLIENTES DEL BANCO");
				System.out.println(conjClientes.toString());
				break;
			
			case 4:
				System.out.print("DNI del cliente");
				dni=scanner.next();
				int posCliente=conjClientes.buscarCliente(dni);
				if(posCliente>=0) {
					System.out.print("Nuevo saldo:");
					double nuevoSaldo=scanner.nextDouble();
					
					conjClientes.conjClientes[posCliente].setSaldo(nuevoSaldo);
						
					
				}else {
					System.out.println("Cliente no encontrado");
				}
				break;
				
			case 5:
				try {
					BufferedWriter out=new BufferedWriter(new FileWriter("src/amp31/clientes.txt"));
					out.write("DNI\tNombre\tFecha nac\tSaldo");
					out.newLine();
					
					for(int i=0;i<conjClientes.conjClientes.length;i++) {
						cliente=conjClientes.conjClientes[i];
						out.write(String.valueOf(cliente.getDni()+"\t"+cliente.getNombre()+"\t"+cliente.getFechaNac().format(formatter)+"\t"+cliente.getSaldo()));
						out.newLine();
					}
					out.close();
					System.out.println("DATOS GUARDADOS");
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				break;
			}
		} while (opcion!=5);
	}

}
