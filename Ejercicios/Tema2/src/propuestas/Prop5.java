package propuestas;
import java.util.Scanner;
public class Prop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

	    double aforo,numEntradas,precio;

	    System.out.print("Aforo maximo:");
	      aforo=teclado.nextDouble();
	    System.out.print("Precio de la entrada:");
	      precio=teclado.nextDouble();
	    System.out.print("Entradas vendidas:");
	      numEntradas=teclado.nextDouble();

	      if(numEntradas<=(aforo*0.2)){
	        System.out.print("Lo siento, se cancela el concierto");
	      }else if(numEntradas<=(aforo*0.5)){
	        precio=precio*0.75;
	        System.out.print("Nuevo precio de la entrada:"+precio);
	      }else{
	        System.out.print("El precio de la entrada sigue siendo el mismo");
	      }

	    }
	}


