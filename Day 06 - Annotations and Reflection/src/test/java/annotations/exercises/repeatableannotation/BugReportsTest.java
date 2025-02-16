package annotations.exercises.repeatableannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Method;

public class BugReportsTest {

    @Test
    public void testAnnotations() throws NoSuchMethodException {
        // Get the method manageProject() from ProjectManager class
        Method method = Example.class.getMethod("manageProject");

        // Check if the method is annotated with @BugReports
        assertTrue(method.isAnnotationPresent(BugReports.class));

        // Retrieve the container annotation
        BugReports bugReports = method.getAnnotation(BugReports.class);

        // Verify the number of BugReport annotations
        assertEquals(2, bugReports.value().length);

        // Verify the details of each BugReport annotation
        assertEquals("NullPointerException can occur", bugReports.value()[0].description());
        assertEquals("Performance issue under load", bugReports.value()[1].description());
    }
}
