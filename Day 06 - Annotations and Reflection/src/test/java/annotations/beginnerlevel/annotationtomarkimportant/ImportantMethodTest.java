package annotations.beginnerlevel.annotationtomarkimportant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Method;

public class ImportantMethodTest {

    @Test
    public void testManageProjectAnnotation() throws NoSuchMethodException {
        // Get the method manageProject() from ProjectManager class
        Method method = ProjectManager.class.getMethod("manageProject");

        // Check if the method is annotated with @ImportantMethod
        assertTrue(method.isAnnotationPresent(ImportantMethod.class));

        // Retrieve the annotation
        ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

        // Verify the annotation level
        assertEquals("HIGH", importantMethod.level());
    }

    @Test
    public void testReviewProjectAnnotation() throws NoSuchMethodException {
        // Get the method reviewProject() from ProjectManager class
        Method method = ProjectManager.class.getMethod("reviewProject");

        // Check if the method is annotated with @ImportantMethod
        assertTrue(method.isAnnotationPresent(ImportantMethod.class));

        // Retrieve the annotation
        ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

        // Verify the annotation level
        assertEquals("MEDIUM", importantMethod.level());
    }

    @Test
    public void testCompleteProjectAnnotation() throws NoSuchMethodException {
        // Get the method completeProject() from ProjectManager class
        Method method = ProjectManager.class.getMethod("completeProject");

        // Check if the method is annotated with @ImportantMethod
        assertTrue(!method.isAnnotationPresent(ImportantMethod.class));
    }
}
