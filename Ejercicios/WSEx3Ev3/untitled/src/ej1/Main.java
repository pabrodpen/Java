package ej1;

public class Main {
    public static void main(String[] args) {
        CursoManager cursoManager = new CursoManager();

        Curso cursoMatematicas = new Curso("Matemáticas");
        Curso cursoCiencias = new Curso("Ciencias");
        Curso cursoHistoria = new Curso("Historia");

        cursoManager.addCourse(cursoMatematicas);
        cursoManager.addCourse(cursoCiencias);
        cursoManager.addCourse(cursoHistoria);

        cursoMatematicas.addStudent("Ana");
        cursoMatematicas.addStudent("Carlos");
        cursoMatematicas.addStudent("Beatriz");
        cursoMatematicas.addStudent("David");
        cursoMatematicas.addStudent("Elena");

        cursoCiencias.addStudent("Ana");
        cursoCiencias.addStudent("Carlos");
        cursoCiencias.addStudent("Fernando");
        cursoCiencias.addStudent("Gabriel");
        cursoCiencias.addStudent("Eva");

        cursoHistoria.addStudent("Beatriz");
        cursoHistoria.addStudent("David");
        cursoHistoria.addStudent("Elena");
        cursoHistoria.addStudent("Irene");
        cursoHistoria.addStudent("Carlos");

        // Eliminar estudiante
        cursoMatematicas.removeStudent("Ana");

        System.out.println("ESTUDIANTE ELIMINADO");
        System.out.println(cursoMatematicas.toString());

        // Obtener estudiantes comunes entre dos cursos

        System.out.println("Estudiantes que cursan Matematicas e Historia: " + cursoManager.estudiantesComunes(cursoMatematicas.getName(),cursoHistoria.getName()));

        // Obtener estudiantes que están en ambos cursos

        System.out.println("Estudiantes que estan en Ciencias o en Historia: " + cursoManager.estudiantesUnicos(cursoCiencias.getName(),cursoHistoria.getName()));

        // Obtener estudiantes que están en un curso pero no en el otro

        System.out.println("Estudiantes que estan en Matemáticas pero no en Ciencias: " + cursoManager.estudiantesDiferencia(cursoMatematicas.getName(),cursoCiencias.getName()));
    }
}


