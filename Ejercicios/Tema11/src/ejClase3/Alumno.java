package ejClase3;

import java.io.Serializable;
import java.util.Arrays;

public class Alumno implements Serializable{
    String dni,nombre,apellidos,direccion;
    String[]asignaturas;

   double[]mediasAsign;
    

    
   
    public Alumno(String dni, String nombre, String apellidos, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.asignaturas = new String[0];
        this.mediasAsign = new double[0];
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

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public double[] getMediasAsign() {
		return mediasAsign;
	}

	public void setMediasAsign(double[] mediasAsign) {
		this.mediasAsign = mediasAsign;
	}

	public void addAsignYNota(String asignatura,int n1,int n2,int n3){
        asignaturas=Arrays.copyOf(asignaturas, asignaturas.length+1);
        asignaturas[asignaturas.length-1]=asignatura;
        
        double media=(double) (n1+n2+n3)/3;
        
        mediasAsign=Arrays.copyOf(mediasAsign, mediasAsign.length+1);
        mediasAsign[mediasAsign.length-1]=media;
        
        
    }
    
    public double mediaCurso() {
    	double sumaMedias=0;
    	for(int i=0;i<mediasAsign.length;i++) {
    		sumaMedias+=mediasAsign[i];
    	}
    	
    	return sumaMedias/3;
    }

    
}
