package reflection.basiclevel.getclassinformation;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testClassInfoExtraction() throws Exception {
        // Capture the system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method to extract class info
        Main.main(new String[] {"reflection.basiclevel.getclassinformation.ExampleClass"});

        // Get the output as a string
        String output = outContent.toString();

        // Verify class name
        assertTrue(output.contains("Class Name: reflection.basiclevel.getclassinformation.ExampleClass"));

        // Verify methods
        assertTrue(output.contains("public java.lang.String reflection.basiclevel.getclassinformation.ExampleClass.getName()"));
        assertTrue(output.contains("public void reflection.basiclevel.getclassinformation.ExampleClass.setName(java.lang.String)"));
        assertTrue(output.contains("public int reflection.basiclevel.getclassinformation.ExampleClass.getAge()"));
        assertTrue(output.contains("public void reflection.basiclevel.getclassinformation.ExampleClass.setAge(int)"));
        assertTrue(output.contains("public void reflection.basiclevel.getclassinformation.ExampleClass.displayInfo()"));

        // Verify fields
        assertTrue(output.contains("private java.lang.String reflection.basiclevel.getclassinformation.ExampleClass.name"));
        assertTrue(output.contains("private int reflection.basiclevel.getclassinformation.ExampleClass.age"));

        // Verify constructors
        assertTrue(output.contains("public reflection.basiclevel.getclassinformation.ExampleClass()"));
        assertTrue(output.contains("public reflection.basiclevel.getclassinformation.ExampleClass(java.lang.String,int)"));
    }
}

