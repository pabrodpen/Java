package ejerciciosClase;

import java.util.Arrays;

public class EjAnioPasado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 Strings[]ordenados-->hacer un cjto solo ordenandolos poco a poco
	
	
		String[]cjto1= {"gato","lapiz","ordenador","perro"};
		String[]cjto2= {"alas","bola","gafas","papel"};
		
		String[]cjtoFinal=new String[cjto1.length+cjto2.length];
		int indFinal=0,indCjto1=0,indCjto2=0;
		
		
				while(indCjto1<cjto1.length && indCjto2<cjto2.length) {
					if(cjto1[indCjto1].compareTo(cjto2[indCjto2])<0) {
						cjtoFinal[indFinal]=cjto1[indCjto1];
						indCjto1++;
					}else {
						cjtoFinal[indFinal]=cjto2[indCjto2];
						indCjto2++;
					}
					indFinal++;
				}
				
				if(indCjto1>=cjto1.length) {
					while(indCjto2<cjto2.length) {
						cjtoFinal[indFinal]=cjto2[indCjto2];
						indCjto2++;
						indFinal++;
					}
				}
				
				if(indCjto2>=cjto2.length) {
					while(indCjto1<cjto1.length) {
						cjtoFinal[indFinal]=cjto1[indCjto1];
						indCjto1++;
						indFinal++;
					}
				}
		
		
		//mostramos
		
		System.out.println("ARRAY CJTO");
		System.out.println(Arrays.toString(cjtoFinal));
	}

}
