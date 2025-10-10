package streams.convertingintostreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StatementToStreams {
    public static void main(String[] args) {

        String statement = "Vinay is a good developer";

        Map<String, List<String>> maps =   Arrays.stream(statement.split(" "))
                .collect(Collectors.groupingBy(i -> i ));

        System.out.println(maps);


        String string = "VINAY BASAVARAJ";

        Map<Character,Long> frequency = string.toLowerCase().chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(i -> i , TreeMap::new,  Collectors.counting()));

        System.out.println(frequency);



    }
}
