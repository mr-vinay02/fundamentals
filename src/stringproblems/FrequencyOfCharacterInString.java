package stringproblems;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {

        String word = "programming";


    // Using Streams
        Map<Character, Long> frequency = word.chars()
                                            .mapToObj(i -> (char)i)
                                            .collect(Collectors.groupingBy(i -> i,Collectors.counting()));

        frequency.forEach((k,v) -> System.out.println(k+"  --->  "+v));



    }
}
