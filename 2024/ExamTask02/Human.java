public class Human implements Comparable<Human> {

    public final String firstName;
    public final String lastName;
    public final int age;
    public final int salary;

    public Human(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Human other) {
        if (this.age > other.age) {
            return 1;
        } else if (this.age < other.age) {
            return -1;
        } else {
            if (this.salary > other.salary) {
                return 1;
            } else if (this.salary < other.salary) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return (
            "Human [Fullname=" +
            this.firstName +
            " " +
            this.lastName +
            "] [age =" +
            this.age +
            "] [salary=" +
            this.salary +
            "]"
        );
    }
}
