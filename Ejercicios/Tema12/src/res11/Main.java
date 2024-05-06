package res11;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[]args){


        //para que no se repitan usamos un cjto, y para tenerlos ordenados por dni usamos
        //concretamente un TreeSet
        Set<Socio> cjtoSocios=new TreeSet<>();


        Scanner scanner=new Scanner(System.in);
        Socio socio;
        int opcion=0;

        //cargamos los datos de socios.dat

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res11/socios.dat"));

            cjtoSocios= (Set<Socio>) in.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        do{
            System.out.println("MENU");
            System.out.println("1.ALTA");
            System.out.println("2.BAJA");
            System.out.println("3.MODIFICACION");
            System.out.println("4.LISTADO POR DNI");
            System.out.println("5.LISTADO POR ANTIGUEDAD");
            System.out.println("6.SALIR Y GUARDAR");
            System.out.print("Dime una opcion:");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("DNI:");
                    String dni=scanner.next();
                    System.out.print("Nombre:");
                    String nombre=scanner.next();
                    System.out.print("Fecha de alta(dd-MM-yyyy):");
                    String fechaAlta=scanner.next();

                    socio=new Socio(dni,nombre,fechaAlta);
                    cjtoSocios.add(socio);
                    break;

                case 2:
                    System.out.print("DNI del socio que quieres eliminar:");
                    dni=scanner.next();
                    cjtoSocios.remove(new Socio(dni));
                    break;

                case 3:
                    //eliminamos y creamos otro socio con los nuevos datos
                    System.out.print("DNI del socio que quieres modificar:");
                    dni=scanner.next();

                    cjtoSocios.remove(new Socio(dni));

                    System.out.print("Nuevo dni:");
                    dni= scanner.next();
                    System.out.print("Nuevo nombre:");
                    nombre=scanner.next();
                    System.out.print("Nueva fecha:");
                    fechaAlta=scanner.next();

                    cjtoSocios.add(new Socio(dni,nombre,fechaAlta));
                    break;

                case 4:
                    System.out.println("SOCIOS");
                    System.out.println(cjtoSocios);
                    break;

                case 5:
                    Comparator<Socio> comparaAntiguedad=new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o1.antiguedad()-o2.antiguedad();
                        }
                    };

                    //creamos un nuevo Set con el nuevo orden
                    Set<Socio> ordenadoAntiguedad=new TreeSet<>(comparaAntiguedad);
                    ordenadoAntiguedad.addAll(cjtoSocios);

                    System.out.println("ORDENADOS POR ANTIGUEDAD");
                    System.out.println(ordenadoAntiguedad);
                    break;

                case 6:
                    try{
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res11/socios.dat"));

                        out.writeObject(cjtoSocios);
                        out.close();
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
            }
        }while(opcion!=6);
    }
}
