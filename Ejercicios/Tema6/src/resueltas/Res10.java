package resueltas;

public class Res10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Dabale arroz a la zorra el abad";
		frase=frase.toLowerCase();
		String[]aux=frase.split(" ");
		String sinEspacios=String.valueOf(aux);
		boolean palindromo=true;
		
		for(int i=0;i<sinEspacios.length() && palindromo;i++) {
			int cont=sinEspacios.length()-1;
			if(sinEspacios.charAt(i)!=sinEspacios.charAt(cont)) {
				palindromo=false;
			}else {
				cont--;
			}
		}
		
		if(palindromo) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase no es palindroma");
		}
		
	}

}
