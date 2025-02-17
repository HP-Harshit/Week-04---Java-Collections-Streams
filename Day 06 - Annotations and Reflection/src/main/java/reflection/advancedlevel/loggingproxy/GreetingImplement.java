package reflection.advancedlevel.loggingproxy;

public class GreetingImplement implements Greeting{

    @Override
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
