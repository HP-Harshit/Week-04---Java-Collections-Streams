package reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        try {
            // Access the private method multiply using reflection
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            // Invoke the private method multiply and display the result
            int result = (int) multiplyMethod.invoke(calculator, 3, 4);
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
