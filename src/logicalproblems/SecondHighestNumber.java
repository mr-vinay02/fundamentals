package logicalproblems;

import java.util.*;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int[] array  = {3, 1, 4, 4, 5, 5, 2};

        Set set = new TreeSet();

        for(int element : array)
        {
            set.add(element);
        }
        set.forEach(System.out::print);
        System.out.println();
        List<Integer> numbers = new ArrayList<>(set);
        Integer secondHighestNumber = numbers.get(numbers.size()-2);
        System.out.println(secondHighestNumber);
    }
}
