public class NumberChecker5 {

    // 1. Method to find count of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // 2. Method to store digits into an array
    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // 3. Check Duck Number (has zero but not at the beginning)
    public static boolean isDuckNumber(int number) {
        String str = String.valueOf(number);
        return str.contains("0");
    }

    // 4. Check Armstrong Number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int count = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        return sum == number;
    }

    // 5. Largest and Second Largest in digits
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // 6. Smallest and Second Smallest in digits
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 153; // change to test other numbers
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nDuck Number? " + isDuckNumber(number));
        System.out.println("Armstrong Number? " + isArmstrong(number));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
