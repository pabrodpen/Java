package app25;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opcion=0;
        Scanner sc = new Scanner(System.in);

        Map<String,Socio> club=new TreeMap<>();

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/app25/club.dat"));

            club= (Map<String, Socio>) in.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        do{
            System.out.println("MENU");
            System.out.println("1.Alta socio");
            System.out.println("2.Baja socio");
            System.out.println("3.Modificar socio");
            System.out.println("4.Listar socios por apodo");
            System.out.println("5.Listar socios por antiguedad");
            System.out.println("6.Listar socios con alta anterior a un año determinado");
            System.out.println("7.Salir");
            System.out.print("Dime una opcion:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Apodo:");
                    String apodo = sc.next();
                    System.out.print("Nombre del socio:");
                    String nombre = sc.next();
                    System.out.print("Fecha de alta(dd/MM/yyyy):");
                    String alta=sc.next();

                    Socio socio=new Socio(nombre,alta);

                    if(club.containsKey(apodo)){
                        System.out.println("El apodo ya existe");
                    }else{
                        club.put(apodo,socio);
                    }

                    break;

                case 2:
                    System.out.print("Apodo del socio que quieres eliminar:");
                    apodo= sc.next();
                    if(club.containsKey(apodo)){
                        club.remove(apodo);
                    }else{
                        System.out.println("El socio no existe en el sistema");
                    }
                    break;

                case 3:
                    System.out.print("Apodo del socio que quieres modificar:");
                    apodo= sc.next();
                    if(club.containsKey(apodo)){
                        club.remove(apodo);

                        System.out.print("Apodo del nuevo socio:");
                        apodo= sc.next();
                        System.out.print("Nombre del nuevo socio:");
                        nombre= sc.next();
                        System.out.print("Fecha de alta del nuevo socio:");
                        alta= sc.next();

                        socio=new Socio(nombre,alta);

                        if(club.containsKey(apodo)){
                            System.out.println("El apodo ya existe");
                        }else{
                            club.put(apodo,socio);
                        }

                    }else{
                        System.out.println("El socio no existe en el sistema");
                    }
                    break;

                case 4:
                    System.out.println("SOCIOS ORDENADOS POR APODO");
                    System.out.println(club);
                    break;
                case 5:
                    //para pasar a ordenar por antiguedad,el cual es un atributo de Socio,
                    //tenemos que hacer un Comparable y despues pasar a una List
                    //cuya ordenacion sea la antiguedad
                    System.out.println("SOCIOS ORDENADOS POR ANTIGUEDAD");
                    List<Socio> sociosPorAntiguedad=new ArrayList<>(club.values());
                    Collections.sort(sociosPorAntiguedad);
                    System.out.println(sociosPorAntiguedad);
                    break;

                case 6:
                    System.out.print("Fecha:");
                    int anio= sc.nextInt();


                    Iterator<Map.Entry<String, Socio>> iterator=club.entrySet().iterator();

                    while (iterator.hasNext()){
                        Map.Entry<String,Socio> elemento=iterator.next();
                        if(elemento.getValue().fechaAlta.getYear()<anio){
                            System.out.println(elemento.getKey()+", "+elemento.getValue().toString());
                        }
                    }
                    break;

                case 7:
                    try{
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app25/club.dat"));

                        out.writeObject(club);
                        out.close();
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }catch(DateTimeParseException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }while(opcion!=7);
    }
}
