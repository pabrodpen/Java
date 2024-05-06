package res10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++){
            int n=(int)(Math.random()*(10-1+1)+1);
            lista.add(n);
        }

        System.out.println("LISTA");
        System.out.println(lista);


        System.out.println("ELEMENTOS SIN REPETIR");
        //pasamos a un set
        Set<Integer> sinRepetir=new TreeSet<>();

        sinRepetir.addAll(lista);
        System.out.print(sinRepetir);
        System.out.println();
        System.out.println("ELEMENTOS REPETIDOS");

        List<Integer> repetidos=new ArrayList<>(lista);
        for(Integer elemento:sinRepetir){
            repetidos.remove(elemento);//eliminamos los elementos que no estan repetidos(los del cjto)
        }
        System.out.println(repetidos);

        System.out.println("ELEMENTOS QUE SOLO ESTAN 1 VEZ");
        //lo que hago es añadir todos los elmentos distintos que estan en la lista(cjto sinRepetir)
        Set<Integer> unicos=new TreeSet<>();
        unicos.addAll(sinRepetir);
        //y despues elimino los que estan repetidos para quedarme con los que solo salen 1 vez
        unicos.removeAll(repetidos);

        System.out.println(unicos);

    }
}
