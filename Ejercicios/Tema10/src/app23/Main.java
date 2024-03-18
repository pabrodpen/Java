package app23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/app23/deportistas.txt"));
            BufferedWriter out1 = new BufferedWriter(new FileWriter("src/app23/edades.txt"));
            BufferedWriter out2 = new BufferedWriter(new FileWriter("src/app23/pesos.txt"));
            BufferedWriter out3 = new BufferedWriter(new FileWriter("src/app23/estaturas.txt"));

            String linea;
            in.readLine(); // Leemos la primera línea (suponemos que es una cabecera)
            while ((linea = in.readLine()) != null) {
                String[] aux = linea.split("\t+");

                String nombre = aux[0];
                int edad = Integer.parseInt(aux[1]);
                double peso = Double.parseDouble(aux[2]);
                double estatura = Double.parseDouble(aux[3]);

                out1.write(nombre + "\t" + aux[1]);
                out1.newLine();
                out2.write(nombre + "\t" + aux[2]);
                out2.newLine();
                out3.write(nombre + "\t" + aux[3]);
                out3.newLine();
            }

            // Cerramos los archivos después de escribir todos los datos
            out1.close();
            out2.close();
            out3.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
