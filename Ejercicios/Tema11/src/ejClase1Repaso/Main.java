/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase1Repaso;

import ejClase1.ParCodAsign;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Main implements  Serializable{
    public static void main(String[] args) {
        //crear 7 alumnos y 3 asignaturas
        Asignatura asignatura1=new Asignatura(1, "Programacion");
        Asignatura asignatura2=new Asignatura(2, "Sistemas");
        Asignatura asignatura3=new Asignatura(3, "Entornos");
        
       ParAsignNota parAsignNota1_1=new ParAsignNota(new Integer[]{1,4});
       ParAsignNota parAsignNota1_2=new ParAsignNota(new Integer[]{2,7});
       ParAsignNota parAsignNota1_3=new ParAsignNota(new Integer[]{3,3});
       
       ParAsignNota[]par1={parAsignNota1_1,parAsignNota1_2,parAsignNota1_3};
       
       ParAsignNota parAsignNota2_1=new ParAsignNota(new Integer[]{1,2});
       ParAsignNota parAsignNota2_2=new ParAsignNota(new Integer[]{2,8});
       ParAsignNota parAsignNota2_3=new ParAsignNota(new Integer[]{3,1});
       
       ParAsignNota[]par2={parAsignNota2_1,parAsignNota2_2,parAsignNota2_3};

       
       ParAsignNota parAsignNota3_1=new ParAsignNota(new Integer[]{1,5});
       ParAsignNota parAsignNota3_2=new ParAsignNota(new Integer[]{2,10});
       ParAsignNota parAsignNota3_3=new ParAsignNota(new Integer[]{3,9});
       
       ParAsignNota[]par3={parAsignNota3_1,parAsignNota3_2,parAsignNota3_3};

       
       ParAsignNota parAsignNota4_1=new ParAsignNota(new Integer[]{1,8});
       ParAsignNota parAsignNota4_2=new ParAsignNota(new Integer[]{2,4});
       ParAsignNota parAsignNota4_3=new ParAsignNota(new Integer[]{3,9});
       
       ParAsignNota[]par4={parAsignNota4_1,parAsignNota4_2,parAsignNota4_3};

       
       ParAsignNota parAsignNota5_1=new ParAsignNota(new Integer[]{1,6});
       ParAsignNota parAsignNota5_2=new ParAsignNota(new Integer[]{2,7});
       ParAsignNota parAsignNota5_3=new ParAsignNota(new Integer[]{3,6});
       
       ParAsignNota[]par5={parAsignNota5_1,parAsignNota5_2,parAsignNota5_3};

       
       Alumno alumno1=new Alumno("123", "Pablo",par1);
       Alumno alumno2=new Alumno("456", "Andres",par2);
       Alumno alumno3=new Alumno("789", "Carmen",par3);
       Alumno alumno4=new Alumno("012", "Olalla",par4);
       Alumno alumno5=new Alumno("345", "Fran",par5);
       
       
       
       Asignatura[]cjtoAsignaturas={asignatura1,asignatura2,asignatura3};
       Alumno[]cjtoAlumnos={alumno1,alumno2,alumno3,alumno4,alumno5};
       
        //escribir cada cosa en su fichero
        
        try {
            ObjectOutputStream outAlumnos=new ObjectOutputStream(new FileOutputStream("src/ejClase1Repaso/alumnos.dat"));
            ObjectOutputStream outAsign=new ObjectOutputStream(new FileOutputStream("src/ejClase1Repaso/asignaturas.dat"));

            
            outAlumnos.writeObject(cjtoAlumnos);
            outAsign.writeObject(cjtoAsignaturas);
            
            outAlumnos.close();
            outAsign.close();
            
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        //leer los  ficheros
        
        try {
            ObjectInputStream inAlumnos=new ObjectInputStream(new FileInputStream("src/ejClase1Repaso/alumnos.dat"));
            ObjectInputStream inAsign=new ObjectInputStream(new FileInputStream("src/ejClase1Repaso/asignaturas.dat"));

            
            Alumno[]alumnosBinario=(Alumno[]) inAlumnos.readObject();
            Asignatura[]asignaturasBinario=(Asignatura[]) inAsign.readObject();
            
            
            //vemos el numero de notas por asignatura
        for(int i=0;i<asignaturasBinario.length;i++){
            for(int j=0;j<alumnosBinario.length;j++){
                if(asignaturasBinario[i].getCod()==alumnosBinario[j].getParAsignNotas()[j].par[0]){
                        if(alumnosBinario[j].getParAsignNotas()[j].par[1]<5){
                            asignaturasBinario[i].numSusp++;
                        }else if(alumnosBinario[j].getParAsignNotas()[j].par[1]==5){
                            asignaturasBinario[i].numSufi++;
                        }else if(alumnosBinario[j].getParAsignNotas()[j].par[1]==6){
                            asignaturasBinario[i].numBien++;
                        }else if(alumnosBinario[j].getParAsignNotas()[j].par[1]==7 || alumnosBinario[j].getParAsignNotas()[j].par[1]==8){
                            asignaturasBinario[i].numNot++;
                        }else if(alumnosBinario[j].getParAsignNotas()[j].par[1]==9 || alumnosBinario[j].getParAsignNotas()[j].par[1]==10){
                            asignaturasBinario[i].numSobre++;
                        }
                }
            }
            
        }
        
        
        
                System.out.println("LISTADO");
                System.out.println("ASIGNSATURA\tSUS\tAPR\tBIEN\tNOT\tSOB");
                for(int i=0;i<asignaturasBinario.length;i++){
                    Asignatura asignatura=asignaturasBinario[i];
                    System.out.println(asignatura.nombre+"\t"+asignatura.numSusp+"\t"+asignatura.numSufi+"\t"+asignatura.numBien+"\t"+asignatura.numNot+"\t"+asignatura.numSobre);
                }

            
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
}
