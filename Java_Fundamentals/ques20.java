import java.util.Scanner;

public class ques20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from FromCity to ViaCity (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from ViaCity to FinalCity (in miles): ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time from FromCity to ViaCity (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter time from ViaCity to FinalCity (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes.");
        sc.close();

    }
}
