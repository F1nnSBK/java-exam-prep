package generics_03;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass("10c", new ArrayList<>());

        schoolClass.addPupil(new Pupil("Hans", "m"));
        schoolClass.addPupil(new Pupil("Peter", "m"));
        schoolClass.addPupil(new Pupil("Lisa", "w"));
        schoolClass.addPupil(new Pupil("Fritz", "m"));
        schoolClass.addPupil(new Pupil("Max", "m"));
        schoolClass.addPupil(new Pupil("Franziska", "w"));
        schoolClass.addPupil(new Pupil("Jennifer", "w"));

        schoolClass.getPairs().forEach(System.out::println);
    }

}
