public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return dailyRate * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Mike", "Hyundai i20", 4);

        cr.display();
    }
}
