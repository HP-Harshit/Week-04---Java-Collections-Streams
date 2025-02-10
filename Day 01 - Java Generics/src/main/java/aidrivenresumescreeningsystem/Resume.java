package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Generic class representing a resume with a type parameter T that extends JobRole
public class Resume<T extends JobRole> {

    List<T> resumes;  // List to store resumes of type T

    // Constructor to initialize the resumes list
    public Resume() {
        resumes = new ArrayList<>();
    }

    // Method to add a resume to the list
    public void addResumes(T resume) {
        resumes.add(resume);
    }

    // Method to retrieve the list of resumes
    public List<T> getResumes() {
        return resumes;
    }
}
