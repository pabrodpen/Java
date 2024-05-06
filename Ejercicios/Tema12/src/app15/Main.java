package app15;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[]args){
        List<Integer> lista=new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(4);
        lista.add(36);

        List<Integer> sinRepetir=sinRepeticiones(lista);
        System.out.println(sinRepetir);

    }
    static <T> List<T> sinRepeticiones(List<T> lista){
        Set<T> cjto=new TreeSet<>();
        cjto.addAll(lista);

        List<T> res=new ArrayList<>(cjto);
        return res;
    }
}
