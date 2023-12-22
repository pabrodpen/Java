package aplicacion;

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Dime el radio:");
        double radio=teclado.nextDouble();
        teclado.close();

        double resultado1=volumen(radio);
        double resultado2=superficie(radio);

        System.out.println("Volumen:"+resultado1);
        System.out.println("Superficie:"+resultado2);
        
    }
    static double volumen(double radio){
        double resultado1=(4*Math.PI/3)*Math.pow(radio,3);
        return(resultado1);
    }
    static double superficie(double radio){
        double resultado2=4*Math.PI*Math.pow(radio,2);
        return(resultado2);
    }
    
}