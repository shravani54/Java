class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus(double percentage) {
        return salary * percentage / 100;
    }

    public void generatePerformanceReport() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String department) {
        super(name, address, salary, "Manager");
        this.department = department;
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }

    @Override
    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    private String technology;

    public Developer(String name, String address, double salary, String technology) {
        super(name, address, salary, "Developer");
        this.technology = technology;
    }

    public void developFeature(String featureName) {
        System.out.println(name + " is developing the feature: " + featureName);
    }

    @Override
    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Technology: " + technology);
    }
}

class Programmer extends Developer {
    private String programmingLanguage;

    public Programmer(String name, String address, double salary, String technology, String programmingLanguage) {
        super(name, address, salary, technology);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode(String code) {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }

    @Override
    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "New York", 100000, "Sales");
        Developer developer = new Developer("Jane Doe", "California", 80000, "Java");
        Programmer programmer = new Programmer("Bob Smith", "Texas", 60000, "Java", "Java");

        System.out.println("Manager's Bonus: " + manager.calculateBonus(10));
        manager.generatePerformanceReport();
        manager.manageProject("Sales Project");

        System.out.println("\nDeveloper's Bonus: " + developer.calculateBonus(10));
        developer.generatePerformanceReport();
        developer.developFeature("Login Feature");

        System.out.println("\nProgrammer's Bonus: " + programmer.calculateBonus(10));
        programmer.generatePerformanceReport();
        programmer.writeCode("Hello World");
    }
}
