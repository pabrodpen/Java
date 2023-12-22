package aplicacion;
import java.util.Scanner;
public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un numero:");
		int n=sc.nextInt();
		
		if(n<0 && n>99) {
			System.out.println("Tiene que ser un numero entre 0 y 99");
		}else {
			int unidades=n%10;
			int decenas=(n/10)%10;
			
			if(n<=20) {
				switch (n) {
				case 1: {
					System.out.println("Uno");
					break;
					}
				
				case 2: {
					System.out.println("Dos");
					break;
					}
			
				case 3: {
					System.out.println("Tres");
					break;
					}
		
				case 4: {
					System.out.println("Cuatro");
					break;
					}
	
				case 5: {
					System.out.println("Cinco");
					break;
					}

				case 6: {
					System.out.println("Seis");
					break;
					}

				case 7: {
					System.out.println("Siete");
					break;
					}

				case 8: {
					System.out.println("Ocho");
					break;
					}

				case 9: {
					System.out.println("Nueve");
					break;
					}

				case 10: {
					System.out.println("Diez");
					break;
					}

				case 11: {
					System.out.println("Once");
					break;
					}

				case 12: {
					System.out.println("Doce");
					break;
					}

				case 13: {
					System.out.println("Trece");
					break;
					}

				case 14: {
					System.out.println("Catorce");
					break;
					}

				case 15: {
					System.out.println("Quince");
					break;
					}

				case 16: {
					System.out.println("Dieciséis");
					break;
					}

				case 17: {
					System.out.println("Diecisiete");
					break;
					}

				case 18: {
					System.out.println("Dieciocho");
					break;
					}

				case 19: {
					System.out.println("Diecinueve");
					break;
					}

				case 20: {
					System.out.println("Veinte");
					break;
					}

				}
				
			}else if(decenas==2) {
				System.out.print("Veinti");
				
				switch (unidades) {
				case 1: {
					System.out.println("uno");
					break;
				}
				case 2: {
					System.out.println("dos");
					break;
				}
				case 3: {
					System.out.println("tres");
					break;
				}
				case 4: {
					System.out.println("cuatro");
					break;
				}
				case 5: {
					System.out.println("cinco");
					break;
				}
				case 6: {
					System.out.println("seis");
					break;
				}
				case 7: {
					System.out.println("siete");
					break;
				}
				case 8: {
					System.out.println("ocho");
					break;
				}
				case 9: {
					System.out.println("nueve");
					break;
				}
			}

			}else if(decenas==3) {
				System.out.print("treinta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else if(decenas==4) {
				System.out.print("cuarenta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else if(decenas==5) {
				System.out.print("cincuenta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else if(decenas==6) {
				System.out.print("sesenta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else if(decenas==7) {
				System.out.print("setenta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else if(decenas==8) {
				System.out.print("ochenta ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}else {
				System.out.print("noventa ");
				
				
				switch (unidades) {
				case 1: {
					System.out.println("y uno");
					break;
				}
				case 2: {
					System.out.println("y dos");
					break;
				}
				case 3: {
					System.out.println("y tres");
					break;
				}
				case 4: {
					System.out.println("y cuatro");
					break;
				}
				case 5: {
					System.out.println("y cinco");
					break;
				}
				case 6: {
					System.out.println("y seis");
					break;
				}
				case 7: {
					System.out.println("y siete");
					break;
				}
				case 8: {
					System.out.println("y ocho");
					break;
				}
				case 9: {
					System.out.println("y nueve");
					break;
				}
			}

			}
				
							
		
		}
	}
}


