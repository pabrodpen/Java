package figuras;

public class LineaDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		/*
		  
		   *
		  *
		 *
		*
		  
		  */
		
		for(int i=n;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*
		  
		*
		 *
		  *
		   *
		  
		  */
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
