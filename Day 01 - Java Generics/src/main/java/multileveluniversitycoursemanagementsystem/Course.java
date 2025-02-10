package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Generic class representing a course with a type parameter T that extends CourseType
public class Course<T extends CourseType> {

    List<T> courses;  // List to store courses of type T

    // Constructor to initialize the courses list
    public Course() {
        courses = new ArrayList<>();
    }

    // Method to add a course to the list
    public void addCourse(T course) {
        courses.add(course);
    }

    // Method to retrieve the list of courses
    public List<T> getCourses() {
        return courses;
    }
}
