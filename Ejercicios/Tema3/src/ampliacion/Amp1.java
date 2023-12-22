package ampliacion;

public class Amp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double numeroAleatorio = Math.random() * (max - min + 1) + min;
		
		int dado1=0,dado2=-1,nTiradas=0;
		
		while (dado1!=dado2) {
			dado1=(int)(Math.random()*(6-1+1)+1);
			dado2=(int)(Math.random()*(6-1+1)+1);
			System.out.println("Otra tirada");
			nTiradas++;
		}

		System.out.println("Los 2 dados dan "+dado1);
		System.out.println("Numero de tiradas:"+nTiradas);
		
		
	}

}
