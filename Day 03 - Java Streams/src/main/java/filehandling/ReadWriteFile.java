package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
    public static void main(String[] args) {
        String sourceFile = "readFile.txt";
        String destFile = "writeFile.txt";

        System.out.println(copyFile(sourceFile, destFile) ? "File copied successfully." : "File not Copied");
    }

    public static boolean copyFile(String sourceFile, String destFile){
        // Use try-with-resources to ensure that the file streams are closed properly
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            // Variable to store the byte data read from the file
            int byteData;

            // Read each byte from the source file and write it to the destination file
            while ((byteData = fis.read()) != -1) {
                // Write the byte data to the destination file
                fos.write(byteData);
            }

            return true;
        } catch (IOException e) {
            // Handle the exception if any I/O error occurs
            System.out.println("An error occurred while processing the files: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
