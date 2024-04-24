package ejClase3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		CjtoAlumnos cjtoAlumnos=new CjtoAlumnos();
		Alumno alumno;
		
		//leemos el txt

		try{
			BufferedReader in=new BufferedReader(new FileReader("src/ejClase3/fichEntrada.txt"));

			String linea;

			while((linea=in.readLine())!=null){
				String aux[]=linea.split(";");
				String dni=aux[0];
				String nombre=aux[1];
				String apellido=aux[2];
				String direccion=aux[3];
				String asignatura=aux[4];
				int nota1=Integer.parseInt(aux[5]);
				int nota2=Integer.parseInt(aux[6]);
				int nota3=Integer.parseInt(aux[7]);

				int posAlumno=cjtoAlumnos.buscarAlumno(dni);
                                
				if(posAlumno<0){
					alumno=new Alumno(dni,nombre,apellido,direccion);
					alumno.addAsignYNota(asignatura, nota1, nota2, nota3);
					cjtoAlumnos.addAlumno(alumno);
				}else {
					cjtoAlumnos.alumnos[posAlumno].addAsignYNota(asignatura, nota1, nota2, nota3);
				}

			}


		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//escribimos en el .dat
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/ejClase3/1dam20102011.dat"));
			
			out.writeObject(cjtoAlumnos);
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		//mostramos el contenido del .dat
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/ejClase3/1dam20102011.dat"));
			
			CjtoAlumnos cjtoBinario=(CjtoAlumnos) in.readObject();
			
			
			System.out.println("DNI DEL ALUMNO\tNOMBRE");
			for(int i=0;i<cjtoBinario.alumnos.length;i++) {
				alumno=cjtoBinario.alumnos[i];
				System.out.println(alumno.getDni()+"\t"+alumno.getNombre()+" "+alumno.getApellidos());
				System.out.println("Asignatura\tNota Media");
				for(int j=0;j<alumno.asignaturas.length;j++) {
					System.out.println(alumno.getAsignaturas()[j].nombre+"\t"+alumno.getAsignaturas()[j].media);
				}
				System.out.println("MEDIA CURSO:\t"+alumno.mediaCurso());
				System.out.println("--------------------------------------------");

			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
