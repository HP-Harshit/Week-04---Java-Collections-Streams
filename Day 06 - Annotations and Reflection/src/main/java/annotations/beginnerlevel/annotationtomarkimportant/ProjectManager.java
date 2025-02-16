package annotations.beginnerlevel.annotationtomarkimportant;

public class ProjectManager {

    @ImportantMethod
    public void manageProject() {
        System.out.println("Managing project...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void reviewProject() {
        System.out.println("Reviewing project...");
    }

    public void completeProject() {
        System.out.println("Completing project...");
    }
}
