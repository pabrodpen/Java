package pack;
import java.util.Arrays;
import java.util.Scanner;
public class Ej4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);

        int nVeces = 1;

        for (int i = 0; i < palabras.length - 1; i++) {
            if (palabras[i].equals(palabras[i + 1])) {
                nVeces++;
            } else {
                System.out.println(palabras[i] + " aparece " + nVeces + " veces");
                nVeces = 1;
            }
        }

        System.out.println(palabras[palabras.length - 1] + " aparece " + nVeces + " veces");
    }
	

}
