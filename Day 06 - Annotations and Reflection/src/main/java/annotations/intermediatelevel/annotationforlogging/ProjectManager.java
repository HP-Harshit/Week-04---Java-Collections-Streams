package annotations.intermediatelevel.annotationforlogging;

public class ProjectManager {

    @LogExecutionTime
    public void performTaskA() {
        System.out.println("Task A completed");
    }

    @LogExecutionTime
    public void performTaskB() {
        System.out.println("Task B completed");
    }

    @LogExecutionTime
    public void performTaskC() {
        System.out.println("Task C completed");
    }
}
