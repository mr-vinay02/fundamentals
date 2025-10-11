package streams.problems.librarymanagement;

public class Book {
    private int book_Id;
    private String title;
    private String author;
    private double price;

    public Book(int book_Id, String title, String author, double price) {
        this.book_Id = book_Id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_Id=" + book_Id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
