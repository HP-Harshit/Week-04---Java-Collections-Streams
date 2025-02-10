package aidrivenresumescreeningsystem;

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        // Creating instances of specific job roles
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        DataScientist ds = new DataScientist("Bob");
        ProductManager pm = new ProductManager("Charlie");

        // Managing resumes using the generic Resume class
        Resume<SoftwareEngineer> seResume = new Resume<>();
        Resume<DataScientist> dsResume = new Resume<>();
        Resume<ProductManager> pmResume = new Resume<>();

        // Adding job roles to a list
        seResume.addResumes(se);
        dsResume.addResumes(ds);
        pmResume.addResumes(pm);

        // Displaying all resumes
        Utility.displayAllResumes(seResume.getResumes());
        Utility.displayAllResumes(dsResume.getResumes());
        Utility.displayAllResumes(pmResume.getResumes());
    }
}
