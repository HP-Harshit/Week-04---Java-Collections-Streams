package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            // Connect the piped input and output streams
            pis.connect(pos);

            // Create and start the writer thread
            new Thread(new Writer(pos)).start();

            // Create and start the reader thread
            new Thread(new Reader(pis)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
