package multileveluniversitycoursemanagementsystem;

// Class representing an Exam Course that extends the CourseType class
public class ExamCourse extends CourseType {

    // Constructor to initialize the exam course with its name
    public ExamCourse(String courseName) {
        super(courseName);
    }

    // Method to display the evaluation details of the exam course
    @Override
    public void evaluation() {
        System.out.println(getCourseName() + " is evaluated through exams.");
    }
}
