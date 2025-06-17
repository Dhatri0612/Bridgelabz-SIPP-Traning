import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flatArray = new int[rows * cols];
        int index = 0;

        System.out.println("Enter elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < flatArray.length; i++) {
            System.out.print(flatArray[i] + " ");
        }
    }
}
