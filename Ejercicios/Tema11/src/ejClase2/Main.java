package ejClase2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		Alumno alumno;
		CjtoAlumnos cjtoAlumnos=new CjtoAlumnos();
		
		do {
			System.out.println("1.AÑADIR NUEVO ALUMNO");
			System.out.println("2.MODIFICAR NOTAS ALUMNO");
			System.out.println("3.CALCULAR NOTA MEDIA FINAL");
			System.out.println("4.CONSULTAR NOTAS DE UN ALUMNO");
			System.out.println("5.MOSTRAR EL ALUMNO CON MAYOR Y MENOR CALIFICACION");
			System.out.println("6.LISTAR LOS NOMBRES DE LOS ALUMNOS Y LAS NOTAS MEDIAS ORDENADO POR NOMBRE");
			System.out.println("7.LISTAR LOS NOMBRES DE LOS ALUMNOS Y LAS NOTAS MEDIAS ORDENADO POR NOTA MEDIA");
			System.out.println("8.SALIR");
			System.out.print("Dime una opcion:");
			opcion=sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				System.out.print("DNI:");
				String dni=sc.next();
				System.out.print("Nombre:");
				String nombre=sc.nextLine();
				sc.nextLine();
				System.out.print("Apellidos:");
				String apellidos=sc.nextLine();
				System.out.print("Parcial 1:");
				int nota1=sc.nextInt();
				System.out.print("Parcial 2:");
				int nota2=sc.nextInt();
				System.out.print("Parcial 3:");
				int nota3=sc.nextInt();
				
				alumno=new Alumno(dni, nombre, apellidos,nota1,nota2,nota3);
				
				cjtoAlumnos.addAlumno(alumno);
				break;
				
			case 2:
				System.out.print("DNI del cliente:");
				dni=sc.next();
				
				int posAlumno=cjtoAlumnos.buscarAlumno(dni);
				
				
				if(posAlumno>=0) {
					cjtoAlumnos.rmAlumno(posAlumno);
					System.out.print("Nueva nota1:");
					nota1=sc.nextInt();
					System.out.print("Nueva nota2:");
					nota2=sc.nextInt();
					System.out.print("Nueva nota3:");
					nota3=sc.nextInt();
					
					cjtoAlumnos.cjtoAlumnos[posAlumno].setN1(nota1);
					cjtoAlumnos.cjtoAlumnos[posAlumno].setN2(nota2);
					cjtoAlumnos.cjtoAlumnos[posAlumno].setN3(nota3);
					break;
				}else {
					System.out.println("El alumno no existe");
				}
				
				break;
				
			case 3:
				double mediaFinal;
				double mediaAlumno=0;
				
				for(int i=0;i<cjtoAlumnos.cjtoAlumnos.length;i++) {
					mediaAlumno+=cjtoAlumnos.cjtoAlumnos[i].notaMedia();
				}
				
				mediaFinal=mediaAlumno/cjtoAlumnos.cjtoAlumnos.length;
				
				
				System.out.println("Media final:"+mediaFinal);
				break;
				
			case 4:
				System.out.print("DNI del alumno:");
				dni=sc.next();
				
				posAlumno=cjtoAlumnos.buscarAlumno(dni);
				alumno=cjtoAlumnos.cjtoAlumnos[posAlumno];
				
				System.out.println("Notas de "+alumno.getNombre()+" "+alumno.getApellidos());
				System.out.println("Parcial 1:"+alumno.getN1());
				System.out.println("Parcial 2:"+alumno.getN2());
				System.out.println("Parcial 3:"+alumno.getN3());
				break;
				
			case 5:
				Alumno alumMaxNot=null,alumMinNot=null;
				double max=-1,min=Integer.MAX_VALUE;
				
				for(int i=0;i<cjtoAlumnos.cjtoAlumnos.length;i++) {
					if(cjtoAlumnos.cjtoAlumnos[i].notaMedia()>max) {
						alumMaxNot=cjtoAlumnos.cjtoAlumnos[i];
					}
					if(cjtoAlumnos.cjtoAlumnos[i].notaMedia()<min) {
						alumMaxNot=cjtoAlumnos.cjtoAlumnos[i];
					}
				}
				
				
				System.out.println("Alumno con mayor calificacion:"+alumMaxNot.getNombre()+" "+alumMaxNot.getApellidos());
				System.out.println("Alumno con menor calificacion:"+alumMinNot.getNombre()+" "+alumMinNot.getApellidos());
				break;
				
			case 6:
				System.out.println("LISTADO POR NOMBRE");
				cjtoAlumnos.listarPorNombre();
				System.out.println();
				break;
			case 7:
				System.out.println("LISTADO POR NOTA MEDIA");
				cjtoAlumnos.listarPorNotaMedia();
				break;
				
			
			}
		} while (opcion!=8);
		
	
	}

}
