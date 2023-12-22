package resueltas;
public class Res10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=2;
		int potencia=4;
		//VERSION RECURSIVA
		System.out.println(potenciaRecursiva(num, potencia));
		
	}
	static double potenciaRecursiva(double a,int n) {
		double resultado=0;
		if(n==0) {
			resultado=1;
		}else {
			resultado=a*potenciaRecursiva(a, n-1);
		}
		return resultado;
	}

}
