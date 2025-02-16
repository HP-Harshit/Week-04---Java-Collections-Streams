package annotations.exercises.customannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Method;

public class TaskManagerTest {

    @Test
    public void testHighPriorityTaskAnnotation() throws NoSuchMethodException {
        // Get the method highPriorityTask() from TaskManager class
        Method method = TaskManager.class.getMethod("highPriorityTask");

        // Check if the method is annotated with @TaskInfo
        assertTrue(method.isAnnotationPresent(TaskInfo.class));

        // Retrieve the annotation
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Verify the annotation details
        assertEquals(1, taskInfo.priority());
        assertEquals("Alice", taskInfo.assignedTo());
    }

    @Test
    public void testMediumPriorityTaskAnnotation() throws NoSuchMethodException {
        // Get the method mediumPriorityTask() from TaskManager class
        Method method = TaskManager.class.getMethod("mediumPriorityTask");

        // Check if the method is annotated with @TaskInfo
        assertTrue(method.isAnnotationPresent(TaskInfo.class));

        // Retrieve the annotation
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Verify the annotation details
        assertEquals(2, taskInfo.priority());
        assertEquals("Bob", taskInfo.assignedTo());
    }
}
