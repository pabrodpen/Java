package res12;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[]args){
        Set<Integer> conjunto1=new TreeSet<>();
        Set<Integer> conjunto2=new TreeSet<>();
        for(int i=0;i<10;i++){
            int n1=(int)(Math.random()*(7-1+1)+1);
            int n2=(int)(Math.random()*(7-1+1)+1);

            conjunto1.add(n1);
            conjunto2.add(n2);
            
        }
    }

    static <E> Set<E> union(Set<E> cjto1, Set<E> cjto2){
        Set<E> res=new TreeSet<>();
        res.addAll(cjto1);
        res.addAll(cjto2);

        return res;
    }
}
