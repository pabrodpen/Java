package aplicacion;

import java.util.Scanner;

public class App15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado=new Scanner(System.in);
		
		System.out.print("Escribe un texto:");
		String texto=teclado.nextLine();
		
		System.out.print("Dime el titulo del texto:");
		String titulo=teclado.nextLine();
		
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<meta charset=\"utf-8\">");
		System.out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		System.out.println("<title>Creado con Java</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("\t<h1> "+titulo+" </h1>");
		System.out.println("\t<p> "+texto+" </p>");
		System.out.println("</body>");
		System.out.println("</html>");
	}

}
