package pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Writer implements Runnable {
    private PipedOutputStream pos;

    public Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer!";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
