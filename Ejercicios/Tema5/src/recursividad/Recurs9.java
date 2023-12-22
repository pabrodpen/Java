package recursividad;

public class Recurs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {2,3,5,7};
		int resultados[]=maxYmin(arr, 0, 0, 0);
		int maximo=resultados[0];
		int minimo=resultados[1];
		
		System.out.println("Maximo:"+maximo);
		System.out.println("Minimo:"+minimo);

	}
	
	static int[] maxYmin(int[]v,int cont,int max,int min) {
		int[]res=new int[2];
		if(cont<v.length) {
			if(max<=v[cont]) {
				max=v[cont];
			}
			if(min>=v[cont]) {
				min=v[cont];
			}
			
			maxYmin(v, cont+1, max, min);
		}
		
		res[0]=max;
		res[1]=min;
		return res;
	}

}
