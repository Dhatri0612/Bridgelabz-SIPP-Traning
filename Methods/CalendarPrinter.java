import java.util.Scanner;

public class CalendarPrinter {

    // 1. Month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // 2. Days in months (default)
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // 3. Check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // 4. Get days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // 5. Get starting day of the month using Zeller's Congruence
    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    // 6. Print calendar
    public static void printCalendar(int month, int year) {
        int startDay = getStartDay(month, year);
        int days = getDaysInMonth(month, year);

        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print all days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println(); // Next line after Saturday
        }
        System.out.println();
    }

    // 7. Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}
