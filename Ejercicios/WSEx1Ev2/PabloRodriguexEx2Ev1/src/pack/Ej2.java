package pack;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        
        for(int i=0;i<arr1.length;i++) {
        	arr1[i]=(int)(Math.random()*10);
        	arr2[i]=(int)(Math.random()*10);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] comb = combinacion(arr1, arr2, 0);

        System.out.println("RESULTADO");
        System.out.println(Arrays.toString(comb));
    }

    static int[] combinacion(int[] v1, int[] v2, int cont) {
        int[] res = new int[v1.length];
        if (cont >= v1.length) {
            return res;
        } else {
            if (cont%2 == 0) {
                res[cont]=v1[cont]+v2[cont];
            } else {
                res[cont]=v1[cont]-v2[cont];
            }
            int[] aux = combinacion(v1, v2, cont + 1);
            for (int i=cont+1;i<res.length;i++) {
                res[i]=aux[i];
            }
        }
        return res;
    }

}
