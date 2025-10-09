package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        // increasing order
        System.out.println("Increasing order :");
        numbers.stream()
                .sorted((a,b) -> a.compareTo(b))
                .forEach(a -> System.out.print(a +"  "));

        System.out.println("\nDecreasing order :");
        numbers.stream()
                .sorted((a,b) -> -a.compareTo(b))
                .forEach(a -> System.out.print(a +"  "));


        System.out.println();
        System.out.println("\nN Largest element :");
        int n = 5;
        numbers.stream()
                .sorted()
                .distinct()
                .skip(n-1)
                .limit(1)
                .forEach(a -> System.out.print(a +"  "));
    }
}
