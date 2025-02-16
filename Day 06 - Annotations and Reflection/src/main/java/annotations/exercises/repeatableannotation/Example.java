package annotations.exercises.repeatableannotation;

public class Example {

    @BugReport(description = "NullPointerException can occur")
    @BugReport(description = "Performance issue under load")
    public void manageProject() {
        System.out.println("Testing...");
    }
}
