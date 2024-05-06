package res5;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[]args){
        Collection<Integer> collection=new ArrayList<>();

        for(int i=0;i<20;i++){
            int n=(int)(Math.random()*(10-1+1)+1);
            collection.add(n);
        }
        System.out.println("COLECCION");
        System.out.println(collection);

        System.out.println("SIN REPETIDOS");
        Collection<Integer> sinRepetidos=new ArrayList<>();
        for(Integer n:collection){
            if(!sinRepetidos.contains(n)){
                sinRepetidos.add(n);
            }
        }
        System.out.println(sinRepetidos);
    }
}
