package ej1;

import java.util.HashSet;
import java.util.Set;

public class CursoManager {
    private Set<Curso> cours;

    public CursoManager() {
        this.cours = new HashSet<>();
    }

    public boolean addCourse(Curso curso) {
        return cours.add(curso);
    }

    public boolean removeCourse(Curso curso) {
        return cours.remove(curso);
    }

    public Set<Curso> getCourses() {
        return cours;
    }

    public Curso getCourse(String courseName) {
        for (Curso curso : cours) {
            if (curso.getName().equals(courseName)) {
                return curso;
            }
        }
        return null;
    }

    public Set<String> estudiantesComunes(String c1,String c2){
        Curso curso1=getCourse(c1);
        Curso curso2=getCourse(c2);
        Set<String> commonStudents = new HashSet<>(curso1.getStudents());
        commonStudents.retainAll(curso2.getStudents());

        return commonStudents;
    }


    public Set<String> estudiantesUnicos(String c1,String c2){
        Curso curso1=getCourse(c1);
        Curso curso2=getCourse(c2);
        Set<String> allStudents = new HashSet<>(curso1.getStudents());
        allStudents.addAll(curso2.getStudents());
        return allStudents;
    }

    public Set<String> estudiantesDiferencia(String c1,String c2){
        Curso curso1=getCourse(c1);
        Curso curso2=getCourse(c2);
        Set<String> differenceStudents = new HashSet<>(curso1.getStudents());
        differenceStudents.removeAll(curso2.getStudents());
        return differenceStudents;
    }
}



  