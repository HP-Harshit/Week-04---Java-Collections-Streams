package reflection.basiclevel.accessprivatefield;

public class Person {

    // Private field age
    private int age;

    // Constructor to initialize age
    public Person(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
