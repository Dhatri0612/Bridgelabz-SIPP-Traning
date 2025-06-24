// Class name is public and matches the filename Book2.java
public class Book2 {

    public String ISBN;      // Public variable accessible everywhere
    protected String title;  // Protected variable accessible within package and subclasses
    private String author;   // Private variable accessible only within this class

    // Constructor to initialize book details
    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter method for author
    public String getAuthor() {
        return author;
    }

    // Public setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // MAIN METHOD to run and test the class
    public static void main(String[] args) {
        // Creating Book2 object with details
        Book2 b = new Book2("1234", "Java Basics", "James");

        // Accessing and displaying details
        System.out.println("ISBN: " + b.ISBN);  // public accessible directly
        System.out.println("Title: " + b.title);  // protected accessible directly within same class
        System.out.println("Author: " + b.getAuthor());  // private accessed via getter
    }
}
