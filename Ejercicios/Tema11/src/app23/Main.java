package app23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
    	
   //hacemos un array por cada fichero
        
        llenarArray("fich1");
        llenarArray("fich2");
        
        
        
    	
        Integer[] resultado = fusionarSinRepetir("src/app23/fich1.dat", "src/app23/fich2.dat");
        System.out.println("FICHEROS FUSIONADOS");
        System.out.println(Arrays.toString(resultado));
    }

    static Integer[] fusionarSinRepetir(String fichero1, String fichero2) {
        Integer[] listaFusionada = new Integer[0];
        Integer[] lista1 = null, lista2 = null;
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(fichero1));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(fichero2))) {
            lista1 = (Integer[]) in1.readObject();
            lista2 = (Integer[]) in2.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        int i = 0, j = 0;
        while (i < lista1.length && j < lista2.length) {
            if (lista1[i] < lista2[j]) {
                listaFusionada = Arrays.copyOf(listaFusionada, listaFusionada.length + 1);
                listaFusionada[listaFusionada.length - 1] = lista1[i];
                i++;
            } else if (lista1[i] > lista2[j]) {
                listaFusionada = Arrays.copyOf(listaFusionada, listaFusionada.length + 1);
                listaFusionada[listaFusionada.length - 1] = lista2[j];
                j++;
            } else {
                listaFusionada = Arrays.copyOf(listaFusionada, listaFusionada.length + 1);
                listaFusionada[listaFusionada.length - 1] = lista1[i];
                i++;
                j++;
            }
        }
        while (i < lista1.length) {
            listaFusionada = Arrays.copyOf(listaFusionada, listaFusionada.length + 1);
            listaFusionada[listaFusionada.length - 1] = lista1[i];
            i++;
        }
        while (j < lista2.length) {
            listaFusionada = Arrays.copyOf(listaFusionada, listaFusionada.length + 1);
            listaFusionada[listaFusionada.length - 1] = lista2[j];
            j++;
        }
        
        Arrays.sort(listaFusionada); // Ordenar la lista fusionada de menor a mayor
        return listaFusionada;
    }
    
    
    static void llenarArray(String f) {
        System.out.print("Longitud del array:");
        int l=scanner.nextInt();
        Integer[]lista=new Integer[l];
        for(int i=0;i<l;i++) {
            System.out.print("Numero:");
            Integer n=scanner.nextInt();
            
            lista[i]=n;
        }
        
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app23/"+f+".dat"));
            
            out.writeObject(lista);
            out.close();
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
