package reflection.intermediatelevel.dynamicmethodinvocation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    public void testDynamicMethodInvocation() throws Exception {
        MathOperations mathOps = new MathOperations();

        // Test the add method
        Method addMethod = MathOperations.class.getMethod("add", int.class, int.class);
        int addResult = (int) addMethod.invoke(mathOps, 5, 3);
        assertEquals(8, addResult, "The result of add(5, 3) should be 8");

        // Test the subtract method
        Method subtractMethod = MathOperations.class.getMethod("subtract", int.class, int.class);
        int subtractResult = (int) subtractMethod.invoke(mathOps, 5, 3);
        assertEquals(2, subtractResult, "The result of subtract(5, 3) should be 2");

        // Test the multiply method
        Method multiplyMethod = MathOperations.class.getMethod("multiply", int.class, int.class);
        int multiplyResult = (int) multiplyMethod.invoke(mathOps, 5, 3);
        assertEquals(15, multiplyResult, "The result of multiply(5, 3) should be 15");
    }
}
