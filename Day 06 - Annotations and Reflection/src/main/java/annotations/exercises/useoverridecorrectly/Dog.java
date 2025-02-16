package annotations.exercises.useoverridecorrectly;

public class Dog extends Animal {

    // Override the makeSound() method
    @Override
    public void makeSound() {
        System.out.print("Dog barks");
    }
}