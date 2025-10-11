package streams.problems.librarymanagement;

import java.util.*;
import java.util.stream.Collectors;

public class Management {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book(101, "Java Programming", "James Gosling", 499.99),
                new Book(102, "Effective Java", "Joshua Bloch", 899.50),
                new Book(103, "Clean Code", "Robert C. Martin", 750.00),
                new Book(104, "Head First Java", "Kathy Sierra", 450.00),
                new Book(105, "Spring in Action", "Craig Walls", 820.75),
                new Book(106, "Design Patterns", "Erich Gamma", 970.00),
                new Book(107, "Data Structures in Java", "Narasimha Karumanchi", 580.40),
                new Book(108, "Java: The Complete Reference", "Herbert Schildt", 350.00),
                new Book(109, "Core Java Volume I", "Cay S. Horstmann", 870.25),
                new Book(110, "Algorithms", "Robert Sedgewick", 290.00)
        ));



        //Find all books priced above 500 and sort them by price.
        books.stream()
                .filter(a->a.getPrice() > 500)
                .sorted((a,b) -> Double.compare(b.getPrice(),a.getPrice()))
                .forEach(System.out::println);



        //Collect unique authors into a Set.
        Set<String> authors = books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());

        System.out.println(authors);

        // Find the most expensive book and return it as Optional<Book>.
        //○ If present, print details.
        //○ If not present, print "No books available".ve
        Optional<Book> expensiveBook = books.stream()
                .sorted((a,b) -> Double.compare(b.getPrice(),a.getPrice()))
                .findFirst();

        expensiveBook.ifPresentOrElse(System.out::println,() -> System.out.println("No books available"));
    }
}
