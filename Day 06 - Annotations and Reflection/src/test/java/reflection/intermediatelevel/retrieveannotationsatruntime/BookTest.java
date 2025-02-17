package reflection.intermediatelevel.retrieveannotationsatruntime;

import org.junit.jupiter.api.Test;
import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testRetrieveAuthorAnnotation() throws Exception {
        // Load the Book class
        Class<?> bookClass = Class.forName("reflection.intermediatelevel.retrieveannotationsatruntime.Book");

        // Check if the @Author annotation is present
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Get the @Author annotation
            Annotation annotation = bookClass.getAnnotation(Author.class);
            Author author = (Author) annotation;

            // Verify the annotation value
            assertEquals("Alice", author.name(), "Author name should be 'Alice'");
        } else {
            throw new Exception("@Author annotation is not present.");
        }
    }
}

