class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
        System.out.println("--------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice Johnson", 75000.50);
        Employee emp2 = new Employee(102, "Bob Smith", 62000.00);

        System.out.println("Displaying Employee Details:");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
