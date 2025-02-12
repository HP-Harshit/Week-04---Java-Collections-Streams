package queueinterface.hospitaltriagesystem;

public class Patient {
    String name;
    int severity;

    // Constructor to initialize name and severity
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Method to return the patient's name
    public String getName() {
        return name;
    }
}
