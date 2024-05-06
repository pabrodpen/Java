package prop4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        double n=10;
        Scanner scanner=new Scanner(System.in);
        Collection<Double> positivos= new ArrayList<>();
        Collection<Double> negativos=new ArrayList<>();

        while(n!=0){
            System.out.print("Numero:");
            n=scanner.nextInt();

            if(n>0){
                positivos.add(n);
            }else{
                negativos.add(n);
            }
        }

        Iterator iteratorPos=positivos.iterator();
        Iterator iteratorNeg=negativos.iterator();

        double sumaPosit=0;
        double sumaNeg=0;

        System.out.println(positivos);
        System.out.println(negativos);
        while(iteratorPos.hasNext()){
            double numero= (double) iteratorPos.next();
            sumaPosit+=numero;
        }

        while(iteratorNeg.hasNext()){
            double numero= (double) iteratorNeg.next();
            sumaNeg+=numero;
        }

        System.out.println("Suma positivos:"+sumaPosit);
        System.out.println("Suma negativos:"+sumaNeg);

    }
}
