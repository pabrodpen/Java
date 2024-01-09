package ejerciciosClase;
import java.util.Scanner;
public class SopaLetras {

	static String[]palabras= {"pala","bar","roca"};
	static String negritaInicio = "\u001B[1m";
    static String negritaFin = "\u001B[0m";
    static String SsubrayadoInicio = "\u001B[4m";
    static String subrayadoFin = "\u001B[24m";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Definir secuencias de escape ANSI para formato de texto

      
		Scanner sc=new Scanner(System.in);
		
		
		
		char[][]tablero= {{'-','-','-','-','-','-'},{'-','-','-','-','-','-'},{'-','-','-','-','-','-'},
				{'-','-','-','-','-','-'},{'-','-','-','-','-','-'},{'-','-','-','-','-','-'}};
		
		//1º ponemos las palabras en el tablero
		//2º rellenamos las casillas vacias con letras random
		
		
		
		
		
		//0-->ponemos la palabra en vertical
		//1-->ponemos la palabra en horizontal
		//2-->ponemos la palabra en diagonal
		
		  for (String palabraOriginal : palabras) {
	            String palabra = palabraOriginal;
	            int opcionColocacion = (int) (Math.random() * 2);  // 0 o 1
	            boolean ocupado;

	            do {
	                ocupado = false; // Suponemos que el espacio está disponible

	                if (opcionColocacion == 0) { // Lo ponemos a lo largo del tablero
	                    int numFila = (int) (Math.random() * tablero.length);
	                    int numCol = (int) (Math.random() * (tablero[0].length - palabra.length() + 1));

	                    for (int i = 0; i < palabra.length() && !ocupado; i++) {
	                        if (tablero[numFila][numCol + i] != '-') {
	                            ocupado = true; // Espacio ocupado
	                        }
	                    }

	                    if (!ocupado) {
	                        for (int i = 0; i < palabra.length(); i++) {
	                            tablero[numFila][numCol + i] = palabra.charAt(i);
	                        }
	                    }
	                } else if (opcionColocacion == 1) { // Lo ponemos a lo ancho del tablero
	                    int numCol = (int) (Math.random() * tablero.length);
	                    int numFila = (int) (Math.random() * (tablero.length - palabra.length() + 1));

	                    for (int i = 0; i < palabra.length() && !ocupado; i++) {
	                        if (tablero[numFila + i][numCol] != '-') {
	                            ocupado = true; // Espacio ocupado
	                        }
	                    }

	                    if (!ocupado) {
	                        for (int i = 0; i < palabra.length(); i++) {
	                            tablero[numFila + i][numCol] = palabra.charAt(i);
	                        }
	                    }
	                }

	                if (ocupado) {
	                    // Cambiamos la palabra y volvemos a intentar
	                    opcionColocacion = (int) (Math.random() * 2);
	                    palabra = palabraOriginal;
	                }
	            } while (ocupado);
	        }

		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero.length;j++) {
				if(tablero[i][j]=='-') {
					tablero[i][j]=(char) (Math.random()*26+'a');
				}
			}
		}
		
		
		System.out.println("BIENVENIDO A LA SOPA DE LETRAS");
		System.out.println("HAY "+palabras.length+" PALABRAS PARA ENCONTRAR");
		System.out.println();
		System.out.println();
		
		mostrar(tablero);
		
		int aciertos=0;
		
		while(aciertos<palabras.length) {
			System.out.print("Escribe una palabra:");
			String pal=sc.nextLine();
			
			boolean encontrado=false;
			for(int i=0;i<palabras.length && !encontrado;i++) {
				if(pal.equals(palabras[i])) {
					resaltarAcierto(tablero, pal);
					aciertos++;
					if(aciertos<palabras.length) {
						System.out.println("SIGUE ASI!!!");
						System.out.println("TE QUEDAN "+(palabras.length-aciertos)+" PALABRAS");
					}
					encontrado=true;
				}
			}
		}
		
		System.out.println("HAS GANADO!!!");
	}
	
	static void mostrar(char[][]t) {
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[i].length;j++) {
				System.out.print(t[i][j]+" | ");
			}
			System.out.println();
		}
	}
	
	static void resaltarAcierto(char[][]t,String p) {
		String intento="";
		boolean acertado=false;
		
			for(int i=0;i<t.length;i++) {
				for(int j=0;j<t[i].length;j++) {
						intento+=t[i][j];
				}
				if(p.equals(intento)) {
					for(int j=0;j<t.length;j++) {
						for(int k=0;k<t[i].length;k++) {
								t[j][k]='✅';
						}
				}
			}	
		}
		
	}
	

}
