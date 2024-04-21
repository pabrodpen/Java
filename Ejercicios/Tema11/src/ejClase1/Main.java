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
		
		Alumno alumno1=new Alumno("123", "Pablo", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Alumno alumno2=new Alumno("456", "Fran", new Integer[] {1,7},  new Integer[] {2,9},  new Integer[] {3,10},  new Integer[] {4,6},
				 new Integer[] {5,9});
		
		Alumno alumno3=new Alumno("789", "Dani", new Integer[] {1,4},  new Integer[] {2,1},  new Integer[] {3,5},  new Integer[] {4,3},
				 new Integer[] {5,5});
		
		Alumno alumno4=new Alumno("012", "Lucia", new Integer[] {1,8},  new Integer[] {2,6},  new Integer[] {3,7},  new Integer[] {4,7},
				 new Integer[] {5,10});
		
		Alumno alumno5=new Alumno("345", "Antonio", new Integer[] {1,1},  new Integer[] {2,5},  new Integer[] {3,10},  new Integer[] {4,5},
				 new Integer[] {5,7});
		
		Alumno alumno6=new Alumno("678", "Ale", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Alumno alumno7=new Alumno("901", "Carmen", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Alumno alumno8=new Alumno("234", "Hugo", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Alumno alumno9=new Alumno("567", "David", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Alumno alumno10=new Alumno("890", "Laura", new Integer[] {1,4},  new Integer[] {2,6},  new Integer[] {3,5},  new Integer[] {4,2},
				 new Integer[] {5,9});
		
		Asignatura[]cjtoAsignaturas= {asignatura1,asignatura2,asignatura3,asignatura4};
		
		Alumno[]cjAlumnos= {alumno1,alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8,alumno9,alumno10};
		
		//escribimos las asignaturas en los fichero binarios
		
		try {
			ObjectOutputStream outAsig=new ObjectOutputStream(new FileOutputStream("src/ejClase1/Asignat.dat"));
			ObjectOutputStream outAlum=new ObjectOutputStream(new FileOutputStream("src/ejClase1/Alumnos.dat"));
			
			
			outAsig.writeObject(cjtoAsignaturas);
			outAlum.writeObject(cjAlumnos);
			
			outAsig.close();
			outAlum.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		//AHORA LOS LEEMOS DE LOS ARCHIVOS
		
		Asignatura[]asignaturas=null;
		Alumno[]alumnos;
		
		try {
			ObjectInputStream inAsig=new ObjectInputStream(new FileInputStream("src/ejClase1/Asignat.dat"));
			ObjectInputStream inAlum=new ObjectInputStream(new FileInputStream("src/ejClase1/Alumnos.dat"));
			
			
			
			asignaturas=(Asignatura[]) inAsig.readObject();
			alumnos=(Alumno[]) inAlum.readObject();
			
			for(int i=0;i<asignaturas.length;i++) {
				for(int j=0;j<alumnos.length;j++) {
					
					
					if(asignaturas[i].getCodigo()==alumnos[j].getPar1()[0]) {
						
						if(alumnos[j].getPar1()[1]<5) {
							asignaturas[i].numSuspensos++;
						}else if(alumnos[j].getPar1()[1]==5) {
							asignaturas[i].numSuficientes++;
						}else if(alumnos[j].getPar1()[1]==6) {
							asignaturas[i].numBien++;
						}else if(alumnos[j].getPar1()[1]==7 ||alumnos[j].getPar1()[1]==8 ) {
							asignaturas[i].numNotables++;
						}else if(alumnos[j].getPar1()[1]==9 ||alumnos[j].getPar1()[1]==10 ) {
							asignaturas[i].numSobresalientes++;
						}
						
					}
					
					
					
					if(asignaturas[i].getCodigo()==alumnos[j].getPar2()[0]) {
						
						if(alumnos[j].getPar2()[1]<5) {
							asignaturas[i].numSuspensos++;
						}else if(alumnos[j].getPar2()[1]==5) {
							asignaturas[i].numSuficientes++;
						}else if(alumnos[j].getPar2()[1]==6) {
							asignaturas[i].numBien++;
						}else if(alumnos[j].getPar2()[1]==7 ||alumnos[j].getPar2()[1]==8 ) {
							asignaturas[i].numNotables++;
						}else if(alumnos[j].getPar2()[1]==9 ||alumnos[j].getPar2()[1]==10 ) {
							asignaturas[i].numSobresalientes++;
						}
						
					}




					if(asignaturas[i].getCodigo()==alumnos[j].getPar3()[0]) {
	
						if(alumnos[j].getPar3()[1]<5) {
							asignaturas[i].numSuspensos++;
						}else if(alumnos[j].getPar3()[1]==5) {
							asignaturas[i].numSuficientes++;
						}else if(alumnos[j].getPar3()[1]==6) {
							asignaturas[i].numBien++;
						}else if(alumnos[j].getPar3()[1]==7 ||alumnos[j].getPar3()[1]==8 ) {
							asignaturas[i].numNotables++;
						}else if(alumnos[j].getPar3()[1]==9 ||alumnos[j].getPar3()[1]==10 ) {
							asignaturas[i].numSobresalientes++;
						}
	
					}





					if(asignaturas[i].getCodigo()==alumnos[j].getPar4()[0]) {
	
						if(alumnos[j].getPar4()[1]<5) {
							asignaturas[i].numSuspensos++;
						}else if(alumnos[j].getPar4()[1]==5) {
							asignaturas[i].numSuficientes++;
						}else if(alumnos[j].getPar4()[1]==6) {
							asignaturas[i].numBien++;
						}else if(alumnos[j].getPar4()[1]==7 ||alumnos[j].getPar4()[1]==8 ) {
							asignaturas[i].numNotables++;
						}else if(alumnos[j].getPar4()[1]==9 ||alumnos[j].getPar4()[1]==10 ) {
							asignaturas[i].numSobresalientes++;
						}
	
					}







					if(asignaturas[i].getCodigo()==alumnos[j].getPar5()[0]) {
	
						if(alumnos[j].getPar5()[1]<5) {
							asignaturas[i].numSuspensos++;
						}else if(alumnos[j].getPar5()[1]==5) {
							asignaturas[i].numSuficientes++;
						}else if(alumnos[j].getPar5()[1]==6) {
							asignaturas[i].numBien++;
						}else if(alumnos[j].getPar5()[1]==7 ||alumnos[j].getPar5()[1]==8 ) {
							asignaturas[i].numNotables++;
						}else if(alumnos[j].getPar5()[1]==9 ||alumnos[j].getPar5()[1]==10 ) {
							asignaturas[i].numSobresalientes++;
						}
	
					}
					
					
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		System.out.println("LISTADO: RESUMEN DE CALIFICACIONES POR ASIGNATURAS");
		System.out.println("ASIGNATURA\tSUS\tSUFI\tBIEN\tNOT\tSOB\t");
		for(int i=0;i<asignaturas.length;i++) {
			System.out.println(asignaturas[i].getNombre()+"\t"+asignaturas[i].getNumSuspensos()+"\t"+asignaturas[i].getNumSuficientes()
					+"\t"+asignaturas[i].getNumBien()+"\t"+asignaturas[i].getNumNotables()+"\t"+asignaturas[i].getNumSobresalientes()
					);
		}
		
		
		
	}

}
