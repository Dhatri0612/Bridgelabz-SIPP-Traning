public class Employee {
    public int employeeID;        // Public variable
    protected String department;  // Protected variable
    private double salary;        // Private variable

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public setter method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public getter method to access salary
    public double getSalary() {
        return salary;
    }

    // MAIN method to test Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "IT", 50000);

        // Display employee details
        System.out.println("Employee ID: " + emp.employeeID);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary: " + emp.getSalary());

        // Modify salary
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
