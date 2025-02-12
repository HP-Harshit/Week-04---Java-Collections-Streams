package queueinterface.hospitaltriagesystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriageSystemTest {

    @Test
    void testPatient() {
        // Create a patient with name "John" and severity 3
        Patient patient = new Patient("John", 3);

        // Expected string representation of the patient
        String expected = "John";

        // Assert that the patient's string representation matches the expected value
        Assertions.assertEquals(expected, patient.getName());

        // Print the patient's string representation
        System.out.println(patient.getName());
    }

    @Test
    void testTriage() {
        // Initialize priority queue with custom comparator
        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                // Compare by severity (higher comes first)
                return Integer.compare(o2.severity, o1.severity);
            }
        });

        // Add patients to the queue
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Define the expected order of patients
        String[] expectedOrder = {"Alice", "John", "Bob"};

        // Check if patients are processed in expected order
        for (String expected : expectedOrder) {
            Assertions.assertEquals(expected, queue.poll().getName());
        }
    }
}
