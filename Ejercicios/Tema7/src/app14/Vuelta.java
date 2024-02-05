package app14;


public class Vuelta {

	double[]billetes= {500,200,100,50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01};
	int[]numBilletes=new int[billetes.length];
	
	public void darCambio(double importe) {
		
		int cont=0;
		while(importe>0 && cont<billetes.length) {//imp la condicion-->repasar
			int n=(int)(importe/billetes[cont]);
			if(n==0) {
				cont++;
			}else {
				numBilletes[cont]=n;
				importe=importe-n*billetes[cont];
				cont++;
			}
			
				
			
		}
	}
	
	public void mostrar() {
		System.out.println("IMPORTE:");
		for(int i=0;i<billetes.length;i++) {
			if(numBilletes[i]>0) {
				System.out.println(numBilletes[i]+" billetes de "+billetes[i]);
			}
		}
	}
}
