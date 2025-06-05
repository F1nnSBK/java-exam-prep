package lambdas_03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

    public void forEach(Consumer<Student> consumer) {
        for(Student student : students) {
            consumer.accept(student);
        }
    }

}
