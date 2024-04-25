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
public class Asignatura implements Serializable{
    int cod;
    String nombre;

    int numSusp=0,numSufi=0,numBien=0,numNot=0,numSobre=0;
    public Asignatura(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    
}
