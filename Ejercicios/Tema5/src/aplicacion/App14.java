package aplicacion;
import java.util.Arrays;
import java.util.Scanner;
public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[]sueldos=new int[0];
		int max=0,min=Integer.MAX_VALUE,sumaSueldo=0,numSueldos=0;
		System.out.print("Sueldo:");
		int sueldo=sc.nextInt();
		while(sueldo>=0) {
			sueldos=Arrays.copyOf(sueldos, sueldos.length+1);
			sueldos[sueldos.length-1]=sueldo;
			sumaSueldo+=sueldo;
			if(sueldo>=max) {
				max=sueldo;
			}
			if(sueldo<=min) {
				min=sueldo;
			}
			numSueldos++;
			System.out.print("Sueldo");
			sueldo=sc.nextInt();
		}
		
		double mediaSueldo=(double)sumaSueldo/numSueldos;
		System.out.println("Maximo sueldo:"+max);
		System.out.println("Minimo sueldo:"+min);
		System.out.println("Suma de sueldos:"+sumaSueldo);
		System.out.println("Media de sueldos:"+mediaSueldo);
	}

}
