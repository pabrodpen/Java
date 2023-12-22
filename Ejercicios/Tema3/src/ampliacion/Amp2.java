package ampliacion;

public class Amp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		double suma=0;
		int max=0,min=200;
		for(int i=0;i<50;i++) {
			n=(int)(Math.random()*(199-100+1)+100);
			System.out.print(n+" ");
			if(max<=n) {
				max=n;
			}
			if(min>n) {
				min=n;
			}
			suma+=n;
		}
		
		System.out.println();
		System.out.println("Maximo:"+max+", Minimo:"+min+", Media:"+suma/50);
	}

}
