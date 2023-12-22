package aplicacion;
import java.security.AccessControlContext;
import java.util.Scanner;
public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Hora:");
		int h=sc.nextInt();
		
		System.out.print("Minutos:");
		int m=sc.nextInt();
		
		System.out.print("Segundos:");
		int s=sc.nextInt();
		
		System.out.print("Cuantos segundos quieres que se adelante la hora?");
		int nSeg=sc.nextInt();
		
		System.out.println("HORA ACTUAL-> "+h+":"+m+":"+s);
		
		s+=nSeg;
		
		//ponemos el bucle para que, en el caso de que tenga que aumentar + de 1 min o + de 1 hora
		//de las vueltas necesarias para ajustar h,m,s y de la hora correcta
		while(s>59 || m>59 || h>23) {
			if(s>59) {
				m++;
				s=s-60;//ej: 62 segundos=m++ y 62-60=2 segundos
				if(m>59) {
					h++;
					m=m-60;
					if(h>23) {
						h=0;
					}
				}
			}
		}
		
		
		System.out.println("HORA ADELANTADA "+nSeg+" SEGUNDOS--> "+h+":"+m+":"+s);
		
	}

}
