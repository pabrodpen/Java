/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase4;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class CjtoEmpleados implements Serializable{
    Empleado[]empleados=new Empleado[0];

    public CjtoEmpleados() {
    }
    
    public void addEmpleado(Empleado e){
        empleados=Arrays.copyOf(empleados,empleados.length+1);
        empleados[empleados.length-1]=e;
    }
    
    public int buscarEmpleado(String n,String a){
        boolean encontrado=false;
        int pos=-1;
        for(int i=0;i<empleados.length && encontrado==false;i++){
            if(n.equals(empleados[i].nombre) && a.equals(empleados[i].apellido)){
                pos=i;
                encontrado=true;
            }
        }
        return pos;
    }
}
