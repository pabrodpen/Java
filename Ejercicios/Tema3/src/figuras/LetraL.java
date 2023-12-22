package figuras;

public class LetraL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		
		for(int i=0;i<n-1;i++) {//uno menos xq contamos como linea la horizontal
			System.out.println("* ");
		}
		for(int i=0;i<n-1;i++) {//-1 para que sea simetrica respecto a la vertical
			System.out.print("* ");
		}
	}

}
