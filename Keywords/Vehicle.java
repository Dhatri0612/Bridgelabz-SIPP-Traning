class Vehicle {
    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Suresh", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Sunita", "Bike", "MH14XY5678");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000);
        System.out.println("\nUpdated Registration Fee:");
        v1.displayDetails();
    }
}
