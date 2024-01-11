package recursividad;

public class SumaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=-5,n2=7;
		
		System.out.println(n1+"+"+n2+"="+suma(n1, n2));
	}
	
	static int suma(int num1,int num2) {
		int res;
		if(num1==0) {
			res=num2;
			return res;
		}else if(num2==0) {
			res=num1;
			return res;
		}else {
			return suma(num1+1, num2-1);//sumamos 1 y restamos 1 para mantener el resultado
			//pero a la vez provocamos que a la larga num2=0 y provoque un caso base->
			//devuelva num1, que le hemos ido sumando al mismo tiempo
		}
	}

}
