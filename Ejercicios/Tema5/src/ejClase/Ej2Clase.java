package ejClase;

public class Ej2Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inicializar tabla de 10 enteros y mostrar cuantos pares hay
		
		int[]arr=new int[10];
		int numerosPares=0;
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*(10-1+1)+1);
			if(arr[i]%2==0) {
				numerosPares++;
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Numero de pares:"+numerosPares);
	}

}
