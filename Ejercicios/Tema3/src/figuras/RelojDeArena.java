package figuras;

public class RelojDeArena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 n=5
		  * * * * *	i=0 0- 5* 0-
		  _ * * * _	i=1 1- 3* 1-  
		  _ _ * _ _	i=2 2- 1* 2-
		  
		  PARTE SUPERIOR *=i, espacios=n-2*i, *=i
		  
		  _ * * * _	i=3 1- 3* 1-
		  * * * * *	i=4 0- 4* 0_
		  
		  PARTE INFERIOR *=2*i+1, espacios=n/2-i, *=2*i+1
		  
		  		 */
		
		
		int n=5;//impar
		
		//PARTE SUPERIOR (3 PRIMERAS LINEAS)
		for(int i=0;i<n/2+1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<n-2*i;k++) {
				System.out.print("* ");
			}
			for(int l=0;l<i;l++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		//PARTE INFERIOR(2 ULTIMAS LINEAS)
		for(int i=1;i<n/2+1;i++) {//IMP->PARA QUITAR LA PRIMERA LINEA DEL BUCLE GRANDE
			//DE ABAJO SOLO HAY QUE INICIALIZAR EL BUCLE EN 1 EN LUGAR DE 0
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("* ");
			}
			for(int l=0;l<n/2-i;l++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
