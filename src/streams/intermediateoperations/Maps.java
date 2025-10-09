package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        squares.forEach(System.out::println);
    }
}
