package aplicacion;

import java.util.Arrays;

public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {2,5,7,4,5};
		int[]res=buscarTodos(arr, 5);
		System.out.println(Arrays.toString(res));
		
	}

	static int[]buscarTodos(int[]t,int clave){
		int[]indices=new int[0];
		for(int i=0;i<t.length;i++) {
			if(t[i]==clave) {
				indices=Arrays.copyOf(indices, indices.length+1);
				indices[indices.length-1]=i;
			}
		}
		return indices;
	}
}
