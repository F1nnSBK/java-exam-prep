public class ExamTask02 {

    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Human("Steffen", "Merk", 24, 1000));
        company.addEmployee(new Human("Marianna", "", 28, 2000));

        company.sortBySalary();
        company.printAllEmployees();
        company.sortDefault();
        company.printAllEmployees();
    }
}
