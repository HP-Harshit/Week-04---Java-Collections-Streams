package aidrivenresumescreeningsystem;

// Class representing a Software Engineer job role that extends the JobRole class
public class SoftwareEngineer extends JobRole {

    // Constructor to initialize the Software Engineer with the candidate's name
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    // Method to display information about the Software Engineer job role
    @Override
    public void displayRole() {
        System.out.println("Software Engineer: " + getCandidateName());  // Display the job role and candidate's name
    }
}
