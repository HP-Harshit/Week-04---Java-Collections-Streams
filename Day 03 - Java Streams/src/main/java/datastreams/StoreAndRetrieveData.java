package datastreams;

import java.io.*;

public class StoreAndRetrieveData {
    public static void main(String[] args) {
        String filePath = "studentDetails.dat";

        // Store student details in the binary file
        boolean isStored = storeStudentDetails(filePath);
        if (isStored) {
            System.out.println("Student details stored successfully.");
        } else {
            System.out.println("Failed to store student details.");
        }

        // Retrieve student details from the binary file
        boolean isRetrieved = retrieveStudentDetails(filePath);
        if (isRetrieved) {
            System.out.println("Student details retrieved successfully.");
        } else {
            System.out.println("Failed to retrieve student details.");
        }
    }

    public static boolean storeStudentDetails(String filePath) {
        // Store student details in a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(1); // Roll number
            dos.writeUTF("Alice"); // Name
            dos.writeDouble(3.8); // GPA

            dos.writeInt(2); // Roll number
            dos.writeUTF("Bob"); // Name
            dos.writeDouble(3.5); // GPA

            System.out.println("Student details have been stored in the binary file.");
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public static boolean retrieveStudentDetails(String filePath) {
        // Retrieve student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("---------------");
            }
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
