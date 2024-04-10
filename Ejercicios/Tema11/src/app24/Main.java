package app24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llenarArray("fich1");
		llenarArray("fich2");
		
		add("src/app24/fich1.dat", "src/app24/fich2.dat");
		
		
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
			inNuevo.close();
			
			Arrays.sort(l1);
			Arrays.sort(l2);
			
			boolean repetido=false;
			for(int i=0;i<l2.length;i++) {
				for(int j=0;j<l1.length && !repetido;j++) {
					if(l2[i]==l1[j]) {
						repetido=true;
					}
				}
				if(repetido) {
					repetido=false;
				}else {
					l1=Arrays.copyOf(l1, l1.length+1);
					l1[l1.length-1]=l2[i];	
				}
					
			}
			
			Arrays.sort(l1);
			ObjectOutputStream outBase=new ObjectOutputStream(new FileOutputStream(fBase));
		
			outBase.writeObject(l1);
			outBase.close();
			
			
			//comprobamos leyendo de nuevo fich1
			
			ObjectInputStream inBase2=new ObjectInputStream(new FileInputStream(fBase));
			Integer[]res=(Integer[]) inBase2.readObject();
			
			inBase2.close();
			System.out.println("ARRAY AÑADIDO");
			System.out.println(Arrays.toString(res));
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
	            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/app24/"+f+".dat"));
	            
	            out.writeObject(lista);
	            out.close();
	            
	        } catch (IOException e) {
	            // TODO: handle exception
	            System.out.println(e.getMessage());
	        }
	    }
}
