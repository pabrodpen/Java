package app14_app15_app16_app17_app18_app19_app20_app21_app22;

import java.util.Arrays;

public class Conjunto extends Lista {

    @Override
    public String toString() {
        return "Conjunto [lista=" + Arrays.toString(lista) + "]";
    }
    
    void insertarPrimero(Integer elemento) {
        if (!busquedaElemento(elemento)) {
            insertarPrimeraPos(elemento);
        }
    }

    void insertarUltimo(Integer elemento) {
        if (!busquedaElemento(elemento)) {
            insertarUltimaPos(elemento);
        }
    }

    void insertarPos(Integer elemento) {
        int pos = 4;
        if (!busquedaElemento(elemento)) {
            insertarPos(elemento, pos);
        }
    }

}
