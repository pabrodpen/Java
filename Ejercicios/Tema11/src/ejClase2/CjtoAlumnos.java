package ejClase2;

import java.util.Arrays;

public class CjtoAlumnos {
	Alumno[]cjtoAlumnos=new Alumno[30];
	int cont=0;
	
	public void addAlumno(Alumno alumno) {
		
		/*
		 * Si hay espacio disponible, el método procede a insertar el nuevo alumno en el conjunto de manera ordenada por su número de DNI.
Utiliza un bucle while que comienza desde la última posición ocupada del conjunto (cont - 1) y se desplaza hacia atrás mientras el DNI del
 nuevo alumno (alumno.getDni()) es menor que el DNI del alumno en la posición actual del bucle (cjtoAlumnos[i].getDni()).
En cada iteración del bucle, mueve los elementos hacia adelante en el conjunto (cjtoAlumnos[i + 1] = cjtoAlumnos[i]) para hacer 
espacio para el nuevo alumno.
Cuando se encuentra la posición adecuada para el nuevo alumno, se inserta en el conjunto en esa posición (cjtoAlumnos[i + 1] = alumno)
 y se incrementa el contador cont.
		 * 
		 * */
		   if (cont > 29) {
	            System.out.println("Clase llena");
	        } else {
	            int i = cont - 1;
	            while (i >= 0 && alumno.getDni().compareTo(cjtoAlumnos[i].getDni()) < 0) {
	                cjtoAlumnos[i + 1] = cjtoAlumnos[i];
	                i--;
	            }
	            cjtoAlumnos[i + 1] = alumno;
	            cont++;
	        }
	}
	
	public void rmAlumno(int pos) {
		System.arraycopy(cjtoAlumnos, pos+1, cjtoAlumnos, pos, cont-pos);
        cjtoAlumnos[cont - 1] = null;
		cont--;
	}
	
	public int buscarAlumno(String dni ) {
		int pos=-1;
		for(int i=0;i<cont;i++) {
			if(cjtoAlumnos[i].getDni().equals(dni)) {
				pos=i;
				break;
			}
		}
		
		return pos;
	}
	
	
	public void listar() {
		for(int i=0;i<cont;i++) {
			System.out.println(cjtoAlumnos[i]);
		}
	}

}
