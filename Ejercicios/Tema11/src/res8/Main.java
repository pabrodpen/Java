package res8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Socio socio1=new Socio("pablo",20);
		Socio socio2=new Socio("fran",30);
		Socio socio3=new Socio("dani",27);
		
		Socio[]conjSocios= {socio1,socio2,socio3};
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/res8/socios.dat"));
			
			out.writeObject(conjSocios);
			out.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}		
		
		//leemos
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/res8/socios.dat"));
			
			Socio[]leidos=(Socio[]) in.readObject();
			
			System.out.println(Arrays.toString(leidos));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
