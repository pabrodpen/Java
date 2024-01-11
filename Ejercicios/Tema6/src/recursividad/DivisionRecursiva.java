package recursividad;

public class DivisionRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=56,divisor=7;
		int cociente=dividir(numero,divisor,0);
		System.out.println(numero+":"+divisor+"="+cociente);
		
	}
	
	static int dividir(int n,int div,int cont) {
		// Caso base: cuando n es menor que el divisor, devuelve el contador
        if (n < div) {
            return cont;
        } else {
            // Llama recursivamente con el nuevo valor de n (resta el divisor)
            return dividir(n-div, div, cont + 1);
        }
	}
	
	/*mientras n>=div-->56>=7
	 * 56-7=49->cont++
	 * 49-7=42->cont++
	 * 42-7=35->cont++
	 * 35-7=28->cont++
	 * 28-7=21->cont++
	 * 21-7=14->cont++
	 * 14-7=7-->cont++
	 * 7-7=0-->cont++-->n<div-->return cont=8
	 * */

}
