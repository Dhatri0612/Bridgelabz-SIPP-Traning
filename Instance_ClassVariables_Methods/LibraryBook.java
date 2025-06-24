public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("C++ Basics", "Bjarne Stroustrup", 350);

        lb.display();
        lb.borrowBook();
        lb.borrowBook();
        lb.display();
    }
}
