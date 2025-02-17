package reflection.intermediatelevel.retrieveannotationsatruntime;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        try {
            // Load the Book class
            Class<?> bookClass = Class.forName("reflection.intermediatelevel.retrieveannotationsatruntime.Book");

            // Check if the @Author annotation is present
            if (bookClass.isAnnotationPresent(Author.class)) {
                // Get the @Author annotation
                Annotation annotation = bookClass.getAnnotation(Author.class);
                Author author = (Author) annotation;

                // Display the annotation value
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("@Author annotation is not present.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

