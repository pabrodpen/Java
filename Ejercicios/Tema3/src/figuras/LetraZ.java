package figuras;

public class LetraZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		
		for(int i=0;i<n/2+1;i++) {//el numero de asteriscos horizontal siempre seraa
			//n/2+1, para que la diagonal simepre empiece al final de la horizontal
			//pero que haga esquina (si hago n/2 queda feo)
			System.out.print("* ");
		}
		System.out.println();
		//linea diagonal
		for(int i=n-2;i>0;i--) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//la misma linea horizontal de antes
		for(int i=0;i<n/2+1;i++) {
			System.out.print("* ");
		}
	}

}
