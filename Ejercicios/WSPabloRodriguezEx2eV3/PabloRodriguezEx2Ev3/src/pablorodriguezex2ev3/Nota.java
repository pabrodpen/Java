/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pablorodriguezex2ev3;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Nota implements Serializable{
    int codAsign;
    String nota;

    public Nota(int codAsign, String nota) {
        this.codAsign = codAsign;
        this.nota = nota;
    }

    public int getCodAsign() {
        return codAsign;
    }

    public void setCodAsign(int codAsign) {
        this.codAsign = codAsign;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "codAsign=" + codAsign + ", nota=" + nota + '}';
    }

    
  
    
}
