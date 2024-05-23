package ej2;

import java.util.*;

public class Main {
    public static void main(String[]args){

        //crear un mapa con 2 equipos de 8 jugadores

        GestionEquipos cjtoEquipos=new GestionEquipos();

        Scanner scanner=new Scanner(System.in);

        Equipo equipo1=new Equipo("Sevilla");
        Equipo equipo2=new Equipo("Betis");

        //String nombre, LocalDate fechaIncorporacion, Posicion posicion

        Jugador j1_1=new Jugador("Pablo","12-12-2020",Posicion.BASE);
        Jugador j1_2=new Jugador("Fran","11-11-2020",Posicion.ALERO);
        Jugador j1_3=new Jugador("Olalla","12-12-2021",Posicion.ALERO_PIVOT);
        Jugador j1_4=new Jugador("Javier","11-11-2023",Posicion.BASE);
        Jugador j1_5=new Jugador("Dani","12-05-2021",Posicion.ESCOLTA);
        Jugador j1_6=new Jugador("Carmen","10-10-2020",Posicion.ALERO);
        Jugador j1_7=new Jugador("Antonio","11-11-2022",Posicion.BASE);
        Jugador j1_8=new Jugador("Eva","09-12-2023",Posicion.ALERO_PIVOT);



        Jugador j2_1=new Jugador("Pedro","12-08-2020",Posicion.ESCOLTA);
        Jugador j2_2=new Jugador("Rosa","21-12-2021",Posicion.ALERO);
        Jugador j2_3=new Jugador("Aurora","22-10-2023",Posicion.BASE);
        Jugador j2_4=new Jugador("Manu","11-11-2020",Posicion.ALERO_PIVOT);
        Jugador j2_5=new Jugador("Guille","12-12-2019",Posicion.ESCOLTA);
        Jugador j2_6=new Jugador("Felipe","01-01-2020",Posicion.BASE);
        Jugador j2_7=new Jugador("Ines","12-12-2018",Posicion.ESCOLTA);
        Jugador j2_8=new Jugador("Rafa","12-12-2020",Posicion.BASE);

        equipo1.addJugador(j1_1);
        equipo1.addJugador(j1_2);
        equipo1.addJugador(j1_3);
        equipo1.addJugador(j1_4);
        equipo1.addJugador(j1_5);
        equipo1.addJugador(j1_6);
        equipo1.addJugador(j1_7);
        equipo1.addJugador(j1_8);


        equipo2.addJugador(j2_1);
        equipo2.addJugador(j2_2);
        equipo2.addJugador(j2_3);
        equipo2.addJugador(j2_4);
        equipo2.addJugador(j2_5);
        equipo2.addJugador(j2_6);
        equipo2.addJugador(j2_7);
        equipo2.addJugador(j2_8);

        cjtoEquipos.addEquipo(equipo1);
        cjtoEquipos.addEquipo(equipo2);


        //elegir un equipo y jugador y cambiar su posicion

        System.out.print("Equipo:");
        String equipo=scanner.next();
        System.out.print("Dorsal del jugador:");
        int dorsal=scanner.nextInt();

        Equipo equipoBuscar=cjtoEquipos.buscarEquipo(equipo);
        Jugador jugadorBuscar=equipoBuscar.buscarJugador(dorsal);

        System.out.println(jugadorBuscar);
        System.out.println("Nueva posicion:");
        String nuevaPosicion=scanner.next();

        Posicion nuevaPos=Posicion.valueOf(nuevaPosicion);
        jugadorBuscar.setPosicion(nuevaPos);

        System.out.println("CAMBIO DE POSICION");
        System.out.println(jugadorBuscar);


        //listado completo ordenado alfabeticamente por nombre de equipo

        System.out.println("CONJUNTO DE EQUIPOS ORDENADO POR NOMBRE DE EQUIPO");
        System.out.println(cjtoEquipos.cjtoEquipos.toString());

        //listado de todos los jugadores que son base segun el nombre del jugador
        //dorsal,nombre,antiguedad,nombreEquipo

        System.out.println("JUGADORES QUE SON BASE ORDENADO POR NOMBRE DE JUGADOR");
        Iterator<Map.Entry<String,Equipo>> iteratorEquipo=cjtoEquipos.cjtoEquipos.entrySet().iterator();

        while(iteratorEquipo.hasNext()){
            Map.Entry<String,Equipo> equipoEntry=iteratorEquipo.next();
            Collections.sort(equipoEntry.getValue().jugadores, new ComparaNombres());
                for(Jugador jugador:equipoEntry.getValue().jugadores){
                    if(jugador.posicion.equals(Posicion.BASE)){
                        System.out.println("Dorsal="+jugador.dorsal+" ,Nombre="+jugador.nombre+" ,Antiguedad="+jugador.antiguedad()+" años, Equipo="+equipoEntry.getKey());
                    }
                }
        }




        //listado de todos los jugadores por antiguedad



        List<Jugador> ordAntiguedad=new ArrayList<>();


        Iterator<Map.Entry<String,Equipo>> iteratorEquipo2=cjtoEquipos.cjtoEquipos.entrySet().iterator();

        while(iteratorEquipo2.hasNext()){
            Map.Entry<String,Equipo> equipoEntry=iteratorEquipo2.next();
            ordAntiguedad.addAll(equipoEntry.getValue().jugadores);
        }
        Collections.sort(ordAntiguedad,new ComparaAntiguedad());
        System.out.println("JUGADORES ORDENADOS POR ANTIGUEDAD");
        System.out.println(ordAntiguedad);



    }
}
