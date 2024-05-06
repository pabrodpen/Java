package res4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Collection<Integer> coleccionEnteros=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        int n=10;

        while (n!=-1){
            System.out.print("Numero:");
            n=scanner.nextInt();

            if(n>=0){
                coleccionEnteros.add(n);
            }

        }

        System.out.println("COLECCION DE ENTEROS");
        System.out.println(coleccionEnteros);

        System.out.println("NUMEROS PARES");
        Iterator<Integer> iterator=coleccionEnteros.iterator();

        while(iterator.hasNext()){
            int numero= iterator.next();
            if(numero%2==0){
                System.out.println(numero);
            }
        }

        System.out.println("SIN MULTIPLOS DE 3");
        iterator = coleccionEnteros.iterator(); // Reiniciamos el iterador
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 3 == 0) {
                iterator.remove(); // Eliminamos el elemento actual del iterador y del conjunto original
            }
        }
        System.out.println(coleccionEnteros);
    }
}
