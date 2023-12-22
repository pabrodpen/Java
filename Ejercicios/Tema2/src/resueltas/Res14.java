package resueltas;
import java.util.Scanner;
public class Res14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//SUPONEMOS QUE LA FECHA INTRODUCIDA ES CORRECTA
		System.out.print("Dime un dia:");
		int d=sc.nextInt();
		
		System.out.print("Dime un mes:");
		int m=sc.nextInt();
		
		System.out.print("Dime un año:");
		int a=sc.nextInt();
		
		d++;
		
		switch (m) {
		case 1,3,5,7,8,10,12: {
			if(d>31) {
				m++;
				d=1;
				}
			break;
			}
			
		
		case 4,6,9,11:{
			if(d>30) {
				m++;
				d=1;
				}
			break;
			}
		case 2:{
			if(d>28) {
				m++;
				d=1;
				}
			break;
			}
		
		}
		
		if(m>12) {
			a++;
			m=1;
		}
		
		System.out.println("Fecha del dia siguiente: "+d+":"+m+":"+a);
		
	}

}
