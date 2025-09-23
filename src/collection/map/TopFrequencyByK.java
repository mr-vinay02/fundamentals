package collection.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopFrequencyByK {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10 , 10, 20, 20 ,20, 30, 40, 50));

        int tops = 2;

        Map<Integer,Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()));

        frequency.forEach((k,v) -> System.out.println(k+" "+v));

        frequency = frequency.entrySet().stream()
                .sorted((a,b)->-a.getValue().compareTo(b.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                       LinkedHashMap::new
                ));

        frequency.forEach((k,v)-> System.out.println(k+"  "+v));


        int loop = 1;
        for (Map.Entry<Integer,Long> entry : frequency.entrySet()) {

            if(tops >= loop)
                 System.out.println("Top " +loop+" Frequent element is   "+entry.getKey() +"   ");
            loop++;

        }




    }
}
