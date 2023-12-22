package ejClase;

import java.util.Arrays;
import java.util.Scanner;

public class MenuConArrays {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion;
		int []arr=new int[0];
		boolean ordenado=false;
		
		do {
			menu();
			opcion=eligeOpcionGeneral();
			
			switch (opcion) {
			case 1:
				arr=menuIns(arr);
				break;
			case 2:
				arr=menuElim(arr);
				break;
			case 3:
				arr=mod(arr);
				break;
			case 4:
				listar(arr);
				break;
			case 5:
				ordenar(arr);
				break;
			case 6:
				menuBusc(arr,ordenado);
				break;
			}
			
			
		} while (opcion!=7);
		
	
	}
	


	
	private static int[] menuIns(int []v) {
		// TODO Auto-generated method stub
		submenuIns();
		int opcion=eligeOpcionIns();
		switch (opcion) {
		case 1:
			v=insPrincipio(v);
			break;
		case 2:
			v=insFinal(v);
			break;
		case 3:
			v=insPos(v);
			break;
		}
		
		return v;
		
		
	}
	
	
	private static int[] menuElim(int []v) {
		// TODO Auto-generated method stub
		submenuElim();		
		int opcion=eligeOpcionElim();
		switch (opcion) {
		case 1:
			v=rmPrincipio(v);
			break;
		case 2:
			v=rmFinal(v);
			break;
		case 3:
			v=rmPos(v);
			break;
		}
		
		return v;
		
	}
	
	
	private static void menuBusc(int []v,boolean ord) {
		// TODO Auto-generated method stub
		submenuBusc();
		int opcion=eligeOpcionIns();
		switch (opcion) {
		case 1:
			if(ord==false) {
				busqSec(v);
			}else {
				busqBin(v);
			}
			
			break;
		case 2:
			busqPos(v);
			break;
		}
		
	}
	
	

	static void menu() {
		System.out.println("MENU");
		System.out.println("1.Insertar");
		System.out.println("2.Eliminar");
		System.out.println("3.Modificar");
		System.out.println("4.Listar");
		System.out.println("5.Ordenar");
		System.out.println("6.Buscar");
		System.out.println("7.Salir");
	}
	
	static void submenuIns() {
		System.out.println("SUBMENU INSERTAR");
		System.out.println("1 Insertar al principio");
		System.out.println("2 Insertar por el final");
		System.out.println("3 Insertar en una posicion concreta");
		System.out.println("4.Salir del submenu");
	}
	
	static void submenuElim() {
		System.out.println("SUBMENU ELIMINAR");
		System.out.println("1 Elimnar al principio");
		System.out.println("2 Eliminar por el final");
		System.out.println("3 Eliminar en una posicion concreta");
		System.out.println("4.Salir del submenu");
	}
	
	static void submenuBusc() {
		System.out.println("SUBMENU BUSCAR");
		System.out.println("1 Buscar por valor");
		System.out.println("2 Buscar por posicion");
		System.out.println("3.Salir del submenu");
	}
	
	
	static int eligeOpcionGeneral() {
		int opc;
		do {
			System.out.print("Dime una opcion:");
			opc=sc.nextInt();
		} while (opc<=0 || opc>7);
		return opc;
	}
	
	static int eligeOpcionIns() {
		int opc;
		do {
			System.out.print("Dime una opcion:");
			opc=sc.nextInt();
		} while (opc<=0 || opc>4);
		return opc;
	}
	
	static int eligeOpcionElim() {
		int opc;
		do {
			System.out.print("Dime una opcion:");
			opc=sc.nextInt();
		} while (opc<=0 || opc>4);
		return opc;
	}
	
	
	static int eligeOpcionBus() {
		int opc;
		do {
			System.out.print("Dime una opcion:");
			opc=sc.nextInt();
		} while (opc<=0 || opc>3);
		return opc;
	}
	
	static int[] insPrincipio(int[]v) {
		System.out.print("Dime un elemento:");
		int elemento=sc.nextInt();
		v=Arrays.copyOf(v, v.length+1);
		System.arraycopy(v, 0, v, 1, v.length-1);
		v[0]=elemento;
		
		return v;
	}
	
	static int[] insFinal(int[]v) {
		
			System.out.print("Dime un elemento:");
			int elemento=sc.nextInt();
			v=Arrays.copyOf(v, v.length+1);
			v[v.length-1]=elemento;
		
			return v;

	}
	
	static int[] insPos(int[]v) {
	
			System.out.print("Dime un elemento:");
			int elemento=sc.nextInt();
			System.out.print("Posicion donde quieres insertarlo:");
			int pos=sc.nextInt();
	
			v=Arrays.copyOf(v, v.length+1);
			System.arraycopy(v, pos, v, pos+1, v.length-pos-1);
			v[pos]=elemento;
		
			return v;
	}

	static int[] rmPrincipio(int []v) {
		System.arraycopy(v, 1, v, 0, v.length-1);
		v=Arrays.copyOf(v, v.length-1);
		
		return v;

	}
	
	
	static int[] rmFinal(int []v) {
		v=Arrays.copyOf(v, v.length-1);
		return v;

	}
	
	static int[] rmPos(int []v) {
	
			
			System.out.print("Posicion donde quieres eliminar:");
			int pos=sc.nextInt();
			
			System.arraycopy(v, pos+1, v, pos, v.length-pos-1);
			v=Arrays.copyOf(v, v.length-1);
		
			return v;

	}
	
	static int[] mod(int []v) {
		System.out.print("Posicion:");
		int pos=sc.nextInt();
		if(pos>v.length-1 || pos<0) {
			System.out.println("Posicion no valida");
		}else {
			System.out.print("Nuevo elemento:");
			int elem=sc.nextInt();
			v[pos]=elem;
		}
		
		return v;

	}
	
	
	static void listar(int[]v) {
		System.out.println(Arrays.toString(v));
	}
	
	
	static void ordenar(int[]v) {
		 Arrays.sort(v);
       
	}
	
	
	static void busqPos(int[]v) {
		System.out.print("Dime la posicion que quieres buscar:");
		int pos=sc.nextInt();
		if(pos>v.length-1) {
			System.out.println("Posicion no valida");
		}else {
			System.out.println("El elemento de la posicion "+pos+" es "+v[pos]);
		}
	}
	
	
	static void busqSec(int[]v) {
		// VECTOR NO ORDENADO
		
		System.out.print("Elemento que quieres buscar:");
		int valor=sc.nextInt();

	    boolean encontrado = false;
	    for (int i = 0; i < v.length && !encontrado; i++) {
	        if (v[i] == valor) { 
	            encontrado = true;
	        }
	    }

	    if (encontrado) {
	        System.out.println("El elemento esta en la lista.");
	    } else {
	        System.out.println("El elemento no esta en la lista.");
	    }
	}
	
	
	static void busqBin(int[]v) {
		//VECTOR ORDENADO
		
		System.out.print("Elemento que quieres buscar:");
		int valor=sc.nextInt();
		int pos=Arrays.binarySearch(v, valor);
	    
	    if (pos>=0) {
	        System.out.println("El elemento esta en la lista.");
	    } else {
	        System.out.println("El elemento no esta en la lista.");
	    }
	}

}


