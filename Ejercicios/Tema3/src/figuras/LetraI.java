package figuras;

public class LetraI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		
		for(int i=0;i<n/2+1;i++) {
				System.out.print("* ");
			}
		System.out.println();
		
		
		
		
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n/2;j++) {//para que ponga los espacios y deje la
				//linea horizontal en la mitad de la linea horizontal
				System.out.print(" ");
			}
			
			System.out.print("*");//haga que el numero de * asteriscos sea n-2(quitamos
			//las lineas horizontales)
			System.out.println();
		}
		
		
		
		
		
		for(int i=0;i<n/2+1;i++) {
			System.out.print("* ");
		}
		
	}

}
