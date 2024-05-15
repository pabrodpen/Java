package res16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Academico> cjtoAcademicos = new HashMap<>();

        Academico a1 = new Academico("Pablo", 2019);
        Academico a2 = new Academico("Olalla", 2020);
        Academico a3 = new Academico("Carmen", 2015);
        Academico a4 = new Academico("Dani", 2022);
        Academico a5 = new Academico("Andres", 2023);

        nuevoAcademico(cjtoAcademicos,a1,'S');
        nuevoAcademico(cjtoAcademicos,a2,'r');
        nuevoAcademico(cjtoAcademicos,a3,'a');
        nuevoAcademico(cjtoAcademicos,a4,'U');
        nuevoAcademico(cjtoAcademicos,a5,'X');

        System.out.println("LISTADO SIN LETRA");
        //como se pueden repetir los academicos(nombre y fecha ingreso), usamos una list
        List<Academico> listaSinLetra=new ArrayList<>(cjtoAcademicos.values());
        System.out.println("por orden de nombre");

        Collections.sort(listaSinLetra);
        System.out.println(listaSinLetra);


        System.out.println("por año de ingreso");
        Collections.sort(listaSinLetra,new ComparaAnios());
        System.out.println(listaSinLetra);

        System.out.println("LISTADO CON LETRA");

        //usamos tambien una list
        List<Map.Entry<Character,Academico>> listaConLetra=new ArrayList<>(cjtoAcademicos.values());
        System.out.println("por orden de letra");
        System.out.println("por orden de nombre");
        System.out.println("por año de ingreso");


    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if(Character.isAlphabetic(letra)){
            if(academia.containsKey(letra)){
                System.out.println("El asiento ya esta ocupado");
                return false;
            }else{
                academia.put(letra,nuevo);
                return true;
            }
        }else{
            System.out.println("La clave no es una letra");
            return false;
        }
    }

}

