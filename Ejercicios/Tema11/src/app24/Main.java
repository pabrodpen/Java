package app24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llenarArray("fich1");
		llenarArray("fich2");
		
	}
	
	
	
	static void add(String fBase,String fNuevo) {
		//leemos el fBase y fNuevo , sacamos los array, los fusionamos, y lo
		//metemos en fBase de nuevo
		
		try {
			ObjectInputStream inBase=new ObjectInputStream(new FileInputStream(fBase));
			ObjectInputStream inNuevo=new ObjectInputStream(new FileInputStream(fNuevo));

			Integer[]l1=(Integer[]) inBase.readObject();
			Integer[]l2=(Integer[]) inNuevo.readObject();
			
			inBase.close();
			inBase.close();
			
			ObjectOutputStream outBase=new ObjectOutputStream(new FileOutputStream(fBase));
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	

	 static void llenarArray(String f) {
	        System.out.print("Longitud del array:");
	        int l=scanner.nextInt();
	        Integer[]lista=new Integer[l];
	        for(int i=0;i<l;i++) {
	            System.out.print("Numero:");
	            Integer n=scanner.nextInt();
	            
	            lista[i]=n;
	        }
	        
	        try {
	            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app23/"+f+".dat"));
	            
	            out.writeObject(lista);
	            out.close();
	            
	        } catch (IOException e) {
	            // TODO: handle exception
	            System.out.println(e.getMessage());
	        }
	    }
}
