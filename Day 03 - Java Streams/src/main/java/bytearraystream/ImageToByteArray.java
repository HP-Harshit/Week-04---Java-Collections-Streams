package bytearraystream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String sourceImagePath = "sourceImage.PNG";
        String destImagePath = "destImage.PNG";

        try {
            // Convert image file to byte array
            byte[] imageBytes = convertImageToByteArray(sourceImagePath);

            // Write byte array back to image file
            writeByteArrayToImage(imageBytes, destImagePath);

            // Verify that the new file is identical to the original image
            boolean isIdentical = verifyImages(sourceImagePath, destImagePath);
            if (isIdentical) {
                System.out.println("The new image file is identical to the original image.");
            } else {
                System.out.println("The new image file is not identical to the original image.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to convert image file to byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Method to write byte array to image file
    public static void writeByteArrayToImage(byte[] imageBytes, String imagePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(imagePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Method to verify if two images are identical
    public static boolean verifyImages(String imagePath1, String imagePath2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(imagePath1);
             FileInputStream fis2 = new FileInputStream(imagePath2)) {

            byte[] buffer1 = new byte[4096];
            byte[] buffer2 = new byte[4096];
            int bytesRead1, bytesRead2;
            while ((bytesRead1 = fis1.read(buffer1)) != -1 && (bytesRead2 = fis2.read(buffer2)) != -1) {
                if (bytesRead1 != bytesRead2 || !java.util.Arrays.equals(buffer1, buffer2)) {
                    return false;
                }
            }
            return fis1.read() == -1 && fis2.read() == -1; // Ensure both files are of the same length
        }
    }
}
