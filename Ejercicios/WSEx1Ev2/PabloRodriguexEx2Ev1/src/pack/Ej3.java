package pack;

import java.util.Arrays;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1="hola";
		String cad2="11111";
		String resultado=combinarCadenas(cad1, cad2);
		System.out.println(resultado);
	}
	
	public static String combinarCadenas(String cadena1,String cadena2) {
		
		
		char[]aux1=cadena1.toCharArray();
		char[]aux2=cadena2.toCharArray();
		String[] nueva=new String[aux1.length+aux2.length];
		int cont1=0,cont2=0,contFinal=0;
		while(cont1<cadena1.length() && cont2<cadena2.length()) {
			nueva[contFinal]=String.valueOf(aux1[cont1]);
			contFinal++;
			cont1++;
			nueva[contFinal]=String.valueOf(aux2[cont2]);
			contFinal++;
			cont2++;
		}
		while(cont1<cadena1.length()) {
			nueva[contFinal]=String.valueOf(aux1[cont1]);
			contFinal++;
			cont1++;
		}
		
		while(cont2<cadena2.length()) {
			nueva[contFinal]=String.valueOf(aux2[cont2]);
			contFinal++;
			cont2++;
		}
		
		String resultado="";
		for(int i=0;i<nueva.length;i++) {
			resultado+=nueva[i];
		}
		
		return resultado;
	}

}
