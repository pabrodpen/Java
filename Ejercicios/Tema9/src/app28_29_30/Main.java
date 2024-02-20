package app28_29_30;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Jornada[]jornadas=new Jornada[4];
		
		jornadas[0]=new Jornada("1234", "2024-02-17", "08:56:45", "14:45:32");
		jornadas[1]=new Jornada("1234", "2024-02-18", "09:26:15", "15:02:12");
		jornadas[2]=new Jornada("4567", "2024-02-17", "15:08:27", "22:30:00");
		jornadas[3]=new Jornada("4567", "2024-02-18", "14:58:22", "21:57:15");
		
		System.out.println("ORDENADAS POR DNI,FECHA");
		Arrays.sort(jornadas);
		System.out.println(Arrays.toString(jornadas));
		
		
		System.out.println("ORDENADAS POR MINUTOS TRABAJADOS");
		Arrays.sort(jornadas, new ComparaMinutos());
		System.out.println(Arrays.toString(jornadas));
	}

}
