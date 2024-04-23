package ejClase3;

public class Alumno {
    String dni,nombre,apellidos,direccion;
    String[]asignaturas;

   double[]mediasAsign;
    

    
   
    public Alumno(String dni, String nombre, String apellidos, String direccion, String[] asignaturas, double[]mediasAsign) {
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
    
    public void addAsignYNota(String asignatura,int n1,int n2,int n3){
        
        
        
    }

    
}
