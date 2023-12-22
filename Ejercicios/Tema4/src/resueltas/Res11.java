package resueltas;

public class Res11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=21;
		int n2=14;
		
		System.out.println("Maximo comun divisor entre "+n1+" y "+n2+" es:"+maxComunDiv(n1, n2));
	

	}
	static int maxComunDiv(int a,int b) {
		int mcd=-1,max,min;
		if(a==0) {
			mcd=b;
		}else if(b==0) {
			mcd=a;
		}else if(a>=b) {
			if(a-b>b) {
				max=a-b;
				min=b;
			}else {
				min=a-b;
				max=b;
			}
			
			mcd=maxComunDiv(max, min);
			
		}else {
			if(a-b>b) {
				max=b-a;
				min=b;
			}else {
				min=b-a;
				max=b;
			}
			mcd=maxComunDiv(max, min);
		}
		
		return mcd;
	}
	

}
