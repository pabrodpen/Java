package aplicacion;

public class App20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] tabla1 = {1, 3, 5, 7, 9};
		        int[] tabla2 = {2, 4, 6, 8, 10, 12};

		        int[] tablaFinal = fusionarTablasOrdenadas(tabla1, tabla2);

		        // Imprimir la tabla final
		        for (int elemento : tablaFinal) {
		            System.out.print(elemento + " ");
		        }
		    }

	static int[] fusionarTablasOrdenadas(int[] tabla1, int[] tabla2) {
        int longitudTabla1 = tabla1.length;
        int longitudTabla2 = tabla2.length;
        int[] tablaFinal = new int[longitudTabla1 + longitudTabla2];

        int indiceTabla1 = 0;
        int indiceTabla2 = 0;
        int indiceTablaFinal = 0;

        // Fusionar las tablas ordenadas
        while (indiceTabla1 < longitudTabla1 && indiceTabla2 < longitudTabla2) {
            if (tabla1[indiceTabla1] < tabla2[indiceTabla2]) {
                tablaFinal[indiceTablaFinal] = tabla1[indiceTabla1];
                indiceTabla1++;
            } else {
                tablaFinal[indiceTablaFinal] = tabla2[indiceTabla2];
                indiceTabla2++;
            }
            indiceTablaFinal++;
        }

        // Copiar los elementos restantes de la tabla1 (si los hay)
        while (indiceTabla1 < longitudTabla1) {
            tablaFinal[indiceTablaFinal] = tabla1[indiceTabla1];
            indiceTabla1++;
            indiceTablaFinal++;
        }

        // Copiar los elementos restantes de la tabla2 (si los hay)
        while (indiceTabla2 < longitudTabla2) {
            tablaFinal[indiceTablaFinal] = tabla2[indiceTabla2];
            indiceTabla2++;
            indiceTablaFinal++;
        }

        return tablaFinal;
    }

}
