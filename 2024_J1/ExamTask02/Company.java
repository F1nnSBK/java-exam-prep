import java.util.ArrayList;
import java.util.Collections;

public class Company {

    private final ArrayList<Human> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Human human) {
        this.employees.add(human);
    }

    public void sortDefault() {
        Collections.sort(this.employees);
    }

    public void sortBySalary() {
        Collections.sort(this.employees, new SalaryComparator());
    }

    public void printAllEmployees() {
        for (Human employee : this.employees) {
            System.out.println(employee.toString());
        }
    }
}
