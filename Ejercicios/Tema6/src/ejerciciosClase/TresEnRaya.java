package ejerciciosClase;
import java.util.Scanner;

public class TresEnRaya {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]tablero= {{"*️⃣","*️⃣","*️⃣"},{"*️⃣","*️⃣","*️⃣"},{"*️⃣","*️⃣","*️⃣"}};
		
		boolean ganador=false,perdedor=false;
		boolean[]resultados=new boolean[2];
		
		int numCasillas=0;
		
		while (!ganador && !perdedor && numCasillas < 9) {
		    dibujarCoordenadaJugador(tablero);
		    numCasillas++;
		    resultados = comprobarFinJuego(tablero);
		    ganador = resultados[0];
		    perdedor = resultados[1];
		    if(numCasillas<9) {//en el caso de que haya empate y el jugador ponga 
		    	//la ultima casilla(numCasillas>=9), por lo que se salta el turno de la maquina y acaba el bucle
			    dibujarCoordenadaMaquina(tablero);
			    resultados = comprobarFinJuego(tablero);
			    numCasillas++;
		    }
		    

		    
		    mostrar(tablero);

		    ganador = resultados[0];
		    perdedor = resultados[1];
		    System.out.println("SIGUIENTE TURNO");
		    System.out.println();
		}

			
			
		
		if(ganador) {
			System.out.println("HAS GANADO!");
		}else if(perdedor) {
			System.out.println("HAS PERDIDO!");
		}else if(numCasillas>=9){
			System.out.println("EMPATE");
		}
		
		
		
		mostrar(tablero);
		
		
	}
	
	
	
	static void dibujarCoordenadaJugador(String [][]t) {
		System.out.println("🫵");
		boolean vacio=false;
		System.out.print("Fila(0 al 2):");
		int fila=sc.nextInt();
		System.out.print("Columna(0 al 2):");
		int columna=sc.nextInt();
		while(!vacio) {
			if(t[fila][columna].equals("-")) {
				t[fila][columna]=t[fila][columna].replace("-", "X");
				vacio=true;
			}else {
				System.out.println("Posicion ocupada");
				System.out.print("Fila(0 al 2):");
				fila=sc.nextInt();
				System.out.print("Columna(0 al 2):");
				columna=sc.nextInt();
			}
			
		}
		
			
			
					
		}
	
	
	static void dibujarCoordenadaMaquina(String[][] t) {
	    boolean vacio = false;
	    int filaMaq, colMaq;

	    while (!vacio) {
	    	filaMaq = (int) (Math.random() * 3); // Genera un número entre 0 y 2 inclusive
	        colMaq = (int) (Math.random() * 3);

	        if (t[filaMaq][colMaq].equals("-")) {
	            t[filaMaq][colMaq] = "O";
	            vacio = true;
	        }
	    }
	}

	
	static boolean[] comprobarFinJuego(String[][] t) {
	    boolean finJuego = false, ganador = false, perdedor = false;

	    for (int i=0;i<t.length && (!ganador || !perdedor);i++) {
	        //filas
	    	//que la primera casilla que comprobamos no sea -
	        if (!t[i][0].equals("-") && t[i][0].equals(t[i][1]) && t[i][1].equals(t[i][2])) {
	            if (t[i][0].equals("X")) {
	                ganador = true;
	            } else if (t[i][0].equals("O")) {
	                perdedor = true;
	            }
	        }

	        // Comprobación de columnas
	        if (!t[0][i].equals("-") && t[0][i].equals(t[1][i]) && t[1][i].equals(t[2][i])) {
	            if (t[0][i].equals("X")) {
	                ganador = true;
	            } else if (t[0][i].equals("O")) {
	                perdedor = true;
	            }
	        }
	    }

	    // Comprobación de diagonales
	    if (!ganador || !perdedor) {
	        if (!t[0][0].equals("-") && t[0][0].equals(t[1][1]) && t[1][1].equals(t[2][2])) {
	            if (t[0][0].equals("X")) {
	                ganador = true;
	            } else if (t[0][0].equals("O")) {
	                perdedor = true;
	            }
	        } else if (!t[0][2].equals("-") && t[0][2].equals(t[1][1]) && t[1][1].equals(t[2][0])) {
	            if (t[0][2].equals("X")) {
	                ganador = true;
	            } else if (t[0][2].equals("O")) {
	                perdedor = true;
	            }
	        }
	    }

	   
	    boolean[]resultados=new boolean[2];
	    resultados[0]=ganador;
	    resultados[1]=perdedor;
	    return resultados;
	}

	static void mostrar(String[][]t) {
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}
	}

}
