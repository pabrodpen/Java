package res2;

public class Main {
    public static void main(String[] args) {

        Contenedor<Integer> contenedorEnteros=new Contenedor<>();

        contenedorEnteros.insertarAlPrincipio(2);
        contenedorEnteros.insertarAlPrincipio(5);
        contenedorEnteros.insertarAlFinal(6);
        System.out.println(contenedorEnteros);
        contenedorEnteros.ordenar();
        System.out.println(contenedorEnteros);



    }
}
