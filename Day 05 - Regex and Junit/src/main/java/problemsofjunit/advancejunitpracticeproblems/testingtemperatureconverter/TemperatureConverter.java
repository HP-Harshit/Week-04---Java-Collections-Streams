package problemsofjunit.advancejunitpracticeproblems.testingtemperatureconverter;

public class TemperatureConverter {
    // Main method to demonstrate temperature conversions
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + " Celsius is " + celsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(fahrenheit + " Fahrenheit is " + fahrenheitToCelsius(fahrenheit) + " Celsius");
    }
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
