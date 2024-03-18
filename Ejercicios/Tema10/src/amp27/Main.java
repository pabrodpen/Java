package amp27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int contCaracteres = 0, contLineas = 0, contPalabras = 0;
        boolean dentroDePalabra = false;

        try (BufferedReader in = new BufferedReader(new FileReader("src/amp27/carta.txt"))) {
            int c;
            while ((c = in.read()) != -1) {
                if (!Character.isWhitespace((char) c)) {
                    dentroDePalabra = true;
                    contCaracteres++;
                } else {
                    if (dentroDePalabra) {
                        contPalabras++;
                        dentroDePalabra = false;
                    }
                }
                if (c == '\n') {
                    contLineas++;
                }
            }

            // Aseguramos que la última palabra se cuente si no hay espacio después de ella
            if (dentroDePalabra) {
                contPalabras++;
            }

            System.out.println("Numero de caracteres: " + contCaracteres);
            System.out.println("Numero de lineas: " + contLineas);
            System.out.println("Numero de palabras: " + contPalabras);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
