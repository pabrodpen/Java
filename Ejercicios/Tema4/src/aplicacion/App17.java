package aplicacion;

import java.util.Scanner;

public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=0;
		do {
			System.out.println("Dime un numero:");
			n1=sc.nextInt();
			System.out.println("Dime otro:");
			n2=sc.nextInt();
		} while (n1<=0 || n2<=0);
		System.out.println(n1+" y "+n2+" son amigos:"+sonAmigos(n1, n2));
	}

	static boolean sonAmigos(int a,int b) {
		int sumaDivisoresA=sumaDivisores(a),sumaDivisoresB=sumaDivisores(b);
		
		if(sumaDivisoresA==b && sumaDivisoresB==a) {
			return true;
		}else {
			return false;
		}
	}
	static int sumaDivisores(int num) {
		int suma=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				suma+=i;
			}
		}
		return suma;
	}
}
