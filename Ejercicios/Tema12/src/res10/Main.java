package res10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++){
            int n=(int)(Math.random()*(10-1+1)+1);
            lista.add(n);
        }

        System.out.println("ELEMENTOS SIN REPETIR");
        //pasamos a un set
        Set<Integer> sinRepetir=new HashSet<Integer>();

        sinRepetir.addAll(lista);
        System.out.print(sinRepetir);
        System.out.println();
        System.out.println("ELEMENTOS REPETIDOS");
        for(int i=0;)


    }
}
