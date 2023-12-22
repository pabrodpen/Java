package examenAnioPasado;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//mezclar 2 vectore y poner los mutliplos de 3 izq y los demas derecha a la vez que se insertan
		int[] t1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] t2 = {3, 6, 9 ,12, 11, 13, 15, 16, 17, 18};
		
		int[]t3=mezclar(t1, t2);
		
		System.out.println("VECTOR ORDENADO");
		for(int i=0;i<t3.length;i++) {
			System.out.print(t3[i]+" ");
		}
		
	}
	
	static int[]mezclar(int[]v1,int[]v2){
		int[]resultado=new int[v1.length+v2.length];
		int indMultiplo=0,indNoMultiplo=resultado.length-1;
		
		for(int i=0;i<v1.length;i++) {
			if(v1[i]%3==0) {
				resultado[indMultiplo]=v1[i];
				indMultiplo++;
			}else {
				resultado[indNoMultiplo]=v1[i];
				indNoMultiplo--;
			}
		}
		
		
		for(int i=0;i<v2.length;i++) {
			if(v2[i]%3==0) {
				resultado[indMultiplo]=v2[i];
				indMultiplo++;
			}else {
				resultado[indNoMultiplo]=v2[i];
				indNoMultiplo--;
			}
		}
		
		return resultado;
	}

}
