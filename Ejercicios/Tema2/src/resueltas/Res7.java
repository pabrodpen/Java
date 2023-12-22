package resueltas;
import java.util.Scanner;
public class Res7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Dime un numero:");
			a=sc.nextInt();
		System.out.print("Dime otro:");
			b=sc.nextInt();
		System.out.print("Y otro:");
			c=sc.nextInt();
			
		if (a>b && a>c && b>c){
			System.out.print(a+","+b+","+c);
			}else if (a>b && a>c && b<c) {
				System.out.print(a+","+c+","+b);
				}else if (b>a && b>c && a>c){
					System.out.print(b+","+a+","+c);
					}else if(b>a && b>c && c>a){
						System.out.print(b+","+c+","+a);
						}else if(c>a && c>b && a>b){
							System.out.print(c+","+b+","+a);
		}
	}

}
