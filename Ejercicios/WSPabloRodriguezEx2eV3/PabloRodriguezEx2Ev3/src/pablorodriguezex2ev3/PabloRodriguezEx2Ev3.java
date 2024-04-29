/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablorodriguezex2ev3;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class PabloRodriguezEx2Ev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Nota nota1_1=new Nota (1,"S");
        Nota nota1_2=new Nota (2,"N");
        Nota nota1_3=new Nota (3,"X");
        Nota nota1_4=new Nota (4,"N");
        Nota nota1_5=new Nota (5,"B");
        
        Nota nota2_1=new Nota (1,"C");
        Nota nota2_2=new Nota (2,"X");
        Nota nota2_3=new Nota (3,"S");
        Nota nota2_4=new Nota (4,"X");
        Nota nota2_5=new Nota (5,"N");
        
        
        Nota nota3_1=new Nota (1,"B");
        Nota nota3_2=new Nota (2,"N");
        Nota nota3_3=new Nota (3,"S");
        Nota nota3_4=new Nota (4,"X");
        Nota nota3_5=new Nota (5,"C");
        
        Nota nota4_1=new Nota (1,"S");
        Nota nota4_2=new Nota (2,"S");
        Nota nota4_3=new Nota (3,"N");
        Nota nota4_4=new Nota (4,"C");
        Nota nota4_5=new Nota (5,"C");
        
        
        Nota nota5_1=new Nota (1,"X");
        Nota nota5_2=new Nota (2,"X");
        Nota nota5_3=new Nota (3,"C");
        Nota nota5_4=new Nota (4,"B");
        Nota nota5_5=new Nota (5,"B");
        
        
        Nota[] notas1={nota1_1,nota1_2,nota1_3,nota1_4,nota1_5};
        Nota[] notas2={nota2_1,nota2_2,nota2_3,nota2_4,nota2_5};
        Nota[] notas3={nota3_1,nota3_2,nota3_3,nota3_4,nota3_5};
        Nota[] notas4={nota4_1,nota4_2,nota4_3,nota4_4,nota4_5};
        Nota[] notas5={nota5_1,nota5_2,nota5_3,nota5_4,nota5_5};
        
        
        
        
        Alumno alumno1=new Alumno("123", "Pablo", "Rodriguez", "jsjid", 123);
        Alumno alumno2=new Alumno("456", "Andres", "Ramos", "dfdfe", 456);
        Alumno alumno3=new Alumno("789", "Olalla", "Lopez", "wwee", 789);
        Alumno alumno4=new Alumno("012", "Carmen", "Rodriguez", "kiki", 012);
        Alumno alumno5=new Alumno("345", "Manuel", "Bernaldez", "vfvbfgf", 345);
        
        ParAlumNota par1=new ParAlumNota("123", notas1);
        ParAlumNota par2=new ParAlumNota("456", notas2);
        ParAlumNota par3=new ParAlumNota("789", notas3);
        ParAlumNota par4=new ParAlumNota("012", notas4);
        ParAlumNota par5=new ParAlumNota("345", notas5);
        
        //leemos el txt
        Asignatura asignatura;
        Asignatura[]cjtoAsign=new Asignatura[0];
                
        try {
            BufferedReader in=new BufferedReader(new FileReader("src/pablorodriguezex2ev3/asignatura.txt"));
            
            String linea;
            
            while((linea=in.readLine())!=null){
                String[]aux=linea.split(";");
                
                int codAsignatura=Integer.parseInt(aux[0]);
                String nombreAsign=aux[1];
                
                asignatura=new Asignatura(codAsignatura, nombreAsign);
                cjtoAsign=Arrays.copyOf(cjtoAsign,cjtoAsign.length+1);
                cjtoAsign[cjtoAsign.length-1]=asignatura;
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
       
        Alumno[]cjtoAlumnos={alumno1,alumno2,alumno3,alumno4,alumno5};
        ParAlumNota[]cjtoPares={par1,par2,par3,par4,par5};
        
        
        //ecribimos en los binarios
        
        try {
            ObjectOutputStream outAlumn=new ObjectOutputStream(new FileOutputStream("src/pablorodriguezex2ev3/alumnos.dat"));
            ObjectOutputStream outNotas=new ObjectOutputStream(new FileOutputStream("src/pablorodriguezex2ev3/notas.dat"));


            outAlumn.writeObject(cjtoAlumnos);
            
            Arrays.sort(cjtoPares);
            outNotas.writeObject(cjtoPares);
            
            outAlumn.close();
            outNotas.close();
            
            
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        
        
        //leemos en los binarios para listar y escribir en otro binario
        
        
        try {            
            ObjectInputStream inBinarioAlumnos=new ObjectInputStream(new FileInputStream("src/pablorodriguezex2ev3/alumnos.dat"));
            ObjectInputStream inBinarioNotas=new ObjectInputStream(new FileInputStream("src/pablorodriguezex2ev3/notas.dat"));

            
            Alumno[]cjtoAlumnosBinario=(Alumno[]) inBinarioAlumnos.readObject();
            ParAlumNota[]cjtoParesBinario=(ParAlumNota[]) inBinarioNotas.readObject();
            
            
                    
            ObjectOutputStream outBinario=new ObjectOutputStream(new FileOutputStream("src/pablorodriguezex2ev3/InicialNombAlumnoRdos.dat"));

            System.out.println("DNI\tNOMBRE\tASIGNATURA-NOTA\t");
            for(int i=0;i<cjtoAlumnosBinario.length;i++){
               Alumno alumno=cjtoAlumnosBinario[i];
               for(int j=0;j<cjtoParesBinario.length;j++){
                   ParAlumNota par=cjtoParesBinario[j];
                   if(alumno.dni.equals(par.dniAlumno)){
                      System.out.print(alumno.dni+"\t"+alumno.nombre+"\t");
                       for(int k=0;k<cjtoParesBinario[j].parCodNota.length;k++){
                           ParAlumNota parAlumNota= cjtoParesBinario[i];
                           //miramos el nombre de la asignatura por el codigo del par con la nota
                           for(int l=0;l<parAlumNota.parCodNota.length;l++){
                               Nota nota=parAlumNota.parCodNota[k];
                               if(cjtoAsign[l].cod==nota.codAsign){
                                   System.out.print(cjtoAsign[l].nombre+"-"+nota.nota+"\t");
                               }
                               
                           }
                            
                       }
                       System.out.println("");
                   }
               }
               
            }
            
            
            
            //ALUMNOS QUE HAN APROBADO TODO
            System.out.println("ALUMNOS QUE HAN APROBADO TODO");
            boolean suspenso=false;
            for(int i=0;i<cjtoAlumnosBinario.length;i++){
               Alumno alumno=cjtoAlumnosBinario[i];
               for(int j=0;j<cjtoParesBinario.length && !suspenso;j++){
                   ParAlumNota par=cjtoParesBinario[j];
                   if(alumno.dni.equals(par.dniAlumno)){
                      System.out.print(alumno.dni+"\t"+alumno.nombre+"\t");
                       for(int k=0;k<cjtoParesBinario[j].parCodNota.length && !suspenso;k++){
                           ParAlumNota parAlumNota= cjtoParesBinario[i];
                           //miramos el nombre de la asignatura por el codigo del par con la nota
                           for(int l=0;l<parAlumNota.parCodNota.length && !suspenso;l++){
                               Nota nota=parAlumNota.parCodNota[k];
                               if(nota.nota=="X"){
                                   suspenso=true;
                               }
                               
                           }
                            
                       }
                       System.out.println("");
                   }
               }
               if(!suspenso){
                   System.out.println(alumno.nombre);
               }
               
            }
            
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PabloRodriguezEx2Ev3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
