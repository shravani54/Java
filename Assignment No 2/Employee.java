public class Employee {
    // Instance variables
    String firstName;
    String lastName;
    double monthlySalary;

    // Constructor
    Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    // Getter methods
    double getYearlySalary() {
        return monthlySalary * 12;
    }

    void giveRaise(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }

    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee("Alice", "Smith", 3000);
        Employee emp2 = new Employee("Bob", "Johnson", 4000);

        // Showing yearly salaries
        System.out.println(emp1.firstName + " " + emp1.lastName + " yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.firstName + " " + emp2.lastName + " yearly salary: $" + emp2.getYearlySalary());

        // Giving 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Showing salaries after raise
        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.firstName + " " + emp1.lastName + " yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.firstName + " " + emp2.lastName + " yearly salary: $" + emp2.getYearlySalary());
    }
}

