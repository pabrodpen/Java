package pack;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 1, 1, 7, 6, 7, 8, 9, 10};
		
		System.out.println("VECTOR:");
		listar(arr);
		System.out.println();
		
		rotar(arr, 1);
		
		System.out.println("VECTOR ROTADO");
		listar(arr);
		System.out.println();
		
		
		
		
		duplicados(arr);
		System.out.println("VECTOR SIN DUPLICADOS:");
		listar(arr);
		System.out.println();
		System.out.println("Numero de elementos eliminados:"+duplicados(arr));
		
		
		
		int[]sub= {6,8,9};
		System.out.println("Secuencia: ");
		listar(sub);
		System.out.println("\nLa secuencia esta en el vector:"+subsecuencia(arr, sub));
		
		
		ordenarParcial(arr, 5);
		System.out.println("VECTOR ORDENADO HASTA LA POSICION 5");
		listar(arr);
		
		
	}
	
	
		static void rotar(int[]v,int nPosiciones) {
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

		
	

	
	
	static boolean subsecuencia(int[] v, int[] secuencia) {
    boolean repetido = false;

    for (int i=0;i<= v.length-secuencia.length && !repetido; i++) {
        if (v[i]==secuencia[0]) {
            repetido=true;

            for (int j=1; j<secuencia.length && repetido; j++) {
                if (v[i + j]!=secuencia[j]) {
                    repetido=false;
                }
            }
        }
    }

   return repetido;
}
	
	static int duplicados(int[] v) {
    int numEliminados = 0;
    int[] aux = new int[v.length];
    int indAux = 0;

    for (int i = 0; i < v.length; i++) {
        boolean repetido = false;

        for (int j = 0; j < indAux && !repetido; j++) {
            if (v[i] == aux[j]) {
                repetido = true;
            }
        }

        if (!repetido) {
            aux[indAux++] = v[i];
        } else {
            numEliminados++;
        }
    }
    numEliminados++;

    for (int i = 0; i < indAux; i++) {
        v[i] = aux[i];
    }
    
    //por si hay algun 0
    for (int i = indAux; i < v.length; i++) {
        v[i] = 0;
    }

    return numEliminados;
}
	
	static void ordenarParcial(int[]v,int k) {
		for(int i=0;i<k;i++) {
			for(int j=0;j<k-i-1;j++) {
				if(v[i]>v[j]) {
					int aux=v[i];
					v[i]=v[j];
					v[j]=aux;
				}
			}
		}
	}
	
	static void listar(int[]v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
	}



}
