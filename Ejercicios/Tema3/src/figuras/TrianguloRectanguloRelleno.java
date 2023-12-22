package figuras;
import java.util.Scanner;
public class TrianguloRectanguloRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HACER EN TODAS LAS POSICIONES Y CON EL NUMERO DE FIBONACCI
		
		Scanner sc=new Scanner(System.in);
		/*
		 
		* * * * 
		* * * 
		* * 
		* 
		
		*/
		System.out.print("Numero de asteriscos:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/*
		 
		*
		* *
		* * *
		* * * *
		      
		*/
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {//depende de i:si i=1, 1*,si i=2, 2*
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		/*
		 
		        *
		      * *
		    * * *
		  * * * *
		  
		  */
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		/*
		 
		* * * *  -->i=0 n=4 0 espacios y 4 *
		_ * * *	--> i=1 n=4 1 espacio y 3*
		_ _ * *	--> i=2 n=4 2 espacios y 2*
		_ _ _ * -->i=1 n=4 3 espacios y 1*
		
		Asi que espacios=i(cont<i); *=n-i(cont<n-i)
		      
		*/
		
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {//espacios
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//Triangulo de Pascal
		
		//Formula---> E(n,m)=n!/(m!*(n-m)!)
		//Como es un triangulo rectangulo el numero de * con el numero de filas
		//Fila 1-->1*, Fila 2-->2*
		
		//hacemos el codigo normal del triangulo rectangulo
		//pero dentro del for anidado ponemos los calculos de los numeros y
		//lo mostramos en lugar de un *
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {//depende de i:si i=1, 1*,si i=2, 2*
				//calculamos el factorial de i
				int cont=i;
				int factI=1;
				while(cont>=1) {
					factI*=cont;
					cont--;
				}
				cont=j;
				//calculamos el factorial de j
				int factJ=1;
				while(cont>=1) {
					factJ*=cont;
					cont--;
				}
				//calculamos el factorial de la resta de ambos
				cont=i-j;
				int factResta=1;
				while(cont>=1) {
					factResta*=cont;
					cont--;
				}
				int resultado=factI/(factJ*(factResta));//aplicamos la formula
				System.out.print(resultado+" ");//la mostramos en lugar del *
			}
			System.out.println();
		}
		
		
		
	}
	

}
