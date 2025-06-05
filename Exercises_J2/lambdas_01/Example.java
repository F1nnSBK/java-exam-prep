package lambdas_01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jamy", 20));
        students.add(new Student("Vin", 30));
        students.add(new Student("Jere", 22));
        students.add(new Student("Htag", 25));
        students.add(new Student("Toprak", 12));
        students.add(new Student("Carl", 28));

        students.forEach(
            new Consumer<Student>() {
                public void accept(Student s) {
                    if (s.age() > 26) {
                        System.out.println(s.name() + " ist " + s.age() + " Jahre alt");
                    }
                }
            }
        );

        students.forEach(
            (student) -> {
                if(student.age() > 26) {
                    System.out.println(student.name() + " ist " + student.age() + " Jahre alt" + " LAMBDA");
                }
            }
        );

    }
}
