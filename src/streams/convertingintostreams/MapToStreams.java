package streams.convertingintostreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToStreams {
    public static void main(String[] args) {

        String string = "developer";

        Map<Character,Long> frequency = string.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy( i -> i , Collectors.counting()));

        System.out.println(frequency);

        frequency.entrySet().stream()
                .filter(a->a.getValue() > 1)
                .limit(2)
                .forEach(System.out::println);
     }
}
