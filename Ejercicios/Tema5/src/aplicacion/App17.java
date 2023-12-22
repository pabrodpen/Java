package aplicacion;

import java.util.Arrays;

public class App17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {10,1,5,8,9,2};
		
		int sumas[]=suma(arr, 3);
		System.out.println(Arrays.toString(sumas));
		
	}
	static int[]suma(int[]t,int numElementos){
		int[]res=new int[0];
		for(int i=0;i<t.length-numElementos+1;i++) {
			int suma=0;
			for(int j=i;j<numElementos+i;j++) {
				suma+=t[j];
			}
			res=Arrays.copyOf(res, res.length+1);
			res[res.length-1]=suma;
		}
		return res;
	}

}
