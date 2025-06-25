class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James Gosling", "ISBN001");
        Book book2 = new Book("Python Guide", "Guido van Rossum", "ISBN002");

        book1.displayDetails();
        book2.displayDetails();
        Book.displayLibraryName();
    }
}
