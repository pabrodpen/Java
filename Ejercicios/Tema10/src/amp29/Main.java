package amp29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		boolean dentroComentario=false;
		try {
			BufferedReader in=new BufferedReader(new FileReader("src/amp29/codigo.txt"));
			BufferedWriter out=new BufferedWriter(new FileWriter("src/amp29/sin_comentarios_codigo.txt"));
			String linea;
			while((linea=in.readLine())!=null) {
				if(!dentroComentario) {
					//si estamos fuera de un comentario de varias lineas:
					/*
					 * 1ºsi hay un // eliminamos esa linea
					 * 2º si hay un /* significa que empezamos 
					 * un comentario de varias lineas , por lo que cambiamos
					 * el boolean y eliminamos la linea de comienzo*/
					if(linea.contains("//")) {
						linea=linea.substring(0,0);//dejamos la linea a "" para que se la salte
					}else if(linea.contains("/*")) {
						linea="";
						dentroComentario=true;
					}
				}else {
					//si estamos dentro de un comentario de varias lineas:
					/*
					 * 1º si hay un simbolo de fin de comentario significa que
					 * se acaba el comentario de varias lineas, por lo que cambiamos
					 * el boolean y eliminamos la linea de final
					 * 2º si no es asi, significa que seguimos estando dentro de 
					 * un comentario de varias lineas, por lo que la linea que estamos
					 * tratando es un comentario, asi que la eliminamos
					 * */
					if(linea.contains("*/")) {
						linea="";
						dentroComentario=false;
					}else {
						linea="";
					}
				}
				
				if(!linea.isEmpty()) {
					out.write(linea);
					out.newLine();
				}
				
				
				
			}
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("escrito");
	}

}
