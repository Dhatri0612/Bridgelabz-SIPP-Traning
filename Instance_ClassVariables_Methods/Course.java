public class Course {
    String courseName;           // Instance variable for course name
    String duration;             // Instance variable for course duration
    double fee;                  // Instance variable for course fee
    static String instituteName = "ABC Institute"; // Class variable shared by all courses

    // Constructor to initialize course details
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + ", Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method to update the institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", "3 Months", 15000);
        c1.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("XYZ Academy");

        Course c2 = new Course("Python", "2 Months", 12000);
        c2.displayCourseDetails();
    }
}
