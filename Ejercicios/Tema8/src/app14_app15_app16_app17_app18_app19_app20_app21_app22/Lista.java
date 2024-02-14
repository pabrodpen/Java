package app14_app15_app16_app17_app18_app19_app20_app21_app22;

import java.util.Arrays;

public class Lista {
//esta en las resueltas
	 Integer[] lista;
		
		public Lista() {
			lista=new Integer[0];
		}
		
		public int numeroElementos() {
			return lista.length;
		}
		
		
		
		@Override
		public String toString() {
			return "Lista [lista=" + Arrays.toString(lista) + "]";
		}

		void insertarPrimeraPos(Integer elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, 0, lista, 1, lista.length-1);
			lista[0]=elemento;
		}
		void insertarUltimaPos(Integer elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1]=elemento;
		}
		void insertarPos(Integer elemento,int pos) {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, pos, lista, pos+1, lista.length-pos-1);//VER MUY IMP
			lista[pos]=elemento;
		}
		void insertarOtraLista(Lista otra) {//MUY IMP
			int tamaño=lista.length;
			lista=Arrays.copyOf(lista, lista.length+otra.lista.length);//IMP
			System.arraycopy(otra.lista, 0, lista, tamaño, otra.lista.length);
		}
		
		void obtenerElemento(int pos) {
			for(int i=0;i<lista.length;i++) {
				if(i==pos) {
					System.out.println(lista[i]);
				}
			}
		}
		
		
		void eliminarPos(int pos) {
			System.arraycopy(lista, pos+1, lista, pos, lista.length-pos-1);
			lista=Arrays.copyOf(lista, lista.length-1);
		}
		
		boolean busquedaElemento(int num) {
			boolean encontrado=false;
			for(int i=0;i<lista.length && encontrado==false;i++) {
				if(num==lista[i]) {
					System.out.println("Posicion "+i);
					encontrado=true;
				}else {
					System.out.println("-1");
				}
			}
			
			return encontrado;
		}
		
		boolean equals(Lista otra) {
			boolean distintos=false;
			if(lista.length==otra.lista.length) {
				for(int i=0;i<lista.length && !distintos;i++) {
					if(lista[i]!=otra.lista[i]){
						distintos=true;
					}
				}
				
				if(distintos) {
					return false;
				}else {
					return true;
				}
			}else {
				return false;
			}
		}
		
		//Resuelta 7_12
		
		static Lista concatena(Lista l1,Lista l2) {//IMP el return y el tipo de metodo(Lista)
			Lista resultado=new Lista();
			for(Integer e=0;e<l1.lista.length;e++) {//como recorremos enteros, Integer e a int i
				resultado.insertarUltimaPos(e);
			}
			
			for(Integer e=0;e<l2.lista.length;e++) {//como recorremos enteros, Integer e a int i
				resultado.insertarUltimaPos(e);
			}
			return resultado;
		}
		
		//tema 8 app 21
		
		 static boolean esNumero(Object ob) {
		        return ob instanceof Integer || ob instanceof Double || ob instanceof Float || ob instanceof Short
		                || ob instanceof Long || ob instanceof Byte;
		    }

		    static void sumar(Object a, Object b) {
		        if (esNumero(a) && esNumero(b)) {
		            double suma = ((Number) a).doubleValue() + ((Number) b).doubleValue();
		            System.out.println("Suma: " + suma);
		        } else if (a instanceof String && b instanceof String) {
		            System.out.println("Concatenación: " + a + b);
		        } else {
		            System.out.println("No sumables");
		        }
		    }
}