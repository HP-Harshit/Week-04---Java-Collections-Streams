package reflection.advancedlevel.dependencyinjection;

public class ServiceB {

    @Inject
    private ServiceA serviceA;

    public void execute() {
        serviceA.performService();
    }

    // Getter for ServiceA (for testing purposes)
    public ServiceA getServiceA() {
        return serviceA;
    }
}
