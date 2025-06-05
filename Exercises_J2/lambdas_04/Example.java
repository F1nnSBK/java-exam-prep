package lambdas_04;

public class Example {
    public static void main(String[] args) {
        Predicate<Student> adultCriteria = s -> s.age() >= 18;

        Student finn = new Student("Finn", 26);
        Student nick = new Student("Nick", 17);
        Student sarah = new Student("Sarah", 19);
        Student emily = new Student("Emily", 16);
        Student michael = new Student("Michael", 18);

        FilteredStudents adults = new FilteredStudents(adultCriteria);
        adults.add(finn);
        adults.add(nick);
        adults.add(sarah);
        adults.add(emily);
        adults.add(michael);

        adults.forEach(s -> System.out.println(s.name().toUpperCase()));
    }
}
