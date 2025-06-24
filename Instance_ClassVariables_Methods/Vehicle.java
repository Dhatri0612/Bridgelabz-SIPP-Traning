public class Vehicle {
    String ownerName;         // Instance variable for owner's name
    String vehicleType;       // Instance variable for vehicle type
    static double registrationFee = 5000.0; // Class variable for common registration fee

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        Vehicle v2 = new Vehicle("Alice", "Bike");
        v2.displayVehicleDetails();
    }
}
