package resueltas;
import java.util.Scanner;
public class Res12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un dia(numero):");
		int dia=sc.nextInt();
		
		System.out.print("Dime un mes(numero):");
		int mes=sc.nextInt();
		
		System.out.print("Dime un año(numero):");
		int anio=sc.nextInt();
		
		boolean fechaCorrecta=false;
		
		if(anio<1) {
			fechaCorrecta=false;
		}else {
			if(mes<1 || mes>12) {
				fechaCorrecta=false;
			}else {
				if(dia<1) {
					fechaCorrecta=false;
				}else {
					switch (mes) {
					case 1,3,5,7,8,10,12: {
						fechaCorrecta=dia>31? false:true;
						break;
						}
					case 4,6,9,11:{
						fechaCorrecta=dia>30? false:true;
						}
					case 2:{
						fechaCorrecta=dia>28? false:true;
						}
					}
				}
			}
				
				
			}
		
		System.out.println(dia+"/"+mes+"/"+anio+" es una fecha correcta:"+fechaCorrecta);
		}
	}


