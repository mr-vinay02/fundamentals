package objectorientedprogramming.librarymanagment;

public class Book {

    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Issuing book
    public void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    // Return book
    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    // Show book details
    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Status: " + (issued ? "Issued" : "Available"));
    }
}
