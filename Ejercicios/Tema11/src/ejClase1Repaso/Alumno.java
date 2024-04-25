/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase1Repaso;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Alumno implements Serializable{

    String dni,nombre;
    ParAsignNota[]parAsignNotas;

    public Alumno(String dni, String nombre, ParAsignNota[] parAsignNotas) {
        this.dni = dni;
        this.nombre = nombre;
        this.parAsignNotas = new ParAsignNota[3];
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ParAsignNota[] getParAsignNotas() {
        return parAsignNotas;
    }

    public void setParAsignNotas(ParAsignNota[] parAsignNotas) {
        this.parAsignNotas = parAsignNotas;
    }

  
    
    
}
