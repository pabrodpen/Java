package aplicacion;

import java.util.Scanner;

public class App19 {
    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
    	System.out.println("Cantidad de numeros:");
    	int c=sc.nextInt();
    	numerosdelCeroAlUno(c);
       

    }
    static void numerosdelCeroAlUno(int cantidad) {
    	for(int i=1;i<=cantidad;i++) {
    		double numero=Math.random();
    		System.out.println(numero);
    	}
    }
    
}