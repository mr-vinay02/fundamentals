package collection.arraylist;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedElement {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(45,24,54,45,21,81,24,79,37));

        Map<Integer,Long> frequency = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        frequency.forEach((k,v)-> System.out.println(k +"  " +v));

        for (Map.Entry<Integer,Long> entry : frequency.entrySet() )
        {
            if(entry.getValue()==1) {
                System.out.println("First Non Repeating character :" + entry.getKey());
                break;
            }
        }


    }
}
