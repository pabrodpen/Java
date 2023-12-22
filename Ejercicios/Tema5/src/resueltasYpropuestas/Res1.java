package resueltasYpropuestas;

import java.util.concurrent.ArrayBlockingQueue;

public class Res1 {
	//metodos:binarysearch,arraycopy,copyof,sort y toString

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			int numero=(int)(Math.random()*100-1+1)+1;
			arr[i]=numero;
			System.out.println(arr[i]);
			suma+=numero;
		}
		

		System.out.println();
		System.out.println("Suma:"+suma);
	}

}
