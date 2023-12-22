package aplicacion;
import java.util.Scanner;
public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime tu dni:");
		int dni=sc.nextInt();
		
		int resto=dni%23;
		
		switch (resto) {
		case 0: {
			System.out.println("La letra de tu dni es T");
			break;
		}
		
		case 1: {
			System.out.println("La letra de tu dni es R");	
			break;
		}
		
		case 2: {
			System.out.println("La letra de tu dni es W");	
			break;
		}
		
		case 3: {
			System.out.println("La letra de tu dni es A");
			break;
		}
		
		case 4: {
			System.out.println("La letra de tu dni es G");	
			break;
		}
		
		case 5: {
			System.out.println("La letra de tu dni es M");	
			break;
		}
		
		case 6: {
			System.out.println("La letra de tu dni es Y");	
			break;
		}
		
		case 7: {
			System.out.println("La letra de tu dni es F");	
			break;
		}
		
		case 8: {
			System.out.println("La letra de tu dni es P");	
			break;
		}
		
		case 9: {
			System.out.println("La letra de tu dni es D");	
			break;
		}
		
		case 10: {
			System.out.println("La letra de tu dni es X");	
			break;
		}
		
		case 11: {
			System.out.println("La letra de tu dni es B");	
			break;
		}
		
		case 12: {
			System.out.println("La letra de tu dni es N");	
			break;
		}
		
		case 13: {
			System.out.println("La letra de tu dni es J");	
			break;
		}
		
		case 14: {
			System.out.println("La letra de tu dni es Z");	
			break;
		}
		
		case 15: {
			System.out.println("La letra de tu dni es S");	
			break;
		}
		
		case 16: {
			System.out.println("La letra de tu dni es Q");	
			break;
		}
		
		case 17: {
			System.out.println("La letra de tu dni es V");	
			break;
		}
		
		case 18: {
			System.out.println("La letra de tu dni es H");	
			break;
		}
		
		case 19: {
			System.out.println("La letra de tu dni es L");	
			break;
		}
		
		case 20: {
			System.out.println("La letra de tu dni es C");	
			break;
		}
		
		case 21: {
			System.out.println("La letra de tu dni es K");	
			break;
		}
		
		case 22: {
			System.out.println("La letra de tu dni es E");	
			break;
		}
		
	}

	}
}
