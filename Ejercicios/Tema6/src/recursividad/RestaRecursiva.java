package recursividad;

public class RestaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=7,n2=7;
		
		System.out.println(n1+"-"+n2+"="+resta(n1, n2));
	}

	static int resta(int num1,int num2) {
		int res;
		if(num1==0) {
			res=num2;
			return res;
		}else if(num2==0) {
			res=num1;
			return res;
		}else {
			return resta(num1, num2-1)-1;//restamos 1 para ir restando
			//pero a la vez con num2-1 provocamos que a la larga num2=0 y provoque un caso base->
			//devuelva res que hemos ido restando al mismo tiempo
		}
	}
}
