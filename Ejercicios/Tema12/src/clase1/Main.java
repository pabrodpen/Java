package clase1;

import res16.ComparaAnios;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args){

        List<Persona> arrayPersonas=new ArrayList<>();




        Scanner scanner=new Scanner(System.in);
        int opcion=0;


        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/clase1/personas.dat"));
            arrayPersonas= (List<Persona>) in.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("CJTO DE PERSONAS LEIDO DEL ARCHIVO");
        System.out.println(arrayPersonas);
        System.out.println("NOMBRES UNICOS");
        Set<Persona> unicos=new TreeSet<>(new ComparaNombres());
        unicos.addAll(arrayPersonas);
        System.out.println(unicos);
        System.out.println("ORDENADAS POR LA EDAD EN ORDEN ASCENDENTE Y UNICO DE NOMBRES");


        Set<Persona> ordenadosPorEdad=new TreeSet<>(new ComparaEdad());
        ordenadosPorEdad.addAll(unicos);
        System.out.println(ordenadosPorEdad);



        do {
            System.out.println("1.Agregar persona");
            System.out.println("2.Eliminar persona");
            System.out.println("3.Actualizar edad");
            System.out.println("4.Mostrar personas");
            System.out.println("5.Edad promedio de las personas");
            System.out.println("6.Guardar y salir");
            System.out.print("Dime una opcion:");
            opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.print("Nombre:");
                    String nombre=scanner.next();
                    System.out.print("Edad:");
                    int edad=scanner.nextInt();

                    Persona persona=new Persona(nombre,edad);
                    if(!ordenadosPorEdad.add(persona)){
                        System.out.println("La persona ya existe");
                    }

                    break;
                case 2:
                    System.out.print("Nombre de la persona que quieres eliminar:");
                    nombre=scanner.next();
                    boolean encontrado=false;

                    for(Persona p:ordenadosPorEdad){
                        if(nombre.equals(p.nombre)){
                            ordenadosPorEdad.remove(p);
                            encontrado=true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("La persona no existe");
                    }
                    break;

                case 3:
                    System.out.print("Nombre de la persona que quieres actualizar:");
                    nombre=scanner.next();

                    encontrado=false;

                    for(Persona p:ordenadosPorEdad){
                        if(nombre.equals(p.nombre)){
                            ordenadosPorEdad.remove(p);
                            encontrado=true;

                            System.out.print("Nuevo nombre:");
                            nombre=scanner.next();
                            System.out.print("Nueva edad:");
                            edad=scanner.nextInt();

                            persona=new Persona(nombre,edad);

                            if(!ordenadosPorEdad.add(persona)){
                                System.out.println("La persona ya existe");
                            }

                        }
                    }

                    if(!encontrado){
                        System.out.println("La persona no existe");
                    }

                    break;

                case 4:
                    System.out.println("CJTO DE PERSONAS");
                    System.out.println(ordenadosPorEdad);
                    break;

                case 5:
                    int sumaEdad=0;
                    for(Persona p:ordenadosPorEdad){
                        sumaEdad+=p.edad;
                    }

                    double mediaEdad=(double) (sumaEdad/ordenadosPorEdad.size());
                    System.out.println("Promedio de edad:"+mediaEdad);
                    break;

                case 6:
                    List<Persona> arrayPersonasGuardar=new ArrayList<>(ordenadosPorEdad);
                    try{
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/clase1/personas.dat"));

                        out.writeObject(arrayPersonasGuardar);
                        out.close();
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion!=6);


    }
}
