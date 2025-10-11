package streams.problems.movieratingsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ManagingMovie {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie(1, "Inception", 8.8, "Sci-Fi"),
                new Movie(2, "The Godfather", 9.2, "Crime"),
                new Movie(3, "Titanic", 7.8, "Romance"),
                new Movie(4, "The Dark Knight", 9.0, "Action"),
                new Movie(5, "Forrest Gump", 8.8, "Drama"),
                new Movie(6, "Interstellar", 8.6, "Sci-Fi"),
                new Movie(7, "Parasite", 8.6, "Action"),
                new Movie(8, "Avengers: Endgame", 8.4, "Superhero"),
                new Movie(9, "Joker", 8.5, "Drama"),
                new Movie(10, "Toy Story", 8.3, "Animation"),
                new Movie(11, "Gladiator", 8.5, "Action"),
                new Movie(12, "Coco", 8.4, "Animation"),
                new Movie(13, "The Matrix", 8.7, "Sci-Fi"),
                new Movie(14, "Frozen", 7.5, "Action"),
                new Movie(15, "La La Land", 8.0, "Musical")
        );

        //Find all movies with rating > 8 and belonging to "Action".
        movies.stream()
                .filter(m -> m.getRating() > 8.0)
                .filter(m -> m.getGenre().equals("Action"))
                .forEach(System.out::println);


        System.out.println("These are the top 3 rating movies : ");
        // Get the top 3 highest-rated movies.
        movies.stream()
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                .limit(3)
                .forEach(System.out::println);

        //Find if there is at least one "Comedy" movie.
        boolean ifComedy = movies.stream()
                .anyMatch(m -> m.getGenre().equals("Comedy"));

        System.out.println(ifComedy);


        // Use Optional<Movie> to return the best-rated movie, or "No movies found" if the list is empty.
        Optional<Movie> bestRatedMovie = movies.stream()
                .max(Comparator.comparingDouble(Movie::getRating).reversed());

        bestRatedMovie.ifPresentOrElse(System.out::println,() -> System.out.println("List is EMPTY"));


    }

}
