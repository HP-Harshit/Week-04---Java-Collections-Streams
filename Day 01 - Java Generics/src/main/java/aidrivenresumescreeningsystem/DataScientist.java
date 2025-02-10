package aidrivenresumescreeningsystem;

// Class representing a Data Scientist job role that extends the JobRole class
public class DataScientist extends JobRole {

    // Constructor to initialize the Data Scientist with the candidate's name
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    // Method to display information about the Data Scientist job role
    @Override
    public void displayRole() {
        System.out.println("Data Scientist: " + getCandidateName());  // Display the job role and candidate's name
    }
}
