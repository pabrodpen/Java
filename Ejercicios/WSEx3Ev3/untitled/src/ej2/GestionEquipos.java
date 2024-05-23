package ej2;

import java.util.Map;
import java.util.TreeMap;

public class GestionEquipos {
    Map<String,Equipo> cjtoEquipos=new TreeMap<>();

    public void addEquipo(Equipo e){
        cjtoEquipos.put(e.nombre,e);
    }

    public Equipo buscarEquipo(String n){
        return cjtoEquipos.get(n);
    }

    @Override
    public String toString() {
        return "GestionEquipos{" +
                "cjtoEquipos=" + cjtoEquipos +
                '}';
    }
}
