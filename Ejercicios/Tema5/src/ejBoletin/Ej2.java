package ejBoletin;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[20];
		int cuadrados[]=new int[20];
		int cubos[]=new int[20];
		
		for(int i=0;i<20;i++) {
			int aleatorio=(int)(Math.random()*100-0+1)-0;
			arr[i]=aleatorio;
			cuadrados[i]=(int) Math.pow(aleatorio, 2);
			cubos[i]=(int)Math.pow(aleatorio, 3);
			System.out.println(arr[i]+" "+cuadrados[i]+" "+cubos[i]);
		}
		
	}

}
