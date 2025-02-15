package problemsofjunit.basicjunitpracticeproblems.testingstringutilitymethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {
    private StringUtility stringUtility;

    // Setup method to initialize the StringUtility object before each test
    @BeforeEach
    void setup() {
        stringUtility = new StringUtility();
    }

    // Test method for the reverseString method
    @Test
    void reverseStringTest() {
        String text = "Hello World!";
        // Check if the reversed string matches the expected result
        assertEquals("!dlroW olleH", stringUtility.reverseString(text));
    }

    // Test method for the isPalindrome method
    @Test
    void isPalindromeTest() {
        // Check if the method correctly identifies a palindrome
        assertTrue(stringUtility.isPalindrome("abccba"));
        // Check if the method correctly identifies a non-palindrome
        assertFalse(stringUtility.isPalindrome("Hello World!"));
    }

    // Test method for the toUppercase method
    @Test
    void toUppercaseTest() {
        String text = "Hello World!";
        // Check if the method correctly converts the string to uppercase
        assertEquals("HELLO WORLD!", stringUtility.toUppercase(text));
    }
}
