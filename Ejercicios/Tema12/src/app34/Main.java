package app34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[]args){

        Map<LocalDate, Set<Registro>> cjtoRegistros=new TreeMap<>();

        Scanner scanner=new Scanner(System.in);
        int opcion=0;



        do{
            System.out.println("1.Guardar registro");
            System.out.println("2.Listar todos los registros existentes");
            System.out.println("3.Listar registros de un dia");
            System.out.println("4.Guardar y salir");
            System.out.print("Dime una opcion:");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Fecha(dd-MM-yyyy):");
                    String fecha=scanner.next();
                    System.out.print("Hora(HH:mm:ss):");
                    String hora=scanner.next();
                    System.out.print("Temperatura:");
                    double temp=scanner.nextDouble();

                    Registro registro=new Registro(hora,temp);

                    Iterator<Map.Entry<LocalDate,Set<Registro>>> iterator=cjtoRegistros.entrySet().iterator();

                    boolean encontrado=false;
                    //recorremos el mapam para encontrar esa key y meter el registro
                    while(iterator.hasNext() && !encontrado){
                        Map.Entry<LocalDate,Set<Registro>> elemento=iterator.next();
                        if(fecha.equals(elemento.getKey().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))){
                            if(elemento.getValue().contains(registro)){
                                System.out.println("Ese registro ya existe");
                            }else{
                                elemento.getValue().add(registro);
                                encontrado=true;
                            }

                        }
                    }


                    //si la fecha non esta, la creamos para crear el registro
                    if(!encontrado){
                        Set<Registro> cjto=new TreeSet<>();
                        cjto.add(registro);
                        LocalDate f=LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        cjtoRegistros.put(f,cjto);
                    }
                   break;

                case 2:
                    System.out.println("REGISTROS EXISTENTES SEGUN LA FECHA");
                    System.out.println(cjtoRegistros);
                    break;

                case 3:
                    System.out.print("Fecha en la que quieres buscar los registros(dd-MM-yyyy):");
                    fecha=scanner.next();

                    LocalDate f=LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    Iterator<Map.Entry<LocalDate,Set<Registro>>> iterator2=cjtoRegistros.entrySet().iterator();
                     encontrado=false;
                    while(iterator2.hasNext() && !encontrado){
                        Map.Entry<LocalDate,Set<Registro>> elemento=iterator2.next();

                        if(f.compareTo(elemento.getKey())>=0){
                            System.out.println("REGISTROS DE "+fecha);
                            System.out.println(elemento.getValue());
                            encontrado=true;
                        }
                    }

                    if(!encontrado){
                        System.out.println("No hay registros de "+fecha);
                    }
                    break;

                case 4:
                    Iterator<Map.Entry<LocalDate,Set<Registro>>> iterator3=cjtoRegistros.entrySet().iterator();
                    while(iterator3.hasNext()) {
                        Map.Entry<LocalDate, Set<Registro>> elemento = iterator3.next();
                        try{
                            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app34/registros"+elemento.getKey().getYear()+elemento.getKey().getMonthValue()+elemento.getKey().getDayOfMonth()));
                            out.writeObject(elemento.getValue());
                            out.close();
                        }catch (IOException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }
        }while(opcion!=4);


    }
}
