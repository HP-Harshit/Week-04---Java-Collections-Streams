package bytearraystream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImageToByteArrayTest {

    String sourceImagePath = "sourceImage.PNG";
    String destImagePath = "destImage.PNG";

    @Test
    public void testImageConversion() {
        try {
            // Convert image file to byte array
            byte[] imageBytes = ImageToByteArray.convertImageToByteArray(sourceImagePath);

            // Write byte array back to image file
            ImageToByteArray.writeByteArrayToImage(imageBytes, destImagePath);

            // Verify that the new file is identical to the original image
            boolean isIdentical = ImageToByteArray.verifyImages(sourceImagePath, destImagePath);
            assertTrue(isIdentical, "The new image file should be identical to the original image");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
