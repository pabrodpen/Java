package resueltas;

public class Res14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {
			int multiplo=1;
			System.out.println("TABLA DEL "+i);
			while(multiplo<=10) {
				System.out.println(i+"x"+multiplo+"="+i*multiplo);
				multiplo++;
			}
			System.out.println();
		}
	}

}
