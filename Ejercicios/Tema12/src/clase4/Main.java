package clase4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int opcion=0;

        Map<Integer,Estudiante> cjtoEstudiantes=new TreeMap<>();

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/clase4/estudiantes.dat"));
            cjtoEstudiantes= (Map<Integer, Estudiante>) in.readObject();
            in.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        do {
            System.out.println("1.Agregar estudiante");
            System.out.println("2.Buscar estudiante");
            System.out.println("3.Eliminar estudiante");
            System.out.println("4.Actualizar media de estudiante");
            System.out.println("5.Mostrar estudiantes por carrera");
            System.out.println("6.Mostrar estudiantes por media");
            System.out.println("7.Guardar y salir");
            System.out.print("Dime una opcion:");
            opcion=scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.print("Codigo:");
                    int cod=scanner.nextInt();

                    if(cjtoEstudiantes.containsKey(cod)){
                        System.out.print("El estudiante ya existe");
                    }else{
                        System.out.print("Nombre:");
                        String nombre=scanner.next();
                        System.out.print("Edad:");
                        int edad=scanner.nextInt();
                        System.out.print("Media:");
                        double media=scanner.nextDouble();
                        System.out.print("Carrera:");
                        String carrera=scanner.next();

                        Estudiante estudiante=new Estudiante(cod,nombre,edad,media,carrera);
                        cjtoEstudiantes.put(cod,estudiante);
                    }
                    break;

                case 2:
                    System.out.print("Codigo del estudiante que quieres buscar:");
                    cod=scanner.nextInt();

                    if(cjtoEstudiantes.containsKey(cod)){
                        System.out.println(cjtoEstudiantes.get(cod));
                    }else{
                        System.out.println("El estudiante no existe");
                    }
                    break;

                case 3:
                    System.out.print("Codigo del estudiante que quieres eliminar:");
                    cod=scanner.nextInt();

                    if(cjtoEstudiantes.containsKey(cod)){
                      cjtoEstudiantes.remove(cod);
                    }else{
                        System.out.println("El estudiante no existe");
                    }
                    break;

                case 4:
                    System.out.print("Codigo del estudiante que quieres modificar:");
                    cod=scanner.nextInt();

                    if(cjtoEstudiantes.containsKey(cod)){
                        System.out.print("Nueva media:");
                        double media=scanner.nextDouble();
                        Estudiante estudiante=cjtoEstudiantes.get(cod);
                        estudiante.setMedia(media);
                    }else{
                        System.out.println("El estudiante no existe");
                    }
                    break;

                case 5:
                    System.out.println("ESTUDIANTES POR CARRERA");
                    //usamos un list para ordenar
                    List<Estudiante> ordCarrera=new ArrayList<>(cjtoEstudiantes.values());
                    Collections.sort(ordCarrera, new ComparaCarreras());
                    System.out.println(ordCarrera);
                    break;

                case 6:
                    System.out.println("ESTUDIANTES POR MEDIA DE MENOR A MAYOR");
                    //usamos un list para ordenar
                    List<Estudiante> ordMediasCreciente=new ArrayList<>(cjtoEstudiantes.values());
                    List<Estudiante> ordMediasDecreciente=new ArrayList<>(cjtoEstudiantes.values());

                    Collections.sort(ordMediasCreciente, new ComparaMedias());
                    Collections.sort(ordMediasDecreciente, new ComparaMedias().reversed());

                    System.out.println(ordMediasCreciente);
                    System.out.println("ESTUDIANTES POR MEDIA DE MAYOR A MENOR");
                    System.out.println(ordMediasDecreciente);
                    break;

                case 7:
                    try{
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/clase4/estudiantes.dat"));
                        out.writeObject(cjtoEstudiantes);
                        out.close();
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    break;

            }

        }while(opcion!=7);
    }

}
