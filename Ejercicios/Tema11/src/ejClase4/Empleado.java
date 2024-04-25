package ejClase4;

import java.io.Serializable;
import java.util.Arrays;


public class Empleado implements Serializable{

	String nombre,apellido;
	int edad;
	String cargo;
        double sueldo;
	
	Proyecto[]proyectos;

	public Empleado(String nombre, String apellido, int edad,double sueldo, String cargo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
                this.sueldo=sueldo;
		this.cargo = cargo;
		this.proyectos = new Proyecto[0];
	}
	
        
        public void addProyecto(String p){
            
                Proyecto proyecto=new Proyecto(p);
                 proyectos=Arrays.copyOf(proyectos,proyectos.length+1);
                 proyectos[proyectos.length-1]=proyecto;
            }

    @Override
public String toString() {
    String proyectosString = "";
    for (int i = 0; i < proyectos.length; i++) {
        proyectosString += proyectos[i].getNombre();
        if (i < proyectos.length - 1) {
            proyectosString += ", ";
        }
    }
    return "Empleado{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", edad=" + edad +
            ", cargo='" + cargo + '\'' +
            ", sueldo=" + sueldo +
            ", proyectos=[" + proyectosString + "]" +
            '}' + System.lineSeparator();
}

            
           
        }

    


	
	
	

