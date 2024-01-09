package recursividad;

public class Recurs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {2,3,5,7};
		
		
		maxYmin(arr, 0, arr[0], arr[0]);

	}
	
	static void maxYmin(int[]v,int cont,int max,int min) {
		 if(cont>5){
	            System.out.println("El mayor es:"+max);
	            System.out.println("El minimo es:"+min);
	        }else if(max<v[cont]){ 
	            max=v[cont];
	            maxYmin(v,cont+1,max,min);
	        }else if(min>v[cont]){
	            min=v[cont];
	            maxYmin(v,cont+1,max,min);
	        }else{
	        	 maxYmin(v,cont+1,max,min);
	        }
	}

}
