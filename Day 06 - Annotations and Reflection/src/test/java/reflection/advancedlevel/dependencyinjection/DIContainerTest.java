package reflection.advancedlevel.dependencyinjection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DIContainerTest {

    @Test
    public void testDependencyInjection() {
        // Create the DI container
        DIContainer container = new DIContainer();

        // Register the classes with the container
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Inject dependencies into ServiceB instance
        ServiceB serviceB = container.injectDependencies(ServiceB.class);

        // Verify that the dependency was injected
        assertNotNull(serviceB.getServiceA(), "ServiceA should be injected into ServiceB");
    }
}
