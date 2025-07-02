import java.util.Scanner;

public class StudentGrades2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[][] studentData = new String[numStudents][8];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");

            double physicsMarks = getValidMarks(scanner, "Physics");
            double chemistryMarks = getValidMarks(scanner, "Chemistry");
            double mathsMarks = getValidMarks(scanner, "Maths");

            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double totalPercentage = (totalMarks / 300.0) * 100.0;

            studentData[i][0] = String.format("%.2f", physicsMarks);
            studentData[i][1] = String.format("%.2f", chemistryMarks);
            studentData[i][2] = String.format("%.2f", mathsMarks);
            studentData[i][3] = String.format("%.2f", totalPercentage);

            studentData[i][4] = calculateGrade(physicsMarks);
            studentData[i][5] = calculateGrade(chemistryMarks);
            studentData[i][6] = calculateGrade(mathsMarks);

            studentData[i][7] = calculateOverallGrade(totalPercentage);
        }

        System.out.println("\n\n--- Student Performance Summary ---");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-15s %-15s %-15s %-15s%n",
                "Student", "Phy Marks", "Chem Marks", "Math Marks", "Total %", "Phy Grade", "Chem Grade", "Math Grade", "Overall Grade");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s %-15s %-15s %-15s %-15s %-15s%n",
                    "S" + (i + 1), studentData[i][0], studentData[i][1], studentData[i][2],
                    studentData[i][3] + "%", studentData[i][4], studentData[i][5],
                    studentData[i][6], studentData[i][7]);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        scanner.close();
    }

    public static double getValidMarks(Scanner scanner, String subjectName) {
        double marks;
        while (true) {
            System.out.print("Enter " + subjectName + " marks (0-100): ");
            if (scanner.hasNextDouble()) {
                marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) {
                    return marks;
                } else {
                    System.out.println("Invalid input. Marks must be between 0 and 100. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value for marks.");
                scanner.next();
            }
        }
    }

    public static String calculateGrade(double marks) {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else if (marks >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String calculateOverallGrade(double percentage) {
        return calculateGrade(percentage);
    }
}