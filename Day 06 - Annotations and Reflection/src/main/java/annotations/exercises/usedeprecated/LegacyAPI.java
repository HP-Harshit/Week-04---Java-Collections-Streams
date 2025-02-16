package annotations.exercises.usedeprecated;

public class LegacyAPI {

    // Mark the oldFeature() method as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.print("This is the old feature.");
    }

    // Define the newFeature() method
    public void newFeature() {
        System.out.print("This is the new feature.");
    }
}
