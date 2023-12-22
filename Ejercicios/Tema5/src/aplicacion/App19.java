package aplicacion;
import java.util.Arrays;
import java.util.Scanner;
public class App19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dorsal de corredor:");
		int dorsal=sc.nextInt();
		
		int[]dorsales= new int[0];
		
		while(dorsal>=0) {
			dorsales=Arrays.copyOf(dorsales, dorsales.length+1);
			dorsales[dorsales.length-1]=dorsal;
			System.out.print("Dorsal de corredor:");
			dorsal=sc.nextInt();
		}
		System.out.println(Arrays.toString(dorsales));
		
		
		System.out.print("Dorsal del corredor menor de edad:");
		int menor=sc.nextInt();
		
		while(menor>=0) {
			int pos=-1;
			for(int i=0;i<dorsales.length;i++) {
				if(dorsales[i]==menor) {
					pos=i;
					
				}
			}
			
			if(pos>=0) {
				//INTERCAMBIO DE POS
				int aux=dorsales[pos-1];
				dorsales[pos-1]=dorsales[pos];
				dorsales[pos]=aux;
				
				System.out.println(Arrays.toString(dorsales));
			}else {
				System.out.println("Dorsal no encontrado");
			}
			System.out.print("Dorsal del corredor menor de edad:");
			menor=sc.nextInt();
			
		}
		
		
		System.out.print("Dorsal de Viruzz:");
		int dopado=sc.nextInt();
		
		while(dopado>=0) {
			int pos=-1;
			for(int i=0;i<dorsales.length;i++) {
				if(dorsales[i]==dopado) {
					pos=i;
					}
			}
			
			if(pos>=0) {
				
				//ELIMINACION EN UNA POS
				System.arraycopy(dorsales, pos+1, dorsales, pos, dorsales.length-pos-1);
				dorsales=Arrays.copyOf(dorsales, dorsales.length-1);
				
				System.out.println(Arrays.toString(dorsales));
			}else {
				System.out.println("Dorsal no encontrado");
			}
			
			
			System.out.print("Dorsal de Viruzz:");
			dopado=sc.nextInt();
		}
		
		System.out.print("Dorsal del moroso:");
		int moroso=sc.nextInt();
		
		while(moroso>=0) {
			int pos=-1;
			for(int i=0;i<dorsales.length;i++) {
				if(dorsales[i]==moroso) {
					pos=i;
					}
				}
			
			
			if(pos>=0) {
				
				//AL ULTIMO LUGAR
				dorsales=Arrays.copyOf(dorsales, dorsales.length+1);
				dorsales[dorsales.length-1]=moroso;
				System.arraycopy(dorsales, pos+1, dorsales, pos, dorsales.length-pos-1);
				dorsales=Arrays.copyOf(dorsales, dorsales.length-1);
				
				System.out.println(Arrays.toString(dorsales));

			}else {
				System.out.println("Dorsal no encontrado");
			}
			
			
			System.out.print("Dorsal del moroso:");
			moroso=sc.nextInt();
		}
		
		
	}
}


