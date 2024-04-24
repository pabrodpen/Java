package ejClase3;

import java.io.Serializable;
import java.util.Arrays;

public class Alumno implements Serializable{
    String dni,nombre,apellidos,direccion;
    Asignatura[]asignaturas;

    

    
   
    public Alumno(String dni, String nombre, String apellidos, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.asignaturas = new Asignatura[0];
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    
    public void addAsignYNota(String nombre,int n1,int n2,int n3){
        
        
        double media=(double) (n1+n2+n3)/3;
        
       Asignatura asignatura=new Asignatura(nombre, media);
       
       asignaturas=Arrays.copyOf(asignaturas, asignaturas.length+1);
       asignaturas[asignaturas.length-1]=asignatura;
        
        
    }
    
    public double mediaCurso() {
    	double sumaMedias=0;
    	for(int i=0;i<asignaturas.length;i++) {
    		sumaMedias+=asignaturas[i].media;
    	}
    	
    	return sumaMedias/3;
    }

    
}
