package collection.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {

        List<Integer>  Elements = Arrays.asList(10,20,20,50,50,70,90,6,45,50,78,50,20,45);

        Map<Integer,Long> frequency = Elements.stream()
                .collect(Collectors.groupingBy(i -> i, TreeMap::new ,Collectors.counting()));

        frequency.forEach((k,v)-> System.out.println(k +"   "+v));


        System.out.println("Duplicates Elements :");
        for(Map.Entry<Integer,Long> entry : frequency.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
