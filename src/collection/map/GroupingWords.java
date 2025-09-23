package collection.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWords {
    public static void main(String[] args) {

        String input = "Hey! java Vinay is a good java developer";

        Map<Character, List<String>> wordFrequency = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(i -> i.charAt(0) ));

        wordFrequency.forEach((k,v) -> System.out.println(k +"   "+v ));

    }
}
