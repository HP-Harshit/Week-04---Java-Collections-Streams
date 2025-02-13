package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAndRetrieveObject {
    public static void main(String[] args) {
        // Serialize the list of employees
        if (serialization()) {
            System.out.println("Serialization successful.");
        } else {
            System.out.println("Serialization failed.");
        }

        // Deserialize the list of employees
        System.out.println();
        if (deserialization()) {
            System.out.println("Deserialization successful.");
        } else {
            System.out.println("Deserialization failed.");
        }
    }

    // Method to serialize the list of employees to a file
    public static boolean serialization() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "HR", 50000));
        employees.add(new Employee(2, "Smith", "IT", 60000));
        employees.add(new Employee(3, "Alice", "Finance", 55000));

        // Serialize the employees list to a file named "employees.ser"
        try (FileOutputStream fos = new FileOutputStream("employees.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employees); // Write the list of employees to the file
            System.out.println("Employees have been serialized to employees.ser");

            return true;

        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Method to deserialize the list of employees from a file
    public static boolean deserialization() {
        // Deserialize the employees list from the file named "employees.ser"
        try (FileInputStream fis = new FileInputStream("employees.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            List<Employee> employees = (List<Employee>) ois.readObject(); // Read the list of employees from the file
            System.out.println("Employees have been deserialized:");
            for (Employee employee : employees) {
                System.out.println(employee); // Print each employee's information
            }
            return true;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
