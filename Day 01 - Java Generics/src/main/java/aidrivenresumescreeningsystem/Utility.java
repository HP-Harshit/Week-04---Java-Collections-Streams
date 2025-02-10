package aidrivenresumescreeningsystem;

import java.util.List;

public class Utility {

    // Method to display information for all resumes in the list
    public static void displayAllResumes(List<? extends JobRole> jobRoles) {

        // Loop through each job role in the list
        for (JobRole role : jobRoles) {

            // Call the displayRole method to display details about the job role
            role.displayRole();
        }
    }
}
