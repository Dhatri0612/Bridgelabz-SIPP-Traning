public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // MAIN METHOD to run and test the class
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 8.5);
        
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Name: " + s1.name);
        System.out.println("CGPA: " + s1.getCGPA());

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
    }
}
