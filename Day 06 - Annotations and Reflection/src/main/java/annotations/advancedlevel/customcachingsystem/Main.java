package annotations.advancedlevel.customcachingsystem;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create an instance of ExpensiveService
        ExpensiveService service = new ExpensiveService();

        // Compute square of 5 for the first time
        System.out.println("Computing square of 5:");
        System.out.println(CacheHandler.invokeMethod(service, "computeSquare", 5)); // First call

        // Compute square of 5 for the second time (should return cached result)
        System.out.println("Computing square of 5 again:");
        System.out.println(CacheHandler.invokeMethod(service, "computeSquare", 5)); // Cached result

        // Compute square of 6 for the first time
        System.out.println("Computing square of 6:");
        System.out.println(CacheHandler.invokeMethod(service, "computeSquare", 6)); // First call

        // Compute square of 6 for the second time (should return cached result)
        System.out.println("Computing square of 6 again:");
        System.out.println(CacheHandler.invokeMethod(service, "computeSquare", 6)); // Cached result
    }
}
