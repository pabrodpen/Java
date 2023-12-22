package aplicacion;
import java.util.Scanner;
public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		//9999 999 99 9
		
		if((n/10000)>0 || n<0) {
			System.out.println("Tiene que ser un numero entre 0 y 9999");
		}else {
			int unidades=n%10;
			int decenas=(n/10)%10;
			int centenas=(n/100)%10;
			int unidMillar=(n/1000)%10;
			
			if(unidMillar!=0 ) {//4 cifras
				int numAlreves=unidades*1000+decenas*100+centenas*10+unidMillar;//es al reves(ud+decenas+centenas+UM)
				
				if(n==numAlreves) {
					System.out.println(n+" es capicua");
				}else {
					System.out.println(n+" no es capicua");
				}
			}else if(centenas!=0) {//3 cifras
				if(centenas==unidades) {
					System.out.println(n+" es capicua");
				}else {
					System.out.println(n+" no es capicua");
				}
			}else if(decenas!=0) {//2 cifras
				if(decenas==unidades) {
					System.out.println(n+" es capicua");
				}else {
					System.out.println(n+" no es capicua");
				}
			}else {//1 cifra(siempre es capicua)
				System.out.println(n+" es capicua");
			}
		}
		
	}

}
