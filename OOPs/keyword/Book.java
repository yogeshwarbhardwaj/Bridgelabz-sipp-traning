public class Book {
    // Static variable shared across all books
    private static String libraryName;

    // Final variable to ensure ISBN cannot be changed once assigned
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' to initialize instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Setter for static variable libraryName
    public static void setLibraryName(String libraryName) {
        Book.libraryName = libraryName;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {
        // Set the static variable
        Book.setLibraryName("Central Library");

        // Create a book object
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Verify if object is an instance of Book
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        // Display the library name
        Book.displayLibraryName();
    }
}