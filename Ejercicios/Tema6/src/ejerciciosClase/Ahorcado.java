package ejerciciosClase;
import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;
public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String[]palabras= {"lampara","hoyo","perro"};
		int aciertos=0,vidas=7;
		int opcion=(int)(Math.random()*palabras.length);
		
		String palabra=palabras[opcion];
		String palabraProgreso="";
		for(int i=0;i<palabra.length();i++) {//dibujamos los guiones de la palabra
			palabraProgreso+="-";
		}
		
		System.out.println("BIENVENIDO AL AHORCADO");
		System.out.println(palabraProgreso);
		
		do {
			
			
			System.out.print("Escribe una letra:");
			char letra=sc.nextLine().charAt(0);
			
			if(acertado(palabra, letra)) {
				String[]resultados=new String[2];
				resultados=progreso(palabra, letra,aciertos,palabraProgreso);
				palabraProgreso=resultados[0];
				aciertos=Integer.parseInt(resultados[1]);
				System.out.println("CORRECTO! SIGUE ASI");
				System.out.println(palabraProgreso);
				System.out.println();
				System.out.println();
			}else {
				dibujar(vidas);
				vidas--;
				System.out.println();
				System.out.println();
				System.out.println(palabraProgreso);
				
			}
			
		} while (aciertos<palabra.length() && vidas>0);
		
		if(aciertos>=palabras.length) {
			System.out.println("HAS GANADO!");
		}else {
			System.out.println("LO SIENTO, HAS PERDIDO!");
			System.out.println("La palabra era:"+palabra);
		}
		
	}

	static void dibujar(int v) {
		switch (v) {
		//de 1 vida a 0 vidas
		case 1: 
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|        /|\\");
			System.out.println("|        / \\");
			System.out.println("|");
			System.out.println("|");
			break;
		
		//de 2 vidas a 1 vida
		case 2: 
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|        /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		
		//de 3 vidas a 2 vidas
		case 3: 
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		
		//de 4 vidas a 3 vidas
		case 4: 
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|         O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			
			break;
		
		//de 5 vidas a 4 vidas
		case 5: 
			System.out.println("___________");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");

			break;
		
		//de 6 vidas a 5 vidas
		case 6: 
			System.out.println("___________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		
		//de 7 vidas a 6 vidas
		case 7:
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		
		
		}
	}
	
	static String[] progreso(String p,char l,int numAciertos,String guiones) {
		String[]res=new String[2];
		char[]caracteres=guiones.toCharArray();
		for(int i=0;i<p.length();i++) {
			if(l==p.charAt(i)) {
				caracteres[i]=l;
				numAciertos++;
			}
		}
		
		guiones=String.valueOf(caracteres);
		res[0]=guiones;
		res[1]=String.valueOf(numAciertos);
		return res;
		
	}
	
	static boolean acertado(String p,char l) {
		boolean acierto=false;
		for(int i=0;i<p.length() && !acierto;i++) {
			if(l==p.charAt(i)) {
				acierto=true;
			}
		}
		return acierto;
	}
}
