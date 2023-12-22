package figuras;
import java.util.Scanner;
public class RomboEnmarcadoAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  n=5-->altura del rombo
		 
		 
		 
		  
		 * * * * * * * * *	 horizontal					
		 * __ __ * __ __ *	 i=0 1* 2- 1* 2- 1*
		 * __  * * *  __ *	 i=1 1* 1- 3* 1- 1*
		 * * * * * * * * * 	 i=2 1* 0- 5* 0- 1*
		 * __  * * *  __ *	 i=3 1* 1- 3* 1- 1*
		 * __ __ * __ __ *	 i=4 1* 2- 1* 2- 1*
		 * * * * * * * * *	 horizontal
		 
		 
		 
		  */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime la altura del rombo:");
		int n=sc.nextInt();
		
		//horizontal para empezar la figura
		for(int i=0;i<n+4;i++) {
			System.out.print("* ");
		}
		System.out.println();
		int asteriscosCentro=1;
		
		//PARTE SUPERIOR DE LA FIGURA
		for(int i=0;i<n/2+1;i++) {
			
			for(int j=0;j<1;j++) {//asterisco de la izq(siempre es 1)
				System.out.print("* ");
			}
			for(int k=n/2+1-i;k>0;k--) {//espacios de la izq (siempre es n/2+1-i)
				System.out.print("  ");
			}
			for(int l=0;l<asteriscosCentro;l++) {//asteriscos del centro
				//lo incializamos en 1 que es el de la primera linea
				System.out.print("* ");
			}
			asteriscosCentro+=2;//por cada linea le vamos sumando 2 
			for(int k=n/2+1-i;k>0;k--) {//mismo bucle que los espacios de la izq
				//esta vez para los de la derecha
				System.out.print("  ");
			}
			for(int o=0;o<1;o++) {//asterisco de la derecha(siempre es 1)
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//como ya hemos dibujado la linea con mas *
		
		//quitamos cada bucle y los ponemos cada uno al reves
		
		asteriscosCentro=n-2;//para quitar el primer paso con respecto a los *,
		//quitamos 2* antes de empzar los 
		
		for(int i=n/2+1;i>1;i--) {//lo mismo , como ya hemos dibujado 
			//la linea del centro ponemos en todos los bucles un paso menos(i>1 en lugar de 0)
			
			for(int j=0;j<1;j++) {//no hace falta saltarse pasos en este bucle
				//ya que solo hace el * del lado(siempre es 1)
				System.out.print("* ");
			}
			for(int k=0;k<=n/2+1-i+1;k++) {//lo mismo ponemos +1, ya que ahora
				//al darle la vuelta al bucle, va creciendo, por lo que
				//para saltarse el primer paso hacemos +1
				System.out.print("  ");
			}
			
			for(int l=asteriscosCentro;l>0;l--) {
				System.out.print("* ");
			}
			asteriscosCentro-=2;
			for(int k=0;k<=n/2+1-i+1;k++) {//lo mismo ponemos +1, ya que ahora
				//al darle la vuelta al bucle, va creciendo, por lo que
				//para saltarse el primer paso hacemos +1
				System.out.print("  ");
			}
			for(int o=0;o<1;o++) {//no hace falta saltarse pasos en este bucle
				//ya que solo hace el * del lado(siempre es 1)
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//horizontal para cerrar la figura
		for(int i=0;i<n+4;i++) {
			System.out.print("* ");
		}
	}

}
