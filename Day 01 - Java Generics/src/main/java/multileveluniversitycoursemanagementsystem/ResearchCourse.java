package multileveluniversitycoursemanagementsystem;

// Class representing a Research Course that extends the CourseType class
public class ResearchCourse extends CourseType {

    // Constructor to initialize the research course with its name
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    // Method to display the evaluation details of the research course
    @Override
    public void evaluation() {
        System.out.println(getCourseName() + " is evaluated through research.");
    }
}
