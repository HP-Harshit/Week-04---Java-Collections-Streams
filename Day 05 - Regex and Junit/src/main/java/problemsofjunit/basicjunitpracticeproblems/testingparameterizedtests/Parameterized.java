package problemsofjunit.basicjunitpracticeproblems.testingparameterizedtests;

public class Parameterized {
    // Main method to demonstrate the isEven method
    public static void main(String[] args) {
        // Test the isEven method with various numbers and print the results
        System.out.println("Is 2 even?\t" + isEven(2));
        System.out.println("Is 4 even?\t" + isEven(4));
        System.out.println("Is 6 even?\t" + isEven(6));
        System.out.println("Is 7 even?\t" + isEven(7));
        System.out.println("Is 9 even?\t" + isEven(9));
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        // Use bitwise AND to check if the number is even
        if ((number & 1) == 0) {
            return true;
        }
        return false;
    }
}
