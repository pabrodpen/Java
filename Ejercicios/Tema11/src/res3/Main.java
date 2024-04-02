package res3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Cantidad de numeros:");
		int cant=sc.nextInt();
		double[]numeros=new double[cant];
		
		
		for(int i=0;i<cant;i++) {
			System.out.print("Numero:");
			double n=sc.nextDouble();
			
			numeros[i]=n;
		}
		
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res3/numeros.dat"));
			out.writeObject(numeros);
			out.close();

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		//comprobacion
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res3/numeros.dat"));
			
			double numLeidos[]=(double[]) in.readObject();
			
			
			System.out.println(Arrays.toString(numeros));
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
