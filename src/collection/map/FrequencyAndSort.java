package collection.map;

import java.util.*;

public class FrequencyAndSort {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(10,20,30,30,40,30,20,30,10,50));

        Map<Integer,Integer> frequency = new LinkedHashMap<>();

        for(Integer key : elements){
            if(!frequency.containsKey(key)){
                frequency.put(key, frequency.getOrDefault(key,0)+1);
            } else if (frequency.containsKey(key)){
                frequency.put(key, frequency.getOrDefault(key,0)+1);
            }

        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(frequency.entrySet());

        list.sort((a,b)->b.getValue() - a.getValue());

        list.stream()
                .forEach(System.out::println);



    }
}
