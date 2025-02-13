package filterstream;

import java.io.*;

public class UpperToLowerCase {
    public static void main(String[] args) {
        String sourceFilePath = "sourceText.txt";
        String destFilePath = "destText.txt";

        boolean isConverted = upperToLowerCase(sourceFilePath, destFilePath);

        if(isConverted){
            System.out.println("Source file converted to UpperCase to LowerCase.");
        }
    }

    public static boolean upperToLowerCase(String sourceFilePath, String destFilePath){
        // Convert uppercase letters to lowercase and write to another file
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFilePath))) {

            int charData;
            while ((charData = reader.read()) != -1) {
                // Convert uppercase letters to lowercase
                char lowerChar = Character.toLowerCase((char) charData);
                // Write the character to the destination file
                writer.write(lowerChar);
            }

            System.out.println("Conversion completed successfully.");
            return true;

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
            return true;
        }
    }
}
