public class Product {
    String productName;   // Instance variable for product name
    double price;         // Instance variable for product price
    static int totalProducts = 0; // Class variable shared among all Product objects

    // Constructor to initialize product details
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts count whenever a product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
