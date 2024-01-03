package aplicacion;
import java.util.Scanner;
public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Sentencia en C:");
		String frase=sc.nextLine();
		
		String noComments="";
		
		
			 int ind1=frase.indexOf("/*");
			 int ind2=frase.indexOf("*/");
			 
			 while(ind1!= -1 && ind2!=-1) {
				 noComments+=frase.substring(0, ind1);
				 frase=frase.substring(ind2+2);//+2 para saltar el */
				 ind1=frase.indexOf("/*");
				 ind2=frase.lastIndexOf("*/");
			 }
			
		noComments+=frase;
		System.out.println(noComments);
}

}
