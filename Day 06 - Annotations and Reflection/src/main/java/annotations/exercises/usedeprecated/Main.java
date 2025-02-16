package annotations.exercises.usedeprecated;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegacyAPI
        LegacyAPI api = new LegacyAPI();

        // Call the oldFeature() method
        api.oldFeature();
        System.out.println();

        // Call the newFeature() method
        api.newFeature();
    }
}
