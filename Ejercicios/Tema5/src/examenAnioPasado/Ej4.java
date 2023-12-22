package examenAnioPasado;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//rellenar,buscar,listar,desplazar
		
		int[]arr=new int[10];
		rellenar(arr);
		listado(arr);
		buscar(arr, 7);
		desplazar(arr, 3);
		listado(arr);
		
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
	
	static void buscar(int[]v,int n) {
		boolean encontrado=false;
		for(int i=0;i<v.length && !encontrado;i++) {
			if(v[i]==n) {
				encontrado=true;
			}
		}
		
		if(encontrado) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
	}
	
	
	static void desplazar(int[]v,int nPosiciones) {
		int aux[]=new int[v.length];
		//lo copio
		for(int i=v.length-1;i>=0;i--) {
			aux[i]=v[i];
		}
		
		
		for(int i=0;i<aux.length;i++) {
			if(i+nPosiciones<=aux.length-1) {
				v[i+nPosiciones]=aux[i];
			}else {
				v[(i+nPosiciones)%aux.length]=aux[i];
			}
		}
	}

}
