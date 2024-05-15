package res14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion=0;

        Set<Registro> cjtoRegistros=new HashSet<>();

        while(opcion!=4) {
            System.out.println("1.Nuevo registro");
            System.out.println("2.Listar registro");
            System.out.println("3.Mostrar estadistica");
            System.out.println("4.Salir");
            System.out.print("Dime una opcion:");
            opcion=sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Temperatura:");
                    double temperatura=sc.nextDouble();

                    String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                    if(cjtoRegistros.add(new Registro(temperatura))==false){
                        System.out.println("El registro ya existe");
                    }
                    break;

                case 2:
                    System.out.println("REGISTROS");
                    System.out.println(cjtoRegistros);
                    break;

                case 3:
                    double sumaTmp=0;
                    for(Registro registro:cjtoRegistros){
                        sumaTmp+=registro.getTemperatura();
                    }

                    System.out.println("Temperatura maxima:"+ Collections.max(cjtoRegistros));
                    System.out.println("Temperatura minima:"+Collections.min(cjtoRegistros));
                    double media=(double) sumaTmp/cjtoRegistros.size();
                    System.out.println("Promedio:"+media);
                    break;

                case 4:
                    try{
                        String fecha=DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res14/registros"+fecha+".dat"));

                        out.writeObject(cjtoRegistros);
                        out.close();
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
            }

        }
    }
}
