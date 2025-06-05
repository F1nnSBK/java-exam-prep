package lambdas_02;

public class Example {
    public static void main(String[] args) {
        // Student finn = new Student("Finn", 26);
        // Student nick = new Student("Nick", 17);

        // FilteredAdultStudents filAduStudents = new FilteredAdultStudents();
        // filAduStudents.add(nick);
        // filAduStudents.add(finn);

        // FilteredTeenStudents filTeeStudents = new FilteredTeenStudents();
        // filTeeStudents.add(nick);
        // filTeeStudents.add(finn);

        // filAduStudents.printStudents();
        // filTeeStudents.printStudents();

        FilteredStudents fiAduStu = new FilteredStudents(
            (s) -> s.age() > 18
        );

        FilteredStudents fiTeeStu = new FilteredStudents(
            (s) -> s.age() < 18
        );

        Student finn = new Student("Finn", 26);
        Student nick = new Student("Nick", 17);

        fiAduStu.add(nick);
        fiAduStu.add(finn);

        fiTeeStu.add(nick);
        fiTeeStu.add(finn);

        fiAduStu.printStudents();
        fiTeeStu.printStudents();
    }
}
