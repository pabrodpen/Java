package app18_19_20_21;

import java.util.Arrays;

public class Cjto {

	Integer[]cjto=new Integer[0];

	int numElementos() {
		return cjto.length;
	}
	
	boolean insertar(Integer nuevo) {
		if(esRepetido(nuevo)) {
			return false;
		}else {
			cjto=Arrays.copyOf(cjto, cjto.length+1);
			cjto [cjto.length-1]=nuevo;
			return true;
		}
		
		
	}
	
	boolean esRepetido(Integer n) {//es lo mismo que el metodo pertenece que me piden
		boolean repetido=false;
		for(int i=0;i<cjto.length && !repetido;i++) {
			if(cjto[i]==n) {
				repetido=true;
			}
		}
		return repetido;
	}
	
	boolean insertar(Cjto otro) {
		boolean elemRepetido=false;
		for(int i=0;i<otro.numElementos() && !elemRepetido;i++) {
			if(esRepetido(otro.cjto[i])) {//otro.cjto, ya que accedemos al atribito cjto de la clase Cjto en el objeto otro
				//MUY IMP
				elemRepetido=true;
			}
			
		}
		
		if(elemRepetido) {
			return false;
		}else {
			for(int i=0;i<otro.numElementos();i++) {
				insertar(otro.cjto[i]);
			}
			return true;
		}
	}
	
	void mostrar() {
		System.out.println(Arrays.toString(cjto));
	}
	
	
	static boolean incluido(Cjto cjto1,Cjto cjto2) {
		boolean estaIncluido=true;
		for(int i=0;i<cjto1.cjto.length;i++) {
			boolean encontrado=false;
			for(int j=0;j<cjto2.cjto.length && !encontrado;j++) {
				if(cjto1.cjto[i]==cjto2.cjto[i]) {
					encontrado=true;
				}
			}
			if(!encontrado) {
				estaIncluido=false;
			}
		}
		
		return estaIncluido;
	}
	
	static Cjto union(Cjto cjto1,Cjto cjto2) {//comunes y no comunes
		Cjto resCjto=new Cjto();
		
		for(int i=0;i<cjto1.cjto.length;i++) {
			if(!resCjto.esRepetido(cjto1.cjto[i])){
				resCjto.insertar(cjto1.cjto[i]);
			}
		}
		
		for(int i=0;i<cjto2.cjto.length;i++) {
			if(!resCjto.esRepetido(cjto2.cjto[i])){
				resCjto.insertar(cjto2.cjto[i]);
			}
		}
		
		return resCjto;
	}
	
	static Cjto interseccion(Cjto cjto1,Cjto cjto2) {//solo comunes
		Cjto resCjto=new Cjto();
		
		for(int i=0;i<cjto1.cjto.length;i++) {
			if(cjto2.esRepetido(cjto1.cjto[i]) && resCjto.esRepetido(cjto1.cjto[i])) {//vemos si tmb lo hemos metido anteriormente
				resCjto.insertar(cjto1.cjto[i]);
			}
		}
		
		return resCjto;
	}
	
	static Cjto diferencia(Cjto cjto1,Cjto cjto2) {//solo no comunes
		Cjto resCjto=new Cjto();
		
		for(int i=0;i<cjto1.cjto.length;i++) {
			if(!cjto2.esRepetido(cjto1.cjto[i]) && resCjto.esRepetido(cjto1.cjto[i])) {
				resCjto.insertar(cjto1.cjto[i]);
			}
		}
		
		//lo mismo pero para el cjto2
		for(int i=0;i<cjto2.cjto.length;i++) {
			if(!cjto1.esRepetido(cjto2.cjto[i]) && resCjto.esRepetido(cjto2.cjto[i])) {
				resCjto.insertar(cjto2.cjto[i]);
			}
		}
		
		
		return resCjto;
	}
	
	
	
}
