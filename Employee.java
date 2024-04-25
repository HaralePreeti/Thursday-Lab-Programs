public class Employee {
    // Static variables
    private static int eidCounter = 1000;
    private static String companyName = "Oben Electric";

    // Instance variables
    private int eid;
    private String ename;

    // Constructor
    public Employee(String ename) {
        this.eid = eidCounter++;
        this.ename = ename;
    }

    // Static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Alice");

        // Display company name using static method
        Employee.displayCompanyName();

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}

