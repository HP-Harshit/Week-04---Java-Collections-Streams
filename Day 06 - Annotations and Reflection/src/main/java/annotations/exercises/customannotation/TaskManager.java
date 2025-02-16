package annotations.exercises.customannotation;

public class TaskManager {

    // Apply the @TaskInfo annotation to the method
    @TaskInfo(priority = 1, assignedTo = "Alice")
    public void highPriorityTask() {
        System.out.println("High priority task is being executed.");
    }

    // Apply the @TaskInfo annotation to another method
    @TaskInfo(priority = 2, assignedTo = "Bob")
    public void mediumPriorityTask() {
        System.out.println("Medium priority task is being executed.");
    }
}
