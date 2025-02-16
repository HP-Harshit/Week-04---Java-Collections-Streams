package annotations.exercises.useoverridecorrectly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DogTest {

    @Test
    public void testMakeSound() {
        Dog myDog = new Dog(); // Create an instance of Dog

        // Capture the output of makeSound() method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the makeSound() method
        myDog.makeSound();

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Dog barks"; // Expected output
        assertEquals(expectedOutput, outContent.toString()); // Compare the output with expected
    }
}
