package ejerciciosClase;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //Realiza una calculadora con 4 operaciones-->(0,salida-->1,suma-->2,resta-->3
			//,multiplicacion-->4,division)
		
		Scanner sc=new Scanner(System.in);
			int opcion=-1;

			do {
				System.out.println("MENU");
				System.out.println("0-SALIDA");
				System.out.println("1-SUMA");
				System.out.println("2-RESTA");
				System.out.println("3-MULTIPLICACION");
				System.out.println("4-DIVISION");
				
				System.out.print("Dime un numero:");
				int n1=sc.nextInt();
				System.out.println("Dime otro:");
				int n2=sc.nextInt();
				
				System.out.print("Señala una opcion:");
				opcion=sc.nextInt();
				
				
				double resultado;
				switch (opcion) {
				case 1:
					resultado=(int)n1+n2;
					System.out.println("Resultado:"+resultado);
					break;
				case 2:
					resultado=(int)n1-n2;
					System.out.println("Resultado:"+resultado);
					break;
				case 3:
					resultado=n1*n2;
					System.out.println("Resultado:"+resultado);
					break;
				case 4:
					resultado=(double)n1/n2;
					System.out.println("Resultado:"+resultado);
					break;
				}
		} while (opcion!=0);
			System.out.println("HAS SALIDO DEL PROGRAMA");
	}

}
