package readuserinputfromconsole;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadUserinputTest {

    @Test
    void testUserInput(){
        // Define a file path
        String userInfo = "userInfoTest.txt";

        // Call the main method to perform file copy
        assertTrue(ReadUserinput.userInputToFile(userInfo));

        // Check if the destination file exists
        File userInfoFile = new File(userInfo);
        assertTrue(userInfoFile.exists(), "Destination file should exist");

        // Clean up test files
        new File(userInfo).delete();
    }
}
