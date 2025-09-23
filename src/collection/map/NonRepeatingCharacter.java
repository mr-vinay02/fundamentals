package collection.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {

        String input = "programming";

        Map<Character,Long> frequency = input.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        frequency.forEach((k,v) -> System.out.println(k+" "+v));


        System.out.println("First Non-Repeating Character :");
        for(Map.Entry<Character,Long> entry : frequency.entrySet())
        {
             if(entry.getValue() == 1)
             {
                 System.out.println(entry.getKey());
                 break;
             }
        }
    }
}
