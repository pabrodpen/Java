package resueltas;
import java.util.Scanner;
public class Res9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		int n;
		
		System.out.print("Dime un numero:");
			n=sc.nextInt();
			
		if (n<0){
			System.out.print("El numero no vale");
		}else if(n<9){
			System.out.print("Tiene 1 cifra");
		}else if(n<99){
			System.out.print("Tiene 2 cifras");
		}else if(n<999){
			System.out.print("Tiene 3 cifras");
		}else if(n<9999){
			System.out.print("Tiene 4 cifras");
		}else if(n<99999){
			System.out.print("Tiene 5 cifras");
		}

	}
}
