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
public class ParAlumNota implements Serializable, Comparable{
    String dniAlumno;
    Nota[]parCodNota;

    public ParAlumNota(String dniAlumno, Nota[] parCodNota) {
        this.dniAlumno = dniAlumno;
        this.parCodNota = parCodNota;
    }

    @Override
    public int compareTo(Object t) {
        ParAlumNota parAlumNota=(ParAlumNota) t;
        return  dniAlumno.compareTo(parAlumNota.dniAlumno);
    }

    @Override
    public String toString() {
        return "ParAlumNota{" + "dniAlumno=" + dniAlumno + ", parCodNota=" + parCodNota + '}';
    }

   
    
    
}
