package figuras;

public class LetraK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 * * * *
		 *   * triangulo+*+tri
		 *  *
		 * *
		 *  *
		 *   *    
		 * * * *
		 
		  
		 */
		int n=9;
		for(int i=0;i<n/2-1;i++) {//n/2-1 para quitar la punta del triangulo de arriba
			for(int j=0;j<n/2-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n/2;i++) {//si lo inicializo le quito uno para que cuadre con el *
			for(int j=0;j<=i;j++) {//depende de i:si i=1, 1*,si i=2, 2*
				System.out.print("* ");
			}
			System.out.println();
		}
    
	}

}
