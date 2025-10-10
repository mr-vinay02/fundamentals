package streams.convertingintostreams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionsToStreams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        numbers.stream()
                .filter( n -> n % 2 == 0)
                .forEach(System.out::println);


        Set<String> names = new LinkedHashSet<>();
        names.add("Vinay");
        names.add("archana");
        names.add("Ulass");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
