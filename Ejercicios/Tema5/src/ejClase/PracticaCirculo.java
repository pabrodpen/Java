package ejClase;

public class PracticaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroPersonas=9,salto=6;
		
		int []v=new int[numeroPersonas];
		//rellenamos el vector con 1,2...
		for(int i=0;i<v.length;i++) {
			v[i]=i+1;
		}
		
		int pos=0;
		while(numeroPersonas>1) {
			//siguiente posicion a eliminar
			pos=(pos+salto-1);
			//SI LA POSICION ES MENOR A LA CANTIDAD SUMA 0(SE QUEDA IGUAL) 
			//PERO POR EJEMPLO SI ES MAYOR(EJ: POSICION 6 DE 5 ELEMENTOS,
			//AL HACER EL MODULO 6%5==1 SERIA LO MISMO QUE DECIR QUE DA UNA VUELTA COMPLETA
			//Y ELIMINA AL LA POSICION1
			
			System.out.println("Se elimina "+v[pos]);
			
			//eliminar en una pos cualquiera
			for(int i=pos;i<numeroPersonas-1;i++) {
				v[i]=v[i+1];
			}
			numeroPersonas--;
		}
		
		//al salir del bucle queda el vector con 1 elemento(v[0])
		System.out.println("El que gana es "+v[0]);
		
		
	}

}
