package collection.map;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {


        String input = "Hey! java Vinay is a good java developer";

        Map<String,Long> wordFrequency = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(word -> word ,Collectors.counting()));

        wordFrequency.forEach((k,v) -> System.out.println(k +"   "+v ));

    }
}
