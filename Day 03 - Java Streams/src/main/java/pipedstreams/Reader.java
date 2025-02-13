package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class Reader implements Runnable {
    private PipedInputStream pis;

    public Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("Read: " + message);
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
