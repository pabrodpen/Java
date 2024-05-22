package clase3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args){

        Set<Estudiante> cjtoEstudiantes=new TreeSet<>();


        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/clase3/estudiantes.dat"));
            cjtoEstudiantes= (Set<Estudiante>) in.readObject();
            in.close();
        }catch(IOException | ClassNotFoundException e){

        }

        System.out.println(cjtoEstudiantes);
        //pasar del treeset al map

        Map<String,Estudiante> mapaEstudiantes=new TreeMap<>();

        for(Estudiante estudiante:cjtoEstudiantes){
            mapaEstudiantes.put(estudiante.nombre,estudiante);
        }

        //buscar un estudiante por nombre

        Scanner scanner=new Scanner(System.in);

        System.out.print("Nombre del estudiante a buscar:");
        String nombre=scanner.next();

        boolean encontrado=false;

        Iterator<Map.Entry<String,Estudiante>> iterator=mapaEstudiantes.entrySet().iterator();

        while(iterator.hasNext() && !encontrado){
            Map.Entry<String,Estudiante> elemento=iterator.next();
            if(nombre.compareTo(elemento.getKey())==0){
                System.out.println(elemento);
                encontrado=true;
            }
        }

        if(!encontrado){
            System.out.println("El estudiante no existe");
        }


        //agregar un estudiante, guardarlo en el treeset y map y actualizar el binario

        System.out.print("Nombre del estudiante a guardar:");
        nombre=scanner.next();
        System.out.print("Edad:");
        int edad=scanner.nextInt();
        System.out.print("Media:");
        double media=scanner.nextDouble();

        Estudiante estudiante=new Estudiante(nombre,edad,media);

        cjtoEstudiantes.add(estudiante);
        mapaEstudiantes.put(nombre,estudiante);

        System.out.println(cjtoEstudiantes);
        System.out.println(mapaEstudiantes);
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/clase3/estudiantes.dat"));
            out.writeObject(cjtoEstudiantes);
            out.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //eliminar estudiante por nombre y actualizar

        System.out.print("Nombre del estudiante que quieres eliminar:");
        nombre=scanner.next();

        Iterator<Map.Entry<String,Estudiante>> iterator2=mapaEstudiantes.entrySet().iterator();

        encontrado=false;

        while(iterator2.hasNext() && !encontrado){
            Map.Entry<String,Estudiante> elemento=iterator2.next();
            if(nombre.compareTo(elemento.getKey())==0){

                cjtoEstudiantes.remove(elemento.getValue());
                mapaEstudiantes.remove(elemento.getKey(),elemento.getValue());
                encontrado=true;
            }
        }

        System.out.println(cjtoEstudiantes);
        System.out.println(mapaEstudiantes);


        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/clase3/estudiantes.dat"));
            out.writeObject(cjtoEstudiantes);
            out.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
