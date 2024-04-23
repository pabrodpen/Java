package ejClase3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		CjtoAlumnos cjtoAlumnos=new CjtoAlumnos();
		Alumno alumno;
		static int contNotas=0,contAsign=0;

		try{
			BufferedReader in=new BufferedReader(new FileReader("src/fichEntrada.txt"));

			String linea;

			while((linea=in.readLine)!=null){
				String aux[]=linea.split(";");
				String dni=aux[0];
				String nombre=aux[1];
				String apellido=aux[2];
				String direccion=aux[3];
				String asignatura=aux[4];
				int nota1=Integer.parseInt(aux[5]);
				int nota2=Integer.parseInt(aux[6]);
				int nota3=Integer.parseInt(aux[7]);

				alumno=new Alumno(dni,nombre,apellido,asignatura,nota1,nota2,nota3);

                                
				if(cjtoAlumnos.buscarAlumno(alumno)<0){
					cjtoAlumnos.addAlumno(alumno);
				}

			}


		}catch (IOException e){
			System.out.println(e.getMessage());
		}




	}

}
