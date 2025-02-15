package problemsofregex.advancedproblems.validateanipaddress;

import java.util.regex.*;

public class IPAddressValidation {
    // Main method to demonstrate IP address validation
    public static void main(String[] args) {
        // Define the list of IP addresses to validate
        String[] ipAddresses = {"192.168.1.1", "256.256.256.256", "123.321.0.12", "0.0.0.255", "255.255.255.124"};

        // Iterate through the IP addresses and validate each one
        for (String ip : ipAddresses) {
            // Validate the IP address and print the result
            System.out.println(ip + " is valid: " + isValidIPAddress(ip));
        }
    }

    // Method to validate an IPv4 address
    public static boolean isValidIPAddress(String ip) {
        // Define the regular expression for validating an IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)){3}$";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the IP address against the pattern
        return pattern.matcher(ip).matches();
    }
}
