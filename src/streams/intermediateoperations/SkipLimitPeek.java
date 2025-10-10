package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class SkipLimitPeek {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        numbers.stream()
                .peek(System.out::print)
                .skip(2)
                .peek(System.out::print)
                .limit(1)
                .forEach(System.out::println);

    }
}
