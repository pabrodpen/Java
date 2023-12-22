package figuras;

public class Cruz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;//impar
		
		
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n/2;j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n/2;j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		
	}

}
