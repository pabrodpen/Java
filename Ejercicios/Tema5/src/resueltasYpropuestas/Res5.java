package resueltasYpropuestas;

import java.util.Arrays;

public class Res5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] resultado=rellenaPares(10, 57);
		System.out.println(Arrays.toString(resultado));

	}

	static int[]rellenaPares(int longitud,int fin){
		int[]v=new int[longitud];
		for(int i=0;i<v.length;i++) {
			int n=(int)(Math.random()*(fin-2+1)+2);
			if(n%2==0 && n>0) {
				v[i]=n;
			}else {
				i--;
			}
		}
		Arrays.sort(v);
		return v;
	}
}
