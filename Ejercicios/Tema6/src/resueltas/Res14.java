package resueltas;

import java.util.Scanner;
import java.util.Arrays;
public class Res14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Palabra:");
        String palabra = sc.nextLine();

        char[] pal = palabra.toCharArray();

        int desordenar;
        do {
            desordenar = desordenarPalabra(pal);
            System.out.print("Quieres seguir desordenando la palabra? (1 para sí, -1 para no): ");
            desordenar = sc.nextInt();
        } while (desordenar != -1);

        String desordenada = String.valueOf(pal);

        System.out.println("PALABRA DESORDENADA:" + desordenada);

        boolean acertado = false;
        while (!acertado) {
            System.out.print("Intento: ");
            String intento = sc.nextLine();

            if (intento.compareTo(palabra) == 0) {
                acertado = true;
                System.out.println("HAS ACERTADO");
            } else {
                System.out.println("SIGUE INTENTÁNDOLO");
            }
        }
    }

    static int desordenarPalabra(char[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            int pos1 = i;
            int pos2;
            do {
                pos2 = (int) (Math.random() * palabra.length);
            } while (pos1 == pos2); // Asegura que pos1 y pos2 son diferentes
            intercambiarLetras(palabra, pos1, pos2);
        }
        return 0;
    }

    static void intercambiarLetras(char[] palabra, int pos1, int pos2) {
        char temp = palabra[pos1];
        palabra[pos1] = palabra[pos2];
        palabra[pos2] = temp;
    }
}
