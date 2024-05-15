package res15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static  void main(String[]args) throws ClassNotFoundException {

        Map<String,Integer> productos=new HashMap<>();


        int opcion=0;

        Scanner scanner=new Scanner(System.in);

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res15/productos.dat"));

            productos= (Map<String, Integer>) in.readObject();
            in.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        do {
            System.out.println("MENU");
            System.out.println("1.Alta producto");
            System.out.println("2.Baja prodcuto");
            System.out.println("3.Actualizar unidades");
            System.out.println("4.Listar");
            System.out.println("5.Salir");
            System.out.print("Dime una opcion:");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Codigo del producto:");
                    String cod=scanner.next();
                    System.out.print("Numero de existencias:");
                    int numExistencias=scanner.nextInt();

                    productos.put(cod,numExistencias);
                    break;
                case 2:
                    System.out.print("Codigo del producto que quieres eliminar:");
                    cod=scanner.next();

                    if(productos.containsKey(cod)){
                        productos.remove(cod);
                        System.out.println("Eliminado correctamente");
                    }else{
                        System.out.println("El producto no existe");
                    }

                    break;
                case 3:
                    System.out.print("Codigo del producto que quieres modificar:");
                    cod=scanner.next();

                    if(productos.containsKey(cod)){
                        System.out.print("Existencias:");
                        numExistencias=scanner.nextInt();
                       productos.replace(cod,numExistencias);
                    }else{
                        System.out.println("El producto no existe");
                    }
                    break;
                case 4:
                    System.out.println("PRODUCTOS");
                    System.out.println(productos);
                    break;
                case 5:
                    try{
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res15/productos.dat"));

                        out.writeObject(productos);
                        out.close();
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }

            }

        }while(opcion!=5);

    }
}
