package reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();

        // Accept method name and parameters from the user
        System.out.println("Enter the method name (add, subtract, multiply):");
        String methodName = scanner.nextLine();
        System.out.println("Enter the first parameter:");
        int param1 = scanner.nextInt();
        System.out.println("Enter the second parameter:");
        int param2 = scanner.nextInt();

        try {
            // Get the method based on user input
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically and get the result
            int result = (int) method.invoke(mathOps, param1, param2);

            // Display the result
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

