package ampliacion;
import java.util.Scanner;
public class Amp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int mayorImpar=0,cantidadNumeros=0,nPares=0;
		double sumaPares=0;
		
		System.out.print("Dime un numero:");//lectura adelantada
		int n=sc.nextInt();
		
		while(n>=0){
			
			
				if(n%2==0) {
					sumaPares+=n;
					nPares++;
				}else {
					if(n>=mayorImpar) {
						mayorImpar=n;
					}
				}
				cantidadNumeros++;
				
				System.out.print("Dime un numero:");//lectura al final paraque no
				//me cuente el numero negativo
				n=sc.nextInt();
			
			}
		
			
		sumaPares=sumaPares/nPares;
		
		System.out.println("Cantidad de numeros introducidos:"+cantidadNumeros);
		System.out.println("Media de los pares:"+sumaPares);
		System.out.println("El mayor numero impar:"+mayorImpar);
		
	}

}
