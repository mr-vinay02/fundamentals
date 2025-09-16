package arrayproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyAndDuplicatesInArray {

    public static void main(String[] args) {

        int[] array = {10,20,30,10,10,10,50,30,30,20};


        Map<Integer,Long> frequency=Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new ,Collectors.counting()));

        frequency.forEach((k,v) -> System.out.println(k +"-->"+v));

        System.out.println("Duplicates in an Array :");

        //  Using loops
        for(Map.Entry<Integer,Long> entry: frequency.entrySet()){
            if(entry.getValue() > 1)
                System.out.print(entry.getKey()+"  ");
        }
        System.out.println();

        // Using Streams
        List<Integer> Duplicates= frequency.entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .map(i -> i.getKey())
                .collect(Collectors.toList());

        System.out.println(Duplicates);

    }
}
