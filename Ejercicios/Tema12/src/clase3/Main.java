package clase3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[]args){

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/clase3/estudiantes.dat"));
        }catch(IOException e){

        }

        Set<Estudiante> cjtoEstudiantes=new TreeSet<>();

        Map<String,Estudiante> mapaEstudiantes=new TreeMap<>();
    }
}
