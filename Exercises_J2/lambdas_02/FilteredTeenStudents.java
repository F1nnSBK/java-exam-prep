package lambdas_02;

import java.util.ArrayList;
import java.util.List;

public class FilteredTeenStudents {
        private final List<Student> students;

    public FilteredTeenStudents() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        if (student.age() < 18) {
            students.add(student);
        }
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }
}
