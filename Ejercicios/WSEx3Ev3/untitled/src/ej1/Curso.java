package ej1;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String name;
    private Set<String> students;

    public Curso(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addStudent(String student) {
        return students.add(student);
    }

    public boolean removeStudent(String student) {
        return students.remove(student);
    }

    public Set<String> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}