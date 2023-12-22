package aplicacion;
import java.util.Arrays;
import java.util.Scanner;
public class App15 {
    public static void main(String[] args) {
        
    	int []primero=new int[5];
    	int []segundo=new int[5];
    	int []tercero=new int[5];
    	double mediaTrim1,mediaTrim2,mediaTrim3;
    	int suma=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("PRIMER TRIMESTRE");
    	for(int i=0;i<primero.length;i++) {
    		System.out.print("Nota trimestre 1:");
    		int nota=sc.nextInt();
    		primero[i]=nota;
    		suma+=nota;
    	}
    	mediaTrim1=suma/5.0;
    	suma=0;
    	System.out.println("SEGUNDO TRIMESTRE:");
    	for(int i=0;i<segundo.length;i++) {
    		System.out.print("Nota trimestre 2:");
    		int nota=sc.nextInt();
    		segundo[i]=nota;
    		suma+=nota;
    	}
    	mediaTrim2=suma/5.0;
    	suma=0;
    	System.out.println("TERCER TRIMESTRE");
    	for(int i=0;i<tercero.length;i++) {
    		System.out.print("Nota trimestre 3:");
    		int nota=sc.nextInt();
    		tercero[i]=nota;
    		suma+=nota;
    	}
    	mediaTrim3=suma/5.0;
    	suma=0;
    	
    	System.out.print("Dime la posicion del alumno:");
    	int alumno=sc.nextInt();
    	
    	double mediaAlumno=(primero[alumno]+segundo[alumno]+tercero[alumno])/3.0;
    	
    	System.out.println("Media primer trimestre:"+mediaTrim1);
    	System.out.println("Media segundo trimestre:"+mediaTrim2);
    	System.out.println("Media tercer trimestre:"+mediaTrim3);
    	System.out.println("Media alumno en la posicion "+alumno+":"+mediaAlumno);

    }
}
