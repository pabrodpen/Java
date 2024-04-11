package app25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		//introducimos valores en los ficheros
		
		Integer[]l1= {2,3,5};
		Integer[]l2= {23,11,56,0};
		Integer[]l3= {1,-7,66,-21,7};
		Integer[]l4= {-5,78};
		ObjectInputStream in1,in2,in3,in4;
		ObjectOutputStream out1,out2,out3,out4;
		try {
			 out1=new ObjectOutputStream(new FileOutputStream("src/app25/fich1.dat"));
			 out2=new ObjectOutputStream(new FileOutputStream("src/app25/fich2.dat"));
			 out3=new ObjectOutputStream(new FileOutputStream("src/app25/fich3.dat"));
			 out4=new ObjectOutputStream(new FileOutputStream("src/app25/fich4.dat"));

			out1.writeObject(l1);
			out1.close();
			out2.writeObject(l2);
			out2.close();
			out3.writeObject(l3);
			out3.close();
			out4.writeObject(l4);
			out4.close();
			
			Scanner scanner=new Scanner(System.in);
			
			
			
			System.out.print("Dime un numero:");
			int n=scanner.nextInt();
			
			
			Integer[]listaNum1,listaNum2,listaNum3,listaNum4;
			
			in1=new ObjectInputStream(new FileInputStream("src/app25/fich1.dat"));
			in2=new ObjectInputStream(new FileInputStream("src/app25/fich2.dat"));
			in3=new ObjectInputStream(new FileInputStream("src/app25/fich3.dat"));
			in4=new ObjectInputStream(new FileInputStream("src/app25/fich4.dat"));

			
			
			listaNum1=(Integer[]) in1.readObject();
			listaNum2=(Integer[]) in2.readObject();
			listaNum3=(Integer[]) in3.readObject();
			listaNum4=(Integer[]) in4.readObject();
			
			boolean encontrado=false;
			int numFich=1,pos=0;
			
			for(int i=0;i<listaNum1.length && !encontrado;i++) {
				if(listaNum1[i].intValue()==n) {
					encontrado=true;
					pos=i;
				}
			}
			
			if(!encontrado) {
				numFich++;
				for(int i=0;i<listaNum2.length && !encontrado;i++) {
					if(listaNum2[i].intValue()==n) {
						encontrado=true;
						pos=i;
					}
				}
				
				if(!encontrado) {
					numFich++;
					for(int i=0;i<listaNum3.length && !encontrado;i++) {
						if(listaNum3[i].intValue()==n) {
							encontrado=true;
							pos=i;
						}
					}
					
				}
				
				
				if(!encontrado) {
					numFich++;
					
					for(int i=0;i<listaNum4.length && !encontrado;i++) {
						if(listaNum4[i].intValue()==n) {
							encontrado=true;
							pos=i;
						}
					}
				}
			}
			
			
			
			
			
			
			
			
			if(encontrado) {
				System.out.println(n+" encontrado en el fichero fich"+numFich+" en la posicion "+pos);
			}else {
				System.out.println(n+" no se encuentra en ninguno de los ficheros");
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		
		
		
		
	}

}
