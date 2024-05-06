package app11_12_13_14;

import java.util.*;

public class Contenedor<T> {
    private T[]objetos;

    public Contenedor() {
        this.objetos= (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "objetos=" + Arrays.toString(objetos) +
                '}';
    }

    void insertarAlPrincipio(T nuevo){
        objetos=Arrays.copyOf(objetos,objetos.length+1);
        System.arraycopy(objetos,0,objetos,1,objetos.length-1);
        objetos[0]=nuevo;
    }

    void insertarAlFinal(T nuevo){
        objetos=Arrays.copyOf(objetos,objetos.length+1);
        objetos[objetos.length-1]=nuevo;
    }

    T extraerDelPrincipio(){
        T extraido=objetos[0];
        System.arraycopy(objetos,1,objetos,0,objetos.length-1);
        objetos=Arrays.copyOf(objetos,objetos.length-1);
        return extraido;
    }

    T extraerDelFinal(){
        T extraido=objetos[objetos.length-1];
        objetos=Arrays.copyOf(objetos,objetos.length-1);
        return extraido;
    }

    void ordenar(){
        Arrays.sort(objetos);
    }

    void ordenar(Comparator<T> c){
        Arrays.sort(objetos,c);
    }

    T get(int indice){
        return objetos[indice];
    }

}
