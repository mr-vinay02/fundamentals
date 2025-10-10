package streams.terminaloperation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,75,81,61,61,21,62,61,512,512,75);

        // convert into List
        List<Integer> convertedList = numbers.stream()
                .toList();

        System.out.println(convertedList);

        // convert into Set
        Set<Integer> unique = numbers.stream().collect(Collectors.toSet());
        Set<Integer> sortedSet = numbers.stream().collect(Collectors.toCollection(TreeSet::new));

        System.out.println(unique);
        System.out.println(sortedSet);

        // convert into map
        Map<Integer,Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity() ,LinkedHashMap::new, Collectors.counting()));

        System.out.println(frequencyMap);

        Map<Integer,Long> basedOnValues = frequencyMap.entrySet().stream()
                .sorted((a,b)-> -a.getValue().compareTo(b.getValue()))
                .collect(Collectors.toMap(
                        n-> n.getKey(),
                        n-> n.getValue(),
                        (n1,n2)-> n1,
                        LinkedHashMap::new
                ));
        System.out.println(basedOnValues);

        // using joining method
        List<String> names = Arrays.asList("vinay","java");

        String string = names.stream()
                .collect(Collectors.joining());

        System.out.println(string);

        // using summingInt -> find sum
        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        // using paritioningBy
        Map<Boolean , List<Integer>> evenOrOdd = numbers.stream()
                .collect(Collectors.partitioningBy( n -> n % 2 == 0));

        System.out.println(evenOrOdd);

        //reducing
        int value = numbers.stream().collect(Collectors.reducing(1,(a,b)-> a + b));

        System.out.println(value);


    }
}
