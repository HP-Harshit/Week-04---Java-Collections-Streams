package multileveluniversitycoursemanagementsystem;

// Class representing an Assignment Course that extends the CourseType class
public class AssignmentCourse extends CourseType {

    // Constructor to initialize the assignment course with its name
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    // Method to display the evaluation details of the assignment course
    @Override
    public void evaluation() {
        System.out.println(getCourseName() + " is evaluated through assignment.");
    }
}
