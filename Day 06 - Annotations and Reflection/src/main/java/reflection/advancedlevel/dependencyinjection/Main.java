package reflection.advancedlevel.dependencyinjection;

public class Main {

    public static void main(String[] args) {
        // Create the DI container
        DIContainer container = new DIContainer();

        // Register the classes with the container
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Inject dependencies into ServiceB instance
        ServiceB serviceB = container.injectDependencies(ServiceB.class);

        // Execute the method to see if dependencies are injected
        serviceB.execute();
    }
}
