public class ques10{
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMiles3 = volumeKm3 * conversionFactor;
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
    }
}
