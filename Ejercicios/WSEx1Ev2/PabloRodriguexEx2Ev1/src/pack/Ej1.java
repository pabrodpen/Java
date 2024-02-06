package pack;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]v1= {1,5,3,8,2,7,4,3,5};
		
		
		rotacionDerecha(v1, 2);
		ordenarParcial(v1, 3);
		
		
	}
	
	public static void ordenarParcial(int[]v,int k) {
		int[]ord=new int[k];
		boolean flag=false;
		for(int i=0;i<v.length && !flag;i++) {
			if(i<k) {
				ord[i]=v[i];
			}else {
				flag=true;
			}
		}
		Arrays.sort(ord);
		System.out.println(Arrays.toString(v));
	}
	
	public static void rotacionDerecha(int[]v,int k) {
		System.arraycopy(v, k-1, v, k, k);
		System.arraycopy(v, 0, v, k, k);
		
		System.out.println(Arrays.toString(v));
	}
	

}
