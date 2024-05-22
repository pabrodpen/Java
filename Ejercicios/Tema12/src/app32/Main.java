package app32;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        List<Integer> numeros=new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(-4);

        List<Integer> copiaLista=clonalista(numeros);

        System.out.println(copiaLista);

    }
    static <E> List<E> clonalista(List<E> lista){
        List<E> copia=new ArrayList<>(lista);
        return copia;
    }
}
