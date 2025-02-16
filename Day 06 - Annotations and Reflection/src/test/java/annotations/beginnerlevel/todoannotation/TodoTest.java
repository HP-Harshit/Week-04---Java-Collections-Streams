package annotations.beginnerlevel.todoannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Method;

public class TodoTest {

    @Test
    public void testImplementLoginAnnotation() throws NoSuchMethodException {
        // Get the method implementLogin() from ProjectManager class
        Method method = ProjectManager.class.getMethod("implementLogin");

        // Check if the method is annotated with @Todo
        assertTrue(method.isAnnotationPresent(Todo.class));

        // Retrieve the annotation
        Todo todo = method.getAnnotation(Todo.class);

        // Verify the annotation details
        assertEquals("Implement the login feature", todo.task());
        assertEquals("Alice", todo.assignedTo());
        assertEquals("HIGH", todo.priority());
    }

    @Test
    public void testOptimizeDatabaseAnnotation() throws NoSuchMethodException {
        // Get the method optimizeDatabase() from ProjectManager class
        Method method = ProjectManager.class.getMethod("optimizeDatabase");

        // Check if the method is annotated with @Todo
        assertTrue(method.isAnnotationPresent(Todo.class));

        // Retrieve the annotation
        Todo todo = method.getAnnotation(Todo.class);

        // Verify the annotation details
        assertEquals("Optimize the database", todo.task());
        assertEquals("Bob", todo.assignedTo());
        assertEquals("MEDIUM", todo.priority());
    }

    @Test
    public void testWriteUnitTestsAnnotation() throws NoSuchMethodException {
        // Get the method writeUnitTests() from ProjectManager class
        Method method = ProjectManager.class.getMethod("writeUnitTests");

        // Check if the method is annotated with @Todo
        assertTrue(method.isAnnotationPresent(Todo.class));

        // Retrieve the annotation
        Todo todo = method.getAnnotation(Todo.class);

        // Verify the annotation details
        assertEquals("Write unit tests for new features", todo.task());
        assertEquals("Charlie", todo.assignedTo());
        assertEquals("LOW", todo.priority());
    }
}
