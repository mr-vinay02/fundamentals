package objectorientedprogramming.librarymanagment;

public class LibraryManagment {

    public static void main(String[] args) {
        Library library = new Library(5);

        // Add books
        library.addBook(new Book("Java Basics", "James Gosling",false));
        library.addBook(new Book("Python 101", "Guido van Rossum",true));
        library.addBook(new Book("C++ Guide", "Bjarne Stroustrup",true));

        // List available books
        library.listAvailableBooks();

        // Issue a book
        library.issueBook("Python 101");

        // Try issuing same book again
        library.issueBook("Python 101");

        // Return a book
        library.returnBook("Python 101");

        // List available books
        library.listAvailableBooks();
    }

}
