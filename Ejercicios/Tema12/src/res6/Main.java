package res6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[]args){
        Collection<Integer> collection=new ArrayList<>();

        for(int i=0;i<100;i++){
            int n=(int)(Math.random()*(10-1+1)+1);
            collection.add(n);
        }
        System.out.println("COLECCION");
        System.out.println(collection);

        System.out.println("SIN NUMEROS 5");
        boolean eliminado=collection.remove(5);

        while(eliminado){
            eliminado=collection.remove(5);
        }
        System.out.println(collection);

        Integer[]t=collection.toArray(new Integer[collection.size()]);
        System.out.println("COLECCION CONVERTIDA EN TABLA");
        System.out.println(Arrays.toString(t));
    }
}
