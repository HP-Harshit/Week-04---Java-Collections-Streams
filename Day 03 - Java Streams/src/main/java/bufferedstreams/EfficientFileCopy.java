package bufferedstreams;

import java.io.*;

public class EfficientFileCopy {
    public static void main(String[] args) {
        String sourceFile = "readFileEfficiently.txt";
        String destBufferedFile = "writeBufferedFileEfficiently.txt";
        String destUnbufferedFile = "writeUnbufferedFileEfficiently.txt";

        // Measure execution time for buffered file copy
        long bufferedStart = System.nanoTime();
        boolean isBufferedCopied = efficientFileCopy(sourceFile, destBufferedFile);
        long bufferedEnd = System.nanoTime();

        // Measure execution time for unbuffered file copy
        long unbufferedStart = System.nanoTime();
        boolean isUnbufferedCopied = unbufferedFileCopy(sourceFile, destUnbufferedFile);
        long unbufferedEnd = System.nanoTime();

        // Print the results
        if (isBufferedCopied) {
            System.out.println("Buffered file copied successfully.");
            System.out.println("Buffered execution time: " + (bufferedEnd - bufferedStart) + " ns");
        }

        if (isUnbufferedCopied) {
            System.out.println("Unbuffered file copied successfully.");
            System.out.println("Unbuffered execution time: " + (unbufferedEnd - unbufferedStart) + " ns");
        }

        // Compare execution times
        long bufferedTime = bufferedEnd - bufferedStart;
        long unbufferedTime = unbufferedEnd - unbufferedStart;
        System.out.println("\nBuffered execution time: " + bufferedTime + " ns");
        System.out.println("Unbuffered execution time: " + unbufferedTime + " ns");
        System.out.println("Buffered streams are " + (unbufferedTime - bufferedTime) + " ns faster.");
    }

    // Method to copy file using buffered streams
    public static boolean efficientFileCopy(String sourceFile, String destFile) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096]; // Buffer size of 4 KB
            int bytesRead;

            // Read and write file data in chunks
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to copy file using unbuffered streams
    public static boolean unbufferedFileCopy(String sourceFile, String destFile) {
        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[4096]; // Buffer size of 4 KB
            int bytesRead;

            // Read and write file data in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
