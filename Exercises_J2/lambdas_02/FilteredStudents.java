package lambdas_02;

import java.util.ArrayList;
import java.util.List;

public class FilteredStudents {
    
    private final List<Student> students;
    private final Predicate<Student> mandatoryFilter;

    public FilteredStudents(Predicate<Student> mandatoryFilter) {
        this.mandatoryFilter = mandatoryFilter;
        this.students = new ArrayList<>();
    }

    public void add(Student t) {
        if(this.mandatoryFilter.test(t)) {
            students.add(t);
        }
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }

}
