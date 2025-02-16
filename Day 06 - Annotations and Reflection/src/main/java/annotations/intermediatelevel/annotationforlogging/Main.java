package annotations.intermediatelevel.annotationforlogging;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ProjectManager
        ProjectManager projectManager = new ProjectManager();

        // Log execution time for methods annotated with @LogExecutionTime
        try {
            MethodExecutionLogger.logExecutionTime(projectManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
