class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Cannot remove more than available quantity.");
        }
    }

    void displayTotalCost() {
        System.out.println("Total cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);
        cart.displayTotalCost();
        cart.addItem(2);
        cart.displayTotalCost();
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
