package pipedstreams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PipedStreamTest {

    @Test
    public void testPipedStreams() throws IOException, InterruptedException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);

        // Message to be written
        String messageToWrite = "Hello from Writer!";

        // Create and start the writer thread
        new Thread(() -> {
            try {
                pos.write(messageToWrite.getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // Read the data written by the writer thread
        byte[] buffer = new byte[1024];
        int bytesRead = pis.read(buffer);
        pis.close();
        String message = new String(buffer, 0, bytesRead);

        // Assert that the message read is equal to the message written
        assertEquals(messageToWrite, message);
    }
}
