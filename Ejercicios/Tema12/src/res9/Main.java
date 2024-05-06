package res9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Integer> lista=new ArrayList();

        int n=0;
        while(n>=0){
            System.out.print("Numero:");
            n=scanner.nextInt();

            if(n>=0){
                lista.add(n);
            }
        }

        for(int i=0;i<lista.size();i++){
            if(lista.get(i)%2==0){
                System.out.println(i);
                lista.set(i,lista.get(i)*100);
            }
        }

        System.out.println("LISTA CON LOS PARES MULTIPLICADOS POR 100");
        System.out.println(lista);
    }
}
