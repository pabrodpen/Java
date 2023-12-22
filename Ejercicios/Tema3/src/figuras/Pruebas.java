package figuras;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=0;i<n/2+1;i++) {
			
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {
				if(k==0 || k==2*i ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=n/2-1;i>=0;i--) {//IMP EL -1
			
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++) {
				if(k==0 || k==2*i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			for(int j=0;j<n/2-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
