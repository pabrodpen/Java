package app24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<>();

        l1.add(2);
        l1.add(5);
        l1.add(5);
        l1.add(7);


        List<Integer> l2=new ArrayList<>();

        l2.add(0);
        l2.add(2);
        l2.add(4);
        l2.add(9);
        l2.add(11);

        List<Integer> lFusion=fusion(l1,l2);

        System.out.println(lFusion);


    }

    public static List<Integer> fusion(List<Integer> a, List<Integer> b) {

        List<Integer> res=new ArrayList<>();

        int contA = 0, contB = 0;
        while (contA< a.size() && contB < b.size()) {
            if(a.get(contA)<= b.get(contB)){
                res.add(a.get(contA));
                contA++;
            }else{
                res.add(b.get(contB));
                contB++;
            }
        }

        //si hay algun elemento de alguna de las listas que no se ha insertado

        while(contA<a.size()){
            res.add(a.get(contA));
            contA++;
        }

        while(contB<b.size()){
            res.add(b.get(contB));
                contB++;
        }

        return res;
    }
}
