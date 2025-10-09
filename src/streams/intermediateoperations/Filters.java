package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class Filters {
    public static void main(String[] args) {

        // filter -> predicate : 1 input -> return boolean

        List<Integer> numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        numbers.stream()
                .filter(n -> n % 2== 0)
                .forEach( (a)-> System.out.print(a+" "));
    }
}
