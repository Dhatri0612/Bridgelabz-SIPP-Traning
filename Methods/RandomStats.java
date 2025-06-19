import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + rand.nextInt(9000); // Generates 4-digit numbers (1000–9999)
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.print("Generated 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
