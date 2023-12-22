package ejClase;

public class Ej3Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear tablade 100 enteros y asignar valores aleatoriamente
		//calcular max,min y media y mostrar tabla
		
		int[]arr=new int[10];
		int max=0,min=11;
		double suma=0;
		int numerosPares=0;
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*(10-1+1)+1);
			suma+=arr[i];
			if(max<=arr[i]) {
				max=arr[i];
			}
			if(min>=arr[i]) {
				min=arr[i];
			}
		}
		suma=suma/10.0;
		
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Maximo:"+max);
		System.out.println("Minimo:"+min);
		System.out.println("Media:"+suma);
	}

}
