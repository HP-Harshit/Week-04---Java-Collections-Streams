package reflection.basiclevel.invokeprivatemethod;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testInvokePrivateMethod() throws Exception {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Access the private method multiply using reflection
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        // Invoke the private method multiply and get the result
        int result = (int) multiplyMethod.invoke(calculator, 3, 4);

        // Verify the result of the multiplication
        assertEquals(12, result, "Result of multiplication should be 12");
    }
}
