package problemsofjunit.basicjunitpracticeproblems.testingstringutilitymethods;

public class StringUtility {
    public static void main(String[] args) {
        String text = "Hello World!";
        System.out.println("String: " + text + "\nReverse string: " + reverseString(text));
        System.out.println("Is palindrome: " + isPalindrome(text));
        System.out.println("To uppercase: " + toUppercase(text));
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to convert a string to uppercase
    public static String toUppercase(String str) {
        return str.toUpperCase();
    }
}
