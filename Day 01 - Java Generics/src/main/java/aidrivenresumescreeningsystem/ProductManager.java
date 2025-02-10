package aidrivenresumescreeningsystem;

// Class representing a Product Manager job role that extends the JobRole class
public class ProductManager extends JobRole {

    // Constructor to initialize the Product Manager with the candidate's name
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    // Method to display information about the Product Manager job role
    @Override
    public void displayRole() {
        System.out.println("Product Manager: " + getCandidateName());  // Display the job role and candidate's name
    }
}
