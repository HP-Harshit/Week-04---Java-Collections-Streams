package annotations.exercises.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the method manageProject() from ProjectManager class
            Method method = Example.class.getMethod("manageProject");

            // Check if the method is annotated with @BugReport or @BugReports
            if (method.isAnnotationPresent(BugReports.class)) {
                // Retrieve the container annotation
                BugReports bugReports = method.getAnnotation(BugReports.class);

                // Print each bug report
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Report: " + bugReport.description());
                }
            } else if (method.isAnnotationPresent(BugReport.class)) {
                // Retrieve the single bug report annotation (if not using the container)
                BugReport bugReport = method.getAnnotation(BugReport.class);
                System.out.println("Bug Report: " + bugReport.description());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
