package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        // Distinct -> removes the duplicates
        List<Integer> numbers = Arrays.asList(10,20,30,10,20,30);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
