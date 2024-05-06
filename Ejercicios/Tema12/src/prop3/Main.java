package prop3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
        Iterator iterator= collection.iterator();

        while(iterator.hasNext()){
            int n= (int) iterator.next();
            if(n==5){
               iterator.remove();
            }
        }
        System.out.println(collection);


    }
}
