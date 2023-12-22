package ejClase;
import java.util.Scanner;
public class Menu {

	static Scanner sc=new Scanner(System.in);//IMP EL STATIC

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion,nElementos=0;
		int []arr=new int[10];
		boolean ordenado=false;
		
		do {
			menu();
			opcion=eligeOpcionGeneral();
			
			switch (opcion) {
			case 1:
				nElementos=menuIns(arr,nElementos);
				break;
			case 2:
				nElementos=menuElim(arr, nElementos);
				break;
			case 3:
				mod(arr, nElementos);
				break;
			case 4:
				listar(arr, nElementos);
				break;
			case 5:
				burb(arr,nElementos);
				break;
			case 6:
				menuBusc(arr, nElementos,ordenado);
				break;
			}
			
			
		} while (opcion!=7);
		
		
		

	}

	private static int menuIns(int []v,int nElementos) {
		// TODO Auto-generated method stub
		submenuIns();
		int opcion=eligeOpcionIns();
		switch (opcion) {
		case 1:
			nElementos=insPrincipio(v, nElementos);
			break;
		case 2:
			nElementos=insFinal(v, nElementos);
			break;
		case 3:
			nElementos=insPos(v, nElementos);
			break;
		}
		
		return nElementos;
	}
	
	
	private static int menuElim(int []v,int nElementos) {
		// TODO Auto-generated method stub
		submenuIns();
		int opcion=eligeOpcionElim();
		switch (opcion) {
		case 1:
			nElementos=rmPrincipio(v, nElementos);
			break;
		case 2:
			nElementos=rmFinal(v, nElementos);
			break;
		case 3:
			nElementos=rmPos(v, nElementos);
			break;
		}
		
		return nElementos;
		
	}
	
	
	private static void menuBusc(int []v,int nElementos,boolean ord) {
		// TODO Auto-generated method stub
		submenuBusc();
		int opcion=eligeOpcionIns();
		switch (opcion) {
		case 1:
			if(ord==false) {
				busqSec(v,nElementos);
			}else {
				busqBin(v,nElementos);
			}
			
			break;
		case 2:
			busqPos(v, nElementos);
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
	
	static int insPrincipio(int[]v,int nElementos) {
		if(nElementos>=10) {
			System.out.println("El vector ya esta lleno");
		}else {
			System.out.print("Dime un elemento:");
			int elemento=sc.nextInt();
			for(int i=nElementos-1;i>=0;i--) {
				v[i+1]=v[i];
			}
			v[0]=elemento;
			nElementos++;
		}
		
		return nElementos;
		
	}
	
	static int insFinal(int[]v,int nElementos) {
		if(nElementos>=10) {
			System.out.println("El vector ya esta lleno");
		}else {
			System.out.print("Dime un elemento:");
			int elemento=sc.nextInt();
			v[nElementos]=elemento;
			nElementos++;
		}
		
		return nElementos;
	}
	
	static int insPos(int[]v,int nElementos) {
		if(nElementos>=10) {
			System.out.println("El vector ya esta lleno");
		}else {
			System.out.print("Dime un elemento:");
			int elemento=sc.nextInt();
			System.out.print("Posicion donde quieres insertarlo");
			int pos=sc.nextInt();
			if(pos>nElementos) {
				System.out.println("La posicion es mayor que el numero de elementos");
			}else {
				
				for(int i=nElementos;i>=pos;i--) {
					v[i+1]=v[i];
				}
				v[pos]=elemento;
				nElementos++;
			}
			
		}
		
		return nElementos;
	}

	static int rmPrincipio(int []v,int nElementos) {
		if(nElementos<=0) {
			System.out.println("El vector ya esta vacio");
		}else {
			for(int i=0;i<nElementos;i++) {
				v[i]=v[i+1];
			}
			nElementos--;
		}
		
		return nElementos;
	}
	
	
	static int rmFinal(int []v,int nElementos) {
		if(nElementos<=0) {
			System.out.println("El vector ya esta vacio");
		}else {
			nElementos--;
		}
		
		return nElementos;
	}
	
	static int rmPos(int []v,int nElementos) {
		if(nElementos<=0) {
			System.out.println("El vector ya esta vacio");
		}else {
			
			System.out.print("Posicion donde quieres eliminar");
			int pos=sc.nextInt();
			
			for(int i=pos;i<nElementos-1;i++) {
				v[i]=v[i+1];
			}
			nElementos--;
		}
		return nElementos;
	}
	
	static void mod(int []v,int nElementos) {
		System.out.print("Posicion:");
		int pos=sc.nextInt();
		if(pos>nElementos-1 || pos<0) {
			System.out.println("Posicion no valida");
		}else {
			System.out.print("Nuevo elemento:");
			int elem=sc.nextInt();
			v[pos]=elem;
		}
	}
	
	
	static void listar(int[]v,int nElementos) {
		for(int i=0;i<nElementos;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	
	
	static void burb(int[]v,int nElementos) {
		   System.out.print("Vector sin ordenar: ");
         for(int i=0;i<nElementos;i++){
             System.out.print(v[i]+" ");
         }
         //Ordenamiento
         for(int i=0; i < nElementos-1; i++){
                for(int j=0; j < (nElementos-1-i); j++){  
                     if(v[j] > v[j+1]){  
                             int aux=v[j];                 
                             v[j]=v[j+1];           
                             v[j+1]=aux;
                      }    
                }
           }
         System.out.print("\nVector ordenado: ");
         for(int i=0;i<nElementos;i++){
             System.out.print(v[i]+" ");
         }
         System.out.println();
	}
	
	
	static void busqPos(int[]v,int nElementos) {
		System.out.print("Dime la posicion que quieres buscar:");
		int pos=sc.nextInt();
		if(pos>nElementos) {
			System.out.println("Posicion no valida");
		}else {
			System.out.println("El elemento de la posicion "+pos+" es "+v[pos]);
		}
	}
	
	
	static void busqSec(int[]v,int nElementos) {
		// VECTOR NO ORDENADO
		
		System.out.print("Elemento que quieres buscar");
		int valor=sc.nextInt();

	    boolean encontrado = false;
	    for (int i = 0; i < nElementos && !encontrado; i++) {
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
	
	
	static void busqBin(int[]v,int nElementos) {
		//VECTOR ORDENADO
	    int resultado = -1;
	    int limiteInferior = 0;
	    int limiteSuperior = nElementos - 1;
	    int indice;
	    
	    System.out.print("Elemento que quieres buscar:");
	    int valor=sc.nextInt();
	                 
	    boolean encontrado=false;
	    while (limiteInferior <= limiteSuperior && !encontrado) {
	        indice = (limiteInferior + limiteSuperior) / 2;
	             
	        if (v[indice] == valor) {
	        	encontrado=true;
	        }else if (valor > v[indice]) {
	            limiteInferior = indice + 1;
	        }else if (valor < v[indice]) {
	            limiteSuperior = indice - 1;
	        }
	    }
	    
	    if (encontrado) {
	        System.out.println("El elemento esta en la lista.");
	    } else {
	        System.out.println("El elemento no esta en la lista.");
	    }
	}
	
}