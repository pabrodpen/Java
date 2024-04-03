package app15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        // Metemos números en numeros.dat
        int[] numeros = {2, 4, 3, 21, 0};

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/app15/numeros.dat"));
            out.writeObject(numeros);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Leemos el archivo numeros.dat
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/app15/numeros.dat"));
            int[] numLeidos = (int[]) in.readObject();
            in.close();

            ObjectOutputStream outPares = new ObjectOutputStream(new FileOutputStream("src/app15/pares.dat"));
            ObjectOutputStream outImpares = new ObjectOutputStream(new FileOutputStream("src/app15/impares.dat"));

            for (int num : numLeidos) {
                if (num % 2 == 0) {
                    outPares.writeObject(num);
                } else {
                    outImpares.writeObject(num);
                }
            }

            outPares.close();
            outImpares.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Comprobamos si los números se han escrito correctamente en los archivos pares.dat e impares.dat
        try {
            ObjectInputStream inPares = new ObjectInputStream(new FileInputStream("src/app15/pares.dat"));

            System.out.println("NUMEROS PARES:");
            Object nPar;
            while (true) {
            	nPar = inPares.readObject();
            	System.out.println(nPar);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        // Comprobamos si los números se han escrito correctamente en los archivos pares.dat e impares.dat
        try {
            ObjectInputStream inImpares = new ObjectInputStream(new FileInputStream("src/app15/impares.dat"));

            System.out.println("NUMEROS IMPARES:");
            Object nImpar;
            while (true) {
            	nImpar = inImpares.readObject();
            	System.out.println(nImpar);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
