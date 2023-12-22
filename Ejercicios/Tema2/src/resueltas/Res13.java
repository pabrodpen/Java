package resueltas;
import java.util.Scanner;
public class Res13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime la hora:");
		int horas=sc.nextInt();
		
		System.out.print("Dime los minutos:");
		int min=sc.nextInt();
		
		System.out.print("Dime los segundos:");
		int seg=sc.nextInt();
		
		seg++;
		if(seg>59) {
			min++;
			seg=0;
			if(min>59) {
				horas++;
				min=0;
				if(horas>23) {
					horas=0;
				}
			}
		}
		
		System.out.println("Hora adelantada 1 segundo: "+horas+":"+min+":"+seg);
	}

}
