package ejClase3;

public class CjtoAlumnos{

    Alumno[]alumnos=new Alumno[0];

    public CjtoAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumno(Alumno alumno){
        alumnos=Arrays.copyOf(alumnos,alumnos.length+1);
        alumnos[alumnos.length-1]=alumno;
    }

    public int buscarAlumno(String dni){
        boolean encontrado=false;
        int pos=-1;
        for(int i=0;i<alumnos.length && !encontrado;i++){
            if(alumnos[i].getDni().equals(dni)){
                pos=i;
                encontrado=true;
            }
        }

        return pos;
    }
}