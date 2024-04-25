//Create bean for Employee with fields(eid,ename,esalary).

// Employee bean class
public class Employee_data{
    // Fields
    private int eid; // Employee ID
    private String ename; // Employee Name
    private double esalary; // Employee Salary

    // Default constructor
    public Employee_data() {
        // Default constructor
    }

    // Parameterized constructor
    public Employee_data(int eid, String ename, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    // Getter and setter methods
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    // toString method to represent Employee object as string
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esalary=" + esalary +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Employee object
        Employee_data employee = new Employee_data(101, "John Doe", 50000.0);

        // Printing employee details
        System.out.println("Employee details:");
        System.out.println(employee);
    }
}
