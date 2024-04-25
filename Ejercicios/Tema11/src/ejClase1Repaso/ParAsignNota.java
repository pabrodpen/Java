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
public class ParAsignNota implements Serializable{
    Integer[]par=new Integer[2];

    public ParAsignNota(Integer[]par) {
        this.par=par;
    }

  

    public Integer[] getPar() {
        return par;
    }

    public void setPar(Integer[] par) {
        this.par = par;
    }
    
    
    
}
