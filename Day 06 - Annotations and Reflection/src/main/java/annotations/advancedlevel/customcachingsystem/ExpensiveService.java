package annotations.advancedlevel.customcachingsystem;

public class ExpensiveService {

    @CacheResult
    public int computeSquare(int number) {
        // Simulate a computationally expensive operation
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }
}
