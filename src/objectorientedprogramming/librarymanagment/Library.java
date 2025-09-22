package objectorientedprogramming.librarymanagment;

public class Library {

    private Book[] books;
    private int count;

    // Constructor
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Issue a book by title
    public void issueBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].issueBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Return a book by title
    public void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // List available books
    public void listAvailableBooks() {
        System.out.println("Available Books:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (!books[i].isIssued()) {
                books[i].showDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }

}
