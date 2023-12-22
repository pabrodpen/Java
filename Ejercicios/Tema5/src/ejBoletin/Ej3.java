package ejBoletin;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=101,max=-1;
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*100-0+1)+0;
			arr[i]=n;
			if(max<=arr[i]) {
				max=arr[i];
			}
			if(min>=arr[i]) {
				min=arr[i];
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nMaximo:"+max);
		System.out.println("Minimo:"+min);
	}

}
