package ejBoletin;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[20];
		for(int i=0;i<20;i++) {
			arr[i]=(int)(Math.random()*100-1+1)-1;
		}
		
		System.out.println("VECTOR ORIGINAL");
		for(int i=0;i<20;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		int indPares=0,indImpares=19;
		int[]aux=new int[20];
		for(int i=0;i<20;i++) {
			if(arr[i]%2==0) {
				aux[indPares]=arr[i];
				indPares++;
			}else {
				aux[indImpares]=arr[i];
				indImpares--;
			}
		}

		System.out.println("\nVECTOR MODIFICADO");
		for(int i=0;i<20;i++) {
			System.out.print(aux[i]+" ");
		}
	}

}
