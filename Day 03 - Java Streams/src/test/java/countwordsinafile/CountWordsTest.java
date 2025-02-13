package countwordsinafile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountWordsTest {

    String filePath = "testFile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("hello world\n");
            writer.write("hello again\n");
            writer.write("and again and again\n");
        }
    }


    @Test
    public void testCountWords() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("hello", 2);
        expectedWordCount.put("world", 1);
        expectedWordCount.put("again", 3);
        expectedWordCount.put("and", 3);

        CountWords.countWords(filePath);

    }
}
