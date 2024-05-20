package app22;

import java.util.*;

public class Main {

    public static void main(String[]args){
        Set<String> nombres=new LinkedHashSet<>();
        Scanner scanner=new Scanner(System.in);


        System.out.print("Dime un nombre:");
        String nombre=scanner.nextLine();

        while(!nombre.equals("fin")){
            nombres.add(nombre);
            System.out.print("Dime un nombre:");
            nombre=scanner.nextLine();
        }

        System.out.println(nombres);
    }

}
