import java.util.Scanner;

public class Q40{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics Marks: ");
        double physicsMarks = sc.nextDouble();
        System.out.print("Enter Chemistry Marks: ");
        double chemistryMarks = sc.nextDouble();
        System.out.print("Enter Maths Marks: ");
        double mathsMarks = sc.nextDouble();

        double averageMark = (physicsMarks + chemistryMarks + mathsMarks) / 3;

        String grade;
        String remarks;

        if (averageMark >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (averageMark >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (averageMark >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (averageMark >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (averageMark >= 40) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        System.out.println("Average Mark: " + averageMark + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}