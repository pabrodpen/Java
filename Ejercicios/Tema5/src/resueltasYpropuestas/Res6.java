package resueltasYpropuestas;

import java.util.Arrays;

public class Res6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {2,3,15,7,8};
		int[]loteria= {2,7,18,15,3};
		System.out.println("Numero de aciertos:"+aciertos(a, loteria));

	}
	
	static int aciertos(int[]apuesta,int[]combi) {
		Arrays.sort(apuesta);
		Arrays.sort(combi);
		int numAciertos=0;
		for(int i=0;i<apuesta.length;i++) {
			if(Arrays.binarySearch(combi, apuesta[i])!=-1) {
				numAciertos++;
			}
		}
		return numAciertos;
	}

}
