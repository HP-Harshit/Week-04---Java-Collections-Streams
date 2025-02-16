package annotations.beginnerlevel.todoannotation;

public class ProjectManager {

    @Todo(task = "Implement the login feature", assignedTo = "Alice", priority = "HIGH")
    public void implementLogin() {
        System.out.println("Implementing login...");
    }

    @Todo(task = "Optimize the database", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing database...");
    }

    @Todo(task = "Write unit tests for new features", assignedTo = "Charlie", priority = "LOW")
    public void writeUnitTests() {
        System.out.println("Writing unit tests...");
    }
}
