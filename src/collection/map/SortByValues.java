package collection.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByValues {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,10,20, 20, 30, 40, 50));

        Map<Integer,Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Frequency before sorting :");
        System.out.println(frequency);


         Map<Integer,Long> sorted = frequency.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));

        System.out.println("Frequency after sorting :");
        System.out.println(sorted);



    }
}
