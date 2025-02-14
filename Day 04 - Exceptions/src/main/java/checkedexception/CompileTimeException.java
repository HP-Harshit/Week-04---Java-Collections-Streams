package checkedexception;

import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
    public static void main(String[] args) {
        // Declare file path existingFile
        String existingFile = "existingFile.txt";

        // Declare file path nonExistingFile
        String nonExistingFile = "nonExistingFile.txt";

        // Call the readFile method to read existingFile
        System.out.println("Reading existing file");
        readFile(existingFile);
        System.out.println();

        // Call the readFile method to read nonExistingFile
        System.out.println("Reading non-existing file");
        readFile(nonExistingFile);
    }

    // Method to read file content from the given file path
    public static boolean readFile(String filePath){
        // Use try-with-resources to ensure FileReader is closed automatically
        try(FileReader fr = new FileReader(filePath)){
            // Variable to store byte data read from the file
            int byteData;

            // Loop to read and print file content character by character
            while((byteData = fr.read()) != -1){
                System.out.print((char)byteData); // Print each character
            }

            // Return true if file is read successfully
            return true;
        } catch (IOException e) {
            // Handle file not found exception and print error message
            System.out.println("File not found: " + e.getMessage());

            // Return false if an IOException occurs
            return false;
        }
    }
}
