package res4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fileReader;
		int suma=0;
		String numString="";
		try {
			fileReader=new FileReader("src/res4/numeros.txt");
			int c=fileReader.read();
			while(c!=-1) {
				numString+=String.valueOf(c);
				c=fileReader.read();
			}
			
			String[]aux=numString.split(" ");
			for(int i=0;i<aux.length;i++) {
				int n=Integer.parseInt(aux[i]);
				suma+=n;
			}
			double media=(double)(suma/aux.length);
			System.out.println("Suma:"+suma);
			System.out.println("Media:"+media);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
