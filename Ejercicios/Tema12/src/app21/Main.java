package app21;

import java.util.*;

public class Main {
    public static void main(String[]args){
        //con Set
        //como el orden natural de TreeSet es de mayor a menor, hacemos el reverseOrder
        Set<Integer> cjto=new TreeSet<>(Comparator.reverseOrder());

        int cont=0;
        while(cont<20){
            int n=(int)(Math.random()*(99-1+1)-1);
            if(cjto.add(n)){
                cont++;
            }
        }


        System.out.println(cjto);

        //con ArrayList

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            int n=(int)(Math.random()*(99-1+1)-1);
            int pos=Collections.binarySearch(list,n,Comparator.reverseOrder());
            if(pos<0){
                pos=-pos-1;
            }
            list.add(pos,n);
        }

        System.out.println(list);



    }
}
