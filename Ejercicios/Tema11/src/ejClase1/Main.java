package ejClase1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asignatura asignatura1=new Asignatura(1, "Programacion");
		Asignatura asignatura2=new Asignatura(2, "Base de datos");
		Asignatura asignatura3=new Asignatura(3, "Leng Marcas");
		Asignatura asignatura4=new Asignatura(4, "Entornos");
		
		// Crear objetos Alumno con notas inventadas
        Alumno alumno1 = new Alumno("123456789A", "Juan Perez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 7}), new ParCodAsign(new Integer[]{2, 8}), new ParCodAsign(new Integer[]{3, 6}), new ParCodAsign(new Integer[]{4, 9})});

        Alumno alumno2 = new Alumno("987654321B", "Maria Garcia",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 6}), new ParCodAsign(new Integer[]{2, 5}), new ParCodAsign(new Integer[]{3, 8}), new ParCodAsign(new Integer[]{4, 7})});

        Alumno alumno3 = new Alumno("456789123C", "Luis Martinez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 8}), new ParCodAsign(new Integer[]{2, 6}), new ParCodAsign(new Integer[]{3, 7}), new ParCodAsign(new Integer[]{4, 8})});

        Alumno alumno4 = new Alumno("789123456D", "Ana Sanchez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 7}), new ParCodAsign(new Integer[]{2, 7}), new ParCodAsign(new Integer[]{3, 7}), new ParCodAsign(new Integer[]{4, 6})});

        Alumno alumno5 = new Alumno("321654987E", "Carlos Lopez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 5}), new ParCodAsign(new Integer[]{2, 6}), new ParCodAsign(new Integer[]{3, 5}), new ParCodAsign(new Integer[]{4, 6})});

        Alumno alumno6 = new Alumno("654987321F", "Laura Fernandez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 8}), new ParCodAsign(new Integer[]{2, 8}), new ParCodAsign(new Integer[]{3, 7}), new ParCodAsign(new Integer[]{4, 8})});

        Alumno alumno7 = new Alumno("987321654G", "David Gomez",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 9}), new ParCodAsign(new Integer[]{2, 7}), new ParCodAsign(new Integer[]{3, 8}), new ParCodAsign(new Integer[]{4, 9})});

        Alumno alumno8 = new Alumno("654321987H", "Sara Diaz",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 7}), new ParCodAsign(new Integer[]{2, 8}), new ParCodAsign(new Integer[]{3, 9}), new ParCodAsign(new Integer[]{4, 6})});

        Alumno alumno9 = new Alumno("987654321I", "Pablo Martin",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 8}), new ParCodAsign(new Integer[]{2, 9}), new ParCodAsign(new Integer[]{3, 8}), new ParCodAsign(new Integer[]{4, 7})});

        Alumno alumno10 = new Alumno("123789456J", "Elena Ruiz",
                new ParCodAsign[]{new ParCodAsign(new Integer[]{1, 6}), new ParCodAsign(new Integer[]{2, 7}), new ParCodAsign(new Integer[]{3, 7}), new ParCodAsign(new Integer[]{4, 5})});


		
        Alumno[]cjtoAlumnos= {alumno1,alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8,alumno9,alumno10};
        Asignatura[]cjtoAsignaturas= {asignatura1,asignatura2,asignatura3,asignatura4};
		//escribimos las asignaturas en los fichero binarios
		
		try {
			ObjectOutputStream outAsig=new ObjectOutputStream(new FileOutputStream("src/ejClase1/Asignat.dat"));
			ObjectOutputStream outAlum=new ObjectOutputStream(new FileOutputStream("src/ejClase1/Alumnos.dat"));
			
			
			outAlum.writeObject(cjtoAlumnos);
			outAsig.writeObject(cjtoAsignaturas);
			
			outAlum.close();
			outAsig.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		//AHORA LOS LEEMOS DE LOS ARCHIVOS
		
		Asignatura[]asignaturas;
		Alumno[]alumnos;
		
		try {
			ObjectInputStream inAsig=new ObjectInputStream(new FileInputStream("src/ejClase1/Asignat.dat"));
			ObjectInputStream inAlum=new ObjectInputStream(new FileInputStream("src/ejClase1/Alumnos.dat"));
			
			
			
			asignaturas=(Asignatura[]) inAsig.readObject();
			alumnos=(Alumno[]) inAlum.readObject();
			
			for(int i=0;i<asignaturas.length;i++) {
				for(int j=0;j<alumnos.length;j++) {
					for(int k=0;k<alumnos[j].notasPorAsign.length;k++) {
						//1ªVEMOS CADA ASIGNATURA
						//2ªVEMOS LOS ALUMNOS
						//3º A PRTIR DE LAS NOTAS DE LOS ALUMNOS SACAMOS EL NUMERO DE SUSPENSOS... DE CADA UNA
						//PARA ELLO VEMOS QUE EL CODIGO DE LA ASIGNATURA COUINCIDA CON EL PRIMER ELEMENTO DEL PAR
						//CODIGO Y ASIGNTURA DEL ALUMNO QUE SE ESTA RECORRIENDO
						if(asignaturas[i].getCodigo()==alumnos[j].notasPorAsign[k].codYnota[0]) {
							
							//AHORA VEMOS EL SEGUNDO ELEMENTO DEL PAR COD Y ASIGN DEL ALUMNO QUE SE ESTA
							//RECORRIENDO PARA VER QUE NOTA ES
							if(alumnos[j].notasPorAsign[k].codYnota[1]<5) {
								asignaturas[i].numSuspensos++;
							}else if(alumnos[j].notasPorAsign[k].codYnota[1]==5) {
								asignaturas[i].numSuficientes++;
							}else if(alumnos[j].notasPorAsign[k].codYnota[1]==6) {
								asignaturas[i].numBien++;
							}else if(alumnos[j].notasPorAsign[k].codYnota[1]==7 
									||alumnos[j].notasPorAsign[k].codYnota[1]==8 ) {
								asignaturas[i].numNotables++;
							}else if(alumnos[j].notasPorAsign[k].codYnota[1]==9 
									||alumnos[j].notasPorAsign[k].codYnota[1]==10 ) {
								asignaturas[i].numSobresalientes++;
							}
							
						}
					}
					
					
					
					
				}
			}
			
			
			
			System.out.println("LISTADO: RESUMEN DE CALIFICACIONES POR ASIGNATURAS");
			System.out.println("ASIGNATURA\tSUS\tSUFI\tBIEN\tNOT\tSOB\t");
			for(int i=0;i<asignaturas.length;i++) {
				System.out.println(asignaturas[i].getNombre()+"\t"+asignaturas[i].getNumSuspensos()+"\t"+asignaturas[i].getNumSuficientes()
						+"\t"+asignaturas[i].getNumBien()+"\t"+asignaturas[i].getNumNotables()+"\t"+asignaturas[i].getNumSobresalientes()
						);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		

		
		
		
		
		
	}

}
