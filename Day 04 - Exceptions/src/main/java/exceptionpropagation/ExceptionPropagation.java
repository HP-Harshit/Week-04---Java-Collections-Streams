package exceptionpropagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            // Call method2() which calls method1() and propagates the exception
            method2();
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException in the main method
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }

    // Method that throws an ArithmeticException
    public static void method1() {
        // Throw an ArithmeticException (10 / 0)
        int result = 10 / 0;
    }

    // Method that calls method1()
    public static void method2() {
        // Call method1() which will throw an ArithmeticException
        method1();
    }
}
