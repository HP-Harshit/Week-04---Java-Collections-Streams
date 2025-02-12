package queueinterface.hospitaltriagesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        // Initialize the priority queue with a custom comparator
        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                // Compare patients based on severity (higher severity comes first)
                return Integer.compare(o2.severity, o1.severity);
            }
        });

        // Add patients to the queue
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Process and print patients by severity
        for (Patient patient : queue){
            System.out.print(patient.getName() + ", ");
        }
    }
}
