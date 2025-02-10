package multileveluniversitycoursemanagementsystem;

// Abstract class representing a general course type
abstract class CourseType {

    String courseName;  // Name of the course

    // Constructor to initialize the course with its name
    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    // Getter method to retrieve the name of the course
    public String getCourseName() {
        return courseName;
    }

    // Abstract method to display the evaluation details of the course, to be implemented by subclasses
    public abstract void evaluation();
}
