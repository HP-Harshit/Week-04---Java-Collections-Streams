package mapinterface.groupobjectsbyproperty;

// Class to represent an Employee
public class Employee {
    // Private fields to store the name and department of the employee
    private String name;
    private String dept;

    // Constructor to initialize the name and department
    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    // Getter method to retrieve the name of the employee
    public String getName() {
        return name;
    }

    // Getter method to retrieve the department of the employee
    public String getDept() {
        return dept;
    }

    // Override toString method to return a string representation of the employee
    @Override
    public String toString() {
        return name + " (" + dept + ")";
    }
}
