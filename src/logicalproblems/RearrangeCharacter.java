package logicalproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RearrangeCharacter {

    static  public String makingRearrange(String input)
    {
        Map<Character,Long> frequencyCount = input.chars()
            .mapToObj( i -> (char) i)
            .collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));

        PriorityQueue<Map.Entry<Character,Long>> maxHeap = new PriorityQueue<>((a,b ) -> Long.compare(b.getValue(), a.getValue()));

        maxHeap.addAll(frequencyCount.entrySet());

        System.out.println(maxHeap);

        StringBuilder result = new StringBuilder();

        Map.Entry<Character,Long> prev = null;

        while (!maxHeap.isEmpty())
        {
            Map.Entry<Character,Long> current = maxHeap.poll();

            result.append(current.getKey());
            current.setValue(current.getValue()-1);

            if(prev != null && prev.getValue() > 0)
                maxHeap.offer(prev);

            prev = current;


        }
        return  result.toString() ;

    }

    public static void main(String[] args) {

        String input = "aaabbc";

        String result = makingRearrange(input);

        System.out.println(result);



    }
}
