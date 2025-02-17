package reflection.basiclevel.dynamicallycreateobjects;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testCreateStudentInstance() throws Exception {
        // Load the Student class
        Class<?> studentClass = Class.forName("reflection.basiclevel.dynamicallycreateobjects.Student");

        // Get the no-argument constructor
        Constructor<?> constructor = studentClass.getDeclaredConstructor();

        // Create a new instance of the Student class using the constructor
        Student student = (Student) constructor.newInstance();

        // Set the fields using setter methods
        student.setName("Alice");
        student.setAge(20);

        // Verify the fields
        assertEquals("Alice", student.getName(), "Student name should be 'Alice'");
        assertEquals(20, student.getAge(), "Student age should be 20");
    }
}
