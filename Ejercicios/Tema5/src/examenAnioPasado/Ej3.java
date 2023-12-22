package examenAnioPasado;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] t = new int[10];
		rellenar(t);
		listado(t);
		reverse(t);
		listado(t);
		
	}

	static void rellenar(int []v) {
		for(int i=0;i<v.length;i++) {
			v[i]=(int)(Math.random()*33-5+1)+5;
		}
	}
	
	static void listado(int[]v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	
	static void reverse(int[]v) {
		int[]aux=new int[v.length];
		int indice=0;
		//lo copiamos igual
		for(int i=v.length-1;i>=0;i--) {
			aux[i]=v[i];
		}
		//le damos la vuelta
		for(int i=v.length-1;i>=0;i--) {
			v[indice]=aux[i];
			indice++;
		}
	}
}
