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
		Cliente[]clientes=new Cliente[0];
		Cliente cliente;
		int opcion=0;
		
		do {
			
			try {
				BufferedWriter out=new BufferedWriter(new FileWriter("src/amp31/clientes.txt"));
				out.write("DNI\tNombre\tFecha de nacimiento\tSaldo");
				out.newLine();
				out.close();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			try {
				BufferedReader in=new BufferedReader(new FileReader("src/amp31/clientes.txt"));
				String linea;
				while((linea=in.readLine())!=null) {
					String[]aux=linea.split("\t");
					String dni=aux[0];
					String nombre=aux[1];
					String fechaString=aux[2];
					double saldo=Double.parseDouble(aux[3]);
					
					cliente=new Cliente(dni, nombre, fechaString, saldo);
					clientes=Arrays.copyOf(clientes, clientes.length+1);
					clientes[clientes.length-1]=cliente;
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			System.out.println("MENU DE GESTION DEL BANCO");
			System.out.println("1.Alta cliente");
			System.out.println("2.Baja cliente");
			System.out.println("3.Listar clientes");
			System.out.println("4.Salir");
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
				clientes[clientes.length-1]=cliente;
				break;
			case 2:
				System.out.print("DNI del cliente que quieres eliminar:");
				dni=scanner.next();
				
			}
		} while (opcion!=4);
	}

}
