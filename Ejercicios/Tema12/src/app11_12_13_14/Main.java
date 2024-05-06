package app11_12_13_14;

import java.util.Comparator;

public class Main {
    public static void main(String[]args){
        Contenedor contenedor=new Contenedor();

        for(int i=0;i<30;i++){
            int n=(int)(Math.random()*(10-1+1)+1);
            contenedor.insertarAlFinal(n);
        }
        System.out.println("SIN ORDENAR");
        System.out.println(contenedor);

        contenedor.ordenar();
        System.out.println("ORDENADO DE MENOR A MAYOR");
        System.out.println(contenedor);

        System.out.println("ORDENADO DE MAYOR A MENOR");
        Comparator c=Comparator.naturalOrder();//IMP
        Comparator mayorAMenor=c.reversed();
        contenedor.ordenar(mayorAMenor);
        System.out.println(contenedor);
    }
}
