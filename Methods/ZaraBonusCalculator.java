import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate random 5-digit salary and years of service
    public static int[][] generateEmployeeData(int employeeCount) {
        Random rand = new Random();
        int[][] data = new int[employeeCount][2]; // [salary, years of service]

        for (int i = 0; i < employeeCount; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary between 10000 - 99999
            data[i][1] = rand.nextInt(11); // years between 0 - 10
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]

        for (int i = 0; i < n; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            double newSalary = data[i][0] + bonus;

            result[i][0] = Math.round(bonus * 100.0) / 100.0;
            result[i][1] = Math.round(newSalary * 100.0) / 100.0;
        }

        return result;
    }

    // Method to display table and totals
    public static void displayReport(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("\nEmp\tSalary\tService\tBonus\tNewSalary");
        for (int i = 0; i < oldData.length; i++) {
            System.out.println((i + 1) + "\t" + oldData[i][0] + "\t" + oldData[i][1] + "\t" +
                newData[i][0] + "\t" + newData[i][1]);

            totalOld += oldData[i][0];
            totalNew += newData[i][1];
            totalBonus += newData[i][0];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData(10);
        double[][] updated = calculateBonusAndNewSalary(employees);
        displayReport(employees, updated);
    }
}
