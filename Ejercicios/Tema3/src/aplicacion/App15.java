package aplicacion;

import java.util.Scanner;

public class App15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);

	        //Formula---> E(n,m)=n!/(m!*(n-m)!)

	        int n;

	        System.out.print("Dime un numero n:");
	            n=sc.nextInt();
	        
	        for(int fila=0;fila<=n;fila++){
	            for(int elemento=0;elemento<=fila;elemento++){
	                int factorial_n=1;
	                for(int i=1;i<=fila;i++){
	                    factorial_n*=i;
	                }
	                int factorial_m=1;
	                for(int i=1;i<=elemento;i++){
	                    factorial_m*=i;
	                }
	                int factorial_resta=1;
	                for(int i=1;i<=fila-elemento;i++){
	                    factorial_resta*=i;
	                }
	                int valor=factorial_n/(factorial_m*factorial_resta);
	                    System.out.print(valor+ "");
	            }
	            System.out.println("");
	        }
	}

}
