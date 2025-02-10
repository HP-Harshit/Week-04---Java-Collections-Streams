package aidrivenresumescreeningsystem;

// Abstract class representing a general job role
abstract class JobRole {

    String candidateName;  // Name of the candidate

    // Constructor to initialize the job role with the candidate's name
    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    // Getter method to retrieve the name of the candidate
    public String getCandidateName() {
        return candidateName;
    }

    // Abstract method to display the details of the job role, to be implemented by subclasses
    public abstract void displayRole();
}
