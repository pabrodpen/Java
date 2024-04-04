package app17;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/app17/archivo.dat"));

            System.out.print("Linea:");
            String linea = scanner.nextLine();

            while (!linea.isEmpty()) {
                out.writeObject(linea);
                System.out.print("Linea:");
                linea = scanner.nextLine();
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //leemos y mostramos

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/app17/archivo.dat"));

            try {
                while (true) {
                    System.out.println(inputStream.readObject());
                }
            } catch (EOFException e) {
                System.out.println("fin fichero");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
