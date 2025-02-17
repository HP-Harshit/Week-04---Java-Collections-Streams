package reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        String className = "reflection.basiclevel.dynamicallycreateobjects.Student";
        try {
            // Load the Student class
            Class<?> studentClass = Class.forName(className);

            // Get the no-argument constructor
            Constructor<?> constructor = studentClass.getDeclaredConstructor();

            // Create a new instance of the Student class using the constructor
            Student student = (Student) constructor.newInstance();;

            // Set the fields using setter methods
            student.setName("Alice");
            student.setAge(20);

            // Display the student details
            System.out.println(student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
