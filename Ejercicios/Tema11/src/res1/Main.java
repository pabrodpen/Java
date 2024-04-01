package res1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]enteros= {3,5,-1,8,0};
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res1/datos.dat"));
			
			for(int i=0;i<enteros.length;i++) {
				out.writeInt(enteros[i]);
			}
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		//imprimimos por pantalla
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res1/datos.dat"));

			
			while(true) {
				int n=in.readInt();
				System.out.println(n);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
