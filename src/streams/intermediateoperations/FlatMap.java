package streams.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<List<String>> listOfString = Arrays.asList(Arrays.asList("vinay","ullas"),Arrays.asList("vinay","ullas"));

        List<String> names = listOfString.stream()
                .flatMap(Collection::stream)
                .toList();

        // makes single list
        System.out.println(names);

        names.forEach(System.out::println);


    }
}
