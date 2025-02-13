package readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserinput {
    public static void main(String[] args) {

        String userInfo = "userInfo.txt";
        boolean userInput = userInputToFile(userInfo);
    }

    public static boolean userInputToFile(String userInfo){
        // Create BufferedReader to read user input from the console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Ask the user for their name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Ask the user for their age
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            // Ask the user for their favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = reader.readLine();

            // Write the user information to a file
            try (FileWriter writer = new FileWriter(userInfo)) {
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");
                System.out.println("User information saved to file.");
                return true;
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
                e.printStackTrace();
                return false;
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading user input: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
            e.printStackTrace();
            return false;
        }
    }
}
